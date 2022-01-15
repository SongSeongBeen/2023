package com.javaex.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.javaex.vo.BoardVo;

public class BoardDao {
//공통영역	
		// 필드
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;

		int count = 0;

		private String driver = "oracle.jdbc.driver.OracleDriver";
		private String url = "jdbc:oracle:thin:@localhost:1521:xe";
		private String id = "webdb";
		private String pw = "webdb";
		
	    //접속
		private void getConnection() {
			try {
				Class.forName(driver);

				conn = DriverManager.getConnection(url, id, pw);

			} catch (ClassNotFoundException e) {
				System.out.println("error: 드라이버 로딩 실패 - " + e);
			} catch (SQLException e) {
				System.out.println("error:" + e);
			}
		}
		
	    //닫기	
		public void close() {
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
//공통영역	
		
//게시판 리스트
		public List<BoardVo> getBoardList(){
				
			List<BoardVo> boardList = new ArrayList<BoardVo>();
		
			getConnection();

			try {
				// 3. SQL문 준비 / 바인딩 / 실행
				String query = "";
				query += " select  us.no no, ";
				query += " bo.title title, ";
				query += " bo.content content, ";
				query += " us.name name, ";
				query += " bo.hit hit, ";
				query += " to_char(bo.reg_date, 'YYYY-MM-DD hh:mi:ss') reg_date ";
				query += " from board bo, users us ";
				query += " where bo.no = us.no ";
				//System.out.println(query);

				pstmt = conn.prepareStatement(query); // 쿼리로 만들기

				//바인딩 생략? 없음

				rs = pstmt.executeQuery(); // 쿼리문 실행

				// 4.결과처리
				while(rs.next()) {
					int no = rs.getInt("no");  //별로으로 가능하다
					String title = rs.getString("title");
					String content = rs.getString("content");
					String name = rs.getString("name");
					int  hit = rs.getInt("hit");
					String reg_date = rs.getString("reg_date");
					
					BoardVo boardVo = new BoardVo(no, title, content, name, hit, reg_date);
					boardList.add(boardVo);
				}

			} catch (SQLException e) {
				System.out.println("error:" + e);
			}
			close();
			return boardList;
		} 		
			
		
}
