package com.javaex.ex02;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class BookDelete {
	
public static void main(String[] args) {
		
		// 0. import java.sql.*;
		Connection conn = null;
		PreparedStatement pstmt = null;
		
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
			//query = query+ "문자열"
		    query += " delete from author ";                        //=+ " "띄워쓰기 잘해줄것
		    query += " where author_id = ? ";   //--> 물음표로 설정
		    System.out.println(query);
		    
		    
		    //문자열 쿼리문으로 만들기
		    pstmt = conn.prepareStatement(query);          //--> 쿼리문으로 설정
		    
		    //바인딩
		    pstmt.setInt(1, 1);   //첫번째 물음표의 데이터
		    
		    
		    //실행
		    int count = pstmt.executeUpdate(); //쿼리문 실행
			
		    // 4.결과처리
		    System.out.println(count + "건이 삭제되었습니다.");
		    
		    
		} catch (ClassNotFoundException e) {
		    System.out.println("error: 드라이버 로딩 실패 -" + e);
		} catch (SQLException e) {
		    System.out.println("error:" + e);
		} finally {
		   
		    // 5. 자원정리
		    try {               
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



