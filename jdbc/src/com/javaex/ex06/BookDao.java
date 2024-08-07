package com.javaex.ex06;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class BookDao {
	
		public void bookInsert(BookVo bookVo) {

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

			  // 3. SQL문 준비 / 바인딩 / 실행  *****
			
			//문자열 만들기 --> ? 주의
			String query ="";
			//query = query+ "문자열"
		    query += " insert into book ";                        //=+ " "띄워쓰기 잘해줄것
		    query += " values(seq_book_id.nextval, ?, ?, ?, ? ) ";   //--> 물음표로 설정
		   
		
		    // 문자열 쿼리문으로 만들기
		    pstmt = conn.prepareStatement(query);   
		    
		    //바인딩
		    //바인딩
		    pstmt.setString(1, bookVo.getTitle());   //첫번째 물음표의 데이터
		    pstmt.setString(2, bookVo.getPubs());//두번째 물음표의 데이터
		    pstmt.setString(3, bookVo.getPubDate());
		    pstmt.setInt(4, bookVo.getAuthorId());
		    
		    //실행
		    int count = pstmt.executeUpdate();
		    
		    // 4.결과처리
		    System.out.println(count+ "건이 저장되었습니다.");
		    
		    
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
	
	public void bookDelete(int index) {
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
		    query += " delete from book ";                        //=+ " "띄워쓰기 잘해줄것
		    query += " where book_id = ? ";   //--> 물음표로 설정
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
	
	public void bookUpdate(int index, BookVo bookVo) { //(수정내용 작성)
		
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
 			query += " update book ";
 			query += " set book_id = ?, ";
 			query += "     title = ?, ";
 			query += "     pubs = ?, ";
 			query += "     pub_date = ?, ";
 			query += "     author_id = ? ";
 			query += " where book_id = ? ";
 			System.out.println(query);
 															
		    //문자열 쿼리문으로 만들기
		         //--> 쿼리문으로 설정
		    pstmt = conn.prepareStatement(query);
 			
		    //바인딩
		    pstmt.setInt(1, bookVo.getBookId()); 
		    pstmt.setString(2, bookVo.getTitle());        
		    pstmt.setString(3, bookVo.getPubs());  
		    pstmt.setString(4, bookVo.getPubDate()); 
		    pstmt.setInt(5, bookVo.getAuthorId()); 
		    pstmt.setInt(6, index); 
		  
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
	
	public List<BookVo> bookSelect() {  //주소값 적어주기
	//작가리스트 가져오기
	List<BookVo> bookList = new ArrayList<BookVo>();
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
		 
	        	BookVo vo = new BookVo(book_id, title, pubs, pub_date, author_id, author_name, author_desc );
	        	bookList.add(vo);
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
		return bookList;
	}
	
}
		

