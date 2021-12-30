package com.javaex.ex04;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class AuthorDao {
	
	//필드 
	private Connection conn = null;
	private PreparedStatement pstmt = null;
	private ResultSet rs = null;
	private String driver = "oracle.jdbc.driver.OracleDriver";
	private String url = "jdbc:oracle:thin:@localhost:1521:xe";
	private String id = "webdb";
	private String pw = "webdb";
	
	public AuthorDao() { // 생략가능
	}
	
	private void getConnection() {   //private 같은 클래스내에서만 쓰기
	  // 1. JDBC 드라이버 (Oracle) 로딩
		try {
			Class.forName(driver);
		
		    // 2. Connection 얻어오기
			conn = DriverManager.getConnection(url, id, pw);
			
		} catch (ClassNotFoundException e) {
		    System.out.println("error: 드라이버 로딩 실패 - " + e);
		} catch (SQLException e) {
		    System.out.println("error:" + e);
		}
	}
	
	private void Close() {
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
		
	public void authorInsert(AuthorVo authorVo) {
		
		
		 // 1. JDBC 드라이버 (Oracle) 로딩 2. Connection 얻어오기
		this.getConnection();
		
		try {
		    // 3. SQL문 준비 / 바인딩 / 실행
			String query ="";
			//sql 디벨로퍼에서 확인후 가져오기
		    query += " insert into author ";                        //=+ " "띄워쓰기 잘해줄것
		    query += " values(seq_author_id.nextval, ?, ? ) ";      //--> 물음표로 설정
		   
		    
		    // 문자열 쿼리문으로 만들기
		    pstmt = conn.prepareStatement(query);   
		    
		    //바인딩
		    pstmt.setString(1, authorVo.getAuthorName());   //첫번째 물음표의 데이터
		    pstmt.setString(2, authorVo.getAuthorDesc());   
		    
		    //실행
		    int count = pstmt.executeUpdate();
		    
		    // 4.결과처리
		    System.out.println(count + "건이 저장되었습니다.");
		    
		} catch (SQLException e) {
		    System.out.println("error:" + e);
		}
		// 5. 자원정리
		this.Close();
	}
	
	public void authorDelete(int index) {
		
		// 1. JDBC 드라이버 (Oracle) 로딩 2. Connection 얻어오기
		this.getConnection();
		
		try {
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
		    
		} catch (SQLException e) {
		    System.out.println("error:" + e);
		}
			// 5. 자원정리
			this.Close();
		}
	
	
	public void authorUpdate(AuthorVo authorVo) { //(수정내용 작성)
		
		// 1. JDBC 드라이버 (Oracle) 로딩 2. Connection 얻어오기
		this.getConnection();
				
		try {
		    // 3. SQL문 준비 / 바인딩 / 실행  *****
 			String query ="";                               //띄워쓰기 간격 잘보기
 			query += " update author ";
 			query += " set author_name = ?, ";
 			query += "     author_desc = ? ";
 			query += " where author_id = ? ";
 			//System.out.println(query);
 															
		    //문자열 쿼리문으로 만들기
		         //--> 쿼리문으로 설정
		    pstmt = conn.prepareStatement(query);
 			
		    //바인딩
		    pstmt.setString(1, authorVo.getAuthorName());
		    pstmt.setString(2, authorVo.getAuthorDesc());    //두번째 물음표의 데이터
		    pstmt.setInt(3, authorVo.getAuthorId());          //--> 쿼리문으로 설정
		  
		    //실행
		    int count = pstmt.executeUpdate(); //쿼리문 실행
			
		    // 4.결과처리
		    System.out.println(count + "건이 수정되었습니다.");
		    
		    
		}catch (SQLException e) {
		    System.out.println("error:" + e);
		} 
		// 5. 자원정리
		 this.Close();
	}
	
	//작가리스트 가져오기
	public List<AuthorVo> authorSelect() {  //주소값 적어주기
		
        List<AuthorVo> authorList = new ArrayList<AuthorVo>();
		 
        // 1. JDBC 드라이버 (Oracle) 로딩 2. Connection 얻어오기
     	this.getConnection();
	
		try {
		    // 3. SQL문 준비 / 바인딩 / 실행  *****
			
			//문자열 만들기 --> ? 주의
			String query ="";
		    query += " select author_id ID, ";      //sql 별명으로도 가능        
		    query += "        author_name, ";
		    query += "        author_desc ";
		    query += " from author ";
		   // System.out.println(query);
		    
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
	        
		} catch (SQLException e) {
		    System.out.println("error:" + e);
		}
	
				// 5. 자원정리
				this.Close();
			//출력	
			return authorList;
	}
	
}
	

	
	

