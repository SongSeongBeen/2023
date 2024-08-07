package com.javaex.ex02;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class AuthorDao {
	
	//생성자
	public AuthorDao() { 
		//생략가능 디폴트생성자
	}
	
	public void authorInsert(String authorName, String authorDesc) {
		
		// 0. import java.sql.*;
		Connection conn = null;
		PreparedStatement pstmt = null;
		//ResultSet rs = null;

		try {
		    // 1. JDBC 드라이버 (Oracle) 로딩
			Class.forName("oracle.jdbc.driver.OracleDriver");

		    // 2. Connection 얻어오기
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			conn = DriverManager.getConnection(url, "webdb", "webdb");

		    // 3. SQL문 준비 / 바인딩 / 실행
			String query ="";
			//sql 디벨로퍼에서 확인후 가져오기
		    query += " insert into author ";                        //=+ " "띄워쓰기 잘해줄것
		    query += " values(seq_author_id.nextval, ?, ? ) ";      //--> 물음표로 설정
		    System.out.println(query);
		    
		    // 문자열 쿼리문으로 만들기
		    pstmt = conn.prepareStatement(query);   
		    
		    //바인딩
		    pstmt.setString(1, authorName);   //첫번째 물음표의 데이터
		    pstmt.setString(2, authorDesc);
		    
		    //실행
		    int count = pstmt.executeUpdate();
		    
		    // 4.결과처리
		    System.out.println(count + "건이 저장되었습니다.");
		    
		    
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
	
	public void authorDelete(int index) {
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
		    
		
		    pstmt.setInt(1, index);   //Dao 받을 번호 index 처리
		
		    
		    //실행
		    int count = pstmt.executeUpdate(); //쿼리문 실행
			
		    // 4.결과처리
		    System.out.println(count + "건이 삭제되었습니다.(작가)");
		    
		    
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
	
	public void authorUpdate(int index, String authorName, String authorDesc) { //(수정내용 작성)
		
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
		    pstmt.setString(1, "authorName");         //첫번째 물음표의 데이터
		    pstmt.setString(2, "authorDesc");    //두번째 물음표의 데이터
		    pstmt.setInt(3, index);          //--> 쿼리문으로 설정
		  
		    //실행
		    int count = pstmt.executeUpdate(); //쿼리문 실행
			
		    // 4.결과처리
		    System.out.println(count + "건이 수정되었습니다.");
		    
		    
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
	
	//작가리스트 가져오기
	public List<AuthorVo> authorSelect() {  //주소값 적어주기
		
        List<AuthorVo> authorList = new ArrayList<AuthorVo>();
		
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
		    query += " select author_id ID, ";      //sql 별명으로도 가능        
		    query += "        author_name, ";
		    query += "        author_desc ";
		    query += " from author ";
		    System.out.println(query);
		    
		    //문자열 쿼리문으로 만들기
		    pstmt = conn.prepareStatement(query);
		    //바인딩 생략 --> 물음표 없음
		    rs = pstmt.executeQuery();
		    // 4. 결과처리
	        while(rs.next()) {
	        	/*
	        	int authorId=rs.getInt("ID");                  //sql 별명으로도 가능     
	        	String authorName = rs.getNString("author_name");     // 변수이름 = 컬럼명
	        	String authorDesc = rs.getNString("author_desc");
	        	*/
	        	
	        	int authorId = rs.getInt(1);
	        	String authorName = rs.getString(2);
	        	String authorDesc = rs.getString(3);
	        	
	        	AuthorVo vo = new AuthorVo(authorId, authorName, authorDesc);
	        	authorList.add(vo);
	        	
	        	//System.out.println("\t\t"+authorId+", \t\t"+authorName+", \t\t\t"+authorDesc);
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
		return authorList;
	}
	
}
	

	
	

