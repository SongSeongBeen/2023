package com.javaex.ex01;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class BookSelectAll {
	
	public static void main(String[] args) {
		
		List<BookAllVo> bookAllList = new ArrayList<BookAllVo>();
		// 0. import java.sql.*;
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null; 
		
		try {
		    // 1. JDBC 드라이버 (Oracle) 로딩
			Class.forName("oracle.jdbc.driver.OracleDriver");   //-->오라클인 경우
			
		    // 2. Connection 얻어오기
			String url = "jdbc:oracle:thin:@localhost:1521:xe";  //-->IP 설정
			conn = DriverManager.getConnection(url, "webdb", "webdb"); //-->ID, 패스워드 설정
 			System.out.println("접속성공");

		    // 3. SQL문 준비 / 바인딩 / 실행  *****
			
			//문자열 만들기 --> ? 주의
			String query ="";
		    query += " select bo.book_id, ";      //sql 별명으로도 가능        
		    query += "        bo.title, ";
		    query += "        bo.pubs, ";
		    query += "        to_char(bo.pub_date, 'YYYY-MM-DD'), ";
		    query += "        au.author_id, ";
		    query += "        au.author_name, ";
		    query += "        au.author_desc ";
		    query += " from book bo, author au ";
		    query += " where bo.author_id = au.author_id ";
		    System.out.println(query);
		    
		    //문자열 쿼리문으로 만들기
		    pstmt = conn.prepareStatement(query);
		    //바인딩 생략 --> 물음표 없음
		    rs = pstmt.executeQuery();
		    // 4. 결과처리
		    
		    while(rs.next()) {
            	
            	int book_id=rs.getInt(1);                  //sql 별명으로도 가능     
            	String title = rs.getString(2);     // 변수이름 = 컬럼명
            	String pubs = rs.getString(3);
            	String pub_date = rs.getString(4);
            	int author_id = rs.getInt(5);
            	String author_name = rs.getString(6);
            	String author_desc = rs.getString(7);
            	
            	BookAllVo vo = new BookAllVo(book_id, title, pubs, pub_date, author_id, author_name, author_desc );
	        	bookAllList.add(vo);
            	
            	//System.out.println(book_id+","+title+","+pubs+","+pub_date+","+author_id+","+author_name+","+author_desc);
		    }
		    for(int i=0; i<bookAllList.size(); i++) {
		    	 bookAllList.get(i).showInfo();
		    }

		    
		} catch (ClassNotFoundException e) {
		    System.out.println("error: 드라이버 로딩 실패 -" + e);
		} catch (SQLException e) {
		    System.out.println("error:" + e);
		} finally {
		   
		    // 5. 자원정리
		    try {   
		        if (rs != null) {
		            rs.close();
		        }
		        if (pstmt != null) {
		            pstmt.close();
		        }
		        if (conn != null) {
		            conn.close();
		        }
		    } catch (SQLException e) {
		        System.out.println("error:" + e);
		    }
		}
	}

}
