package com.javaex.ex01;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class AuthorUpdate {
	public static void main(String[] args) {
			
			// 0. import java.sql.*;
			Connection conn = null;
			
			PreparedStatement pstmt = null;
			
			try {
			    // 1. JDBC 드라이버 (Oracle) 로딩
				Class.forName("oracle.jdbc.driver.OracleDriver");    //-->오라클인 경우
				
			    // 2. Connection 얻어오기
				String url = "jdbc:oracle:thin:@localhost:1521:xe";  //-->IP 설정
				conn = DriverManager.getConnection(url, "webdb", "webdb"); //-->ID, 패스워드 설정
	 			System.out.println("접속성공");
	
			    // 3. SQL문 준비 / 바인딩 / 실행  *****
				
				//문자열 만들기 --> ? 주의                   	//query = query+ "문자열"
			                                                    //--> 물음표로 설정
	 			String query ="";                               //띄워쓰기 간격 잘보기
	 			query += " update author ";
	 			query += " set author_name = ?, ";
	 			query += "     author_desc = ? ";
	 			query += " where author_id = ? ";
	 			System.out.println(query);
	 															
			    //문자열 쿼리문으로 만들기
			         //--> 쿼리문으로 설정
			    pstmt = conn.prepareStatement(query);
	 			
			    //바인딩
			    pstmt.setString(1, "김문열");         //첫번째 물음표의 데이터
			    pstmt.setString(2, "삼국지 작가");    //두번째 물음표의 데이터
			    pstmt.setInt(3, 1);                   //세번째 물음표의 데이터 숫자로만 했다 Int
	
			    
			    //실행
			    int count = pstmt.executeUpdate(); //쿼리문 실행
				
			    // 4.결과처리
			    System.out.println(count + " 건이 수정되었습니다.");
			    
			    
			} catch (ClassNotFoundException e) {
			    System.out.println("error: 드라이버 로딩 실패 - " + e);
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

