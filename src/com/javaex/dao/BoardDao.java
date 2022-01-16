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
		BoardVo boardVo = null;
		
		int count = 0;
		int userNo = 0;

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
				query += " select  bo.no no, ";
				query += "         bo.title title, ";
				query += "         bo.content content, ";
				query += "         us.name name, ";
				query += "         bo.hit hit, ";
				query += "         to_char(bo.reg_date, 'YYYY-MM-DD hh:mi:ss') reg_date, ";
				query += "         bo.user_no user_no ";
				query += " from board bo, users us ";
				query += " where bo.user_no = us.no ";
				query += " order by reg_date desc ";
				//System.out.println(query);

				pstmt = conn.prepareStatement(query); // 쿼리로 만들기

				rs = pstmt.executeQuery(); // 쿼리문 실행

				// 4.결과처리
				while(rs.next()) {
					int no = rs.getInt("no");  //별로으로 가능하다
					String title = rs.getString("title");
					String content = rs.getString("content");
					String name = rs.getString("name");
					int  hit = rs.getInt("hit");
					String reg_date = rs.getString("reg_date");
					int  userNo= rs.getInt("user_no");
					
					BoardVo boardVo = new BoardVo(no, title, content, name, hit, reg_date, userNo);
					boardList.add(boardVo);
				}

			} catch (SQLException e) {
				System.out.println("error:" + e);
			}
			close();
			return boardList;
		} 		
	
//읽기
		public BoardVo getRead(int num) {

			getConnection();
			
			try {
				// SQL문 준비
				String query = "";
				query += " select   bo.no no, ";
				query += "          us.name name, ";
				query += "          bo.hit hit, ";
				query += "          bo.title title, ";
				query += "          bo.content content, ";
				query += "          to_char(bo.reg_date, 'YYYY-MM-DD HH:MI') reg_date, ";
				query += "          bo.user_no user_no";
				query += " from     board bo, users us ";
				query += " where    bo.user_no = us.no ";
				query += " and		bo.no = ? ";

				// 쿼리
				pstmt = conn.prepareStatement(query);

				// 바인딩
				pstmt.setInt(1, num);
				
				// 실행
				rs = pstmt.executeQuery();
				
				// 결과처리
				while (rs.next()) {
					int no = rs.getInt("no");
					String name = rs.getString("name");
					int hit = rs.getInt("hit");
					String title = rs.getString("title");
					String content = rs.getString("content");
					String regDate = rs.getString("reg_date");
					int userNo = rs.getInt("user_no");
					
					boardVo = new BoardVo(no, name, hit, regDate, title, content, userNo);
				}
				
			} catch (SQLException e) {
				System.out.println("error:" + e);
			}

			close();
			return boardVo;
		}
//조회수 증가		
		public int hit(int no) {
			getConnection();
			
			try {
				// SQL문 준비
				String query = "";
				query += " update board ";
				query += " set hit = hit +1 ";
				query += " where no = ? ";

				// 쿼리
				pstmt = conn.prepareStatement(query);

				// 바인딩
				pstmt.setInt(1, no);
				
				// 실행
				count = pstmt.executeUpdate();
				
				// 4.결과처리
				System.out.println(count + "건 증가되었습니다.");
				
			} catch (SQLException e) {
				System.out.println("error:" + e);
			}
			close();
			return count;
		}
		
//삭제		
		public int boardDelete(int no) {
			
			getConnection();

			try {
				// 3. SQL문 준비 / 바인딩 / 실행
				String query = ""; // 쿼리문 문자열만들기, ? 주의
				query += " delete from board ";
				query += " where no = ? ";
				
				pstmt = conn.prepareStatement(query); // 쿼리로 만들기

				pstmt.setInt(1, no);// ?(물음표) 중 1번째, 순서중요

				count = pstmt.executeUpdate(); // 쿼리문 실행

				// 4.결과처리
				System.out.println(count + "건 삭제되었습니다.");

			} catch (SQLException e) {
				System.out.println("error:" + e);
			}
			close();
			return count;
		}
		
//글쓰기
		public int write(BoardVo boardVo) {

			getConnection();

			try {

				// 3. SQL문 준비 / 바인딩 / 실행
				String query = ""; // 쿼리문 문자열만들기, ? 주의
				query += " insert into board ";
				query += " values(seq_board_no.nextval, ?, ?, 0, sysdate, ?)";


				pstmt = conn.prepareStatement(query); // 쿼리로 만들기

				pstmt.setString(1, boardVo.getTitle()); // ?(물음표) 중 1번째, 순서중요
				pstmt.setString(2, boardVo.getContent()); // ?(물음표) 중 2번째, 순서중요
				pstmt.setInt(3, boardVo.getUserNo()); // ?(물음표) 중 3번째, 순서중요
			
				count = pstmt.executeUpdate(); // 쿼리문 실행

				// 4.결과처리
				System.out.println(count + "건 작성되었습니다.");

			} catch (SQLException e) {
				System.out.println("error:" + e);
			}

			close();
			return count;
		}
//글수정
		public int modify(BoardVo boardVo) {

			getConnection();

			try {

				// 3. SQL문 준비 / 바인딩 / 실행
				String query = ""; // 쿼리문 문자열만들기, ? 주의
				query += " update board ";
				query += " set    title = ? , ";
				query += "        content = ? , ";
				query += " where no= ? ";

				pstmt = conn.prepareStatement(query); // 쿼리로 만들기

				pstmt.setString(1, boardVo.getTitle()); // ?(물음표) 중 1번째, 순서중요
				pstmt.setString(2, boardVo.getContent()); // ?(물음표) 중 2번째, 순서중요
				pstmt.setInt(3, boardVo.getNo()); // ?(물음표) 중 3번째, 순서중요

				count = pstmt.executeUpdate(); // 쿼리문 실행

				// 4.결과처리
				// System.out.println(count + "건 수정되었습니다.");

			} catch (SQLException e) {
				System.out.println("error:" + e);
			}

			close();
			return count;
		}	
	

}
		

