package com.javaex.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.javaex.vo.UserVo;

public class UserDao {
//공통영역	
		// 필드
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		UserVo userVo = null;
		int count = 0;
	
		private String driver = "oracle.jdbc.driver.OracleDriver";
		private String url = "jdbc:oracle:thin:@localhost:1521:xe";
		private String id = "webdb";
		private String pw = "webdb";
	
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
		
//회원가입
		public int insert(UserVo userVo) {
	
			getConnection();
			
			try {
				// SQL문 준비
				// 문자열
				String query = "";
				query += " insert into users ";
				query += " values (seq_users_no.nextval, ?, ?, ?, ?) ";
				
				// 문자열을 쿼리문으로
				pstmt = conn.prepareStatement(query);
				
				// 바인딩
				pstmt.setString(1, userVo.getId());
				pstmt.setString(2, userVo.getPassword());
				pstmt.setString(3, userVo.getName());
				pstmt.setString(4, userVo.getGender());
				
				// 실행
				count = pstmt.executeUpdate();
				
				// 결과처리
				
			} catch (SQLException e) {
				System.out.println("error:" + e);
			}
			close();
			
			return count;
		}
//로그인		
		public UserVo getUser(String id, String password) {
			
			getConnection();
			
			try {
				// SQL문 준비
				// 문자열
				String query = "";
				query += " select no, ";
				query += "        name";
				query += " from users ";
				query += " where id= ? ";
				query += " and password = ? ";
				
				// 문자열을 쿼리문으로
				pstmt = conn.prepareStatement(query);
				
				// 바인딩
				pstmt.setString(1, id);
				pstmt.setString(2, password);
				
				// 실행
				rs = pstmt.executeQuery();
				
				// 결과처리
				while(rs.next()) {
					int no = rs.getInt("no");
					String name = rs.getString("name");
					
					userVo = new UserVo();
					userVo.setNo(no);
					userVo.setName(name);
				}
				
			} catch (SQLException e) {
				System.out.println("error:" + e);
			}
			close();
			return userVo;
		}
//회원 1명 번호로	
		public UserVo getUserNo(int num) {
			
			getConnection();
			
			try {
				// SQL문 준비
				// 문자열
				String query = "";
				query += " select no, ";
				query += "        id, ";
				query += "        password, ";
				query += "        name, ";
				query += "        gender ";
				query += " from users ";
				query += " where no= ? ";
				
				// 문자열을 쿼리문으로
				pstmt = conn.prepareStatement(query);
				
				// 바인딩
				pstmt.setInt(1, num);
	
				// 실행
				rs = pstmt.executeQuery();
				
				// 결과처리
				while(rs.next()) {
					int no = rs.getInt("no");
					String id = rs.getString("id");
					String password = rs.getString("password");
					String name = rs.getString("name");
					String gender = rs.getString("gender");
					
					userVo = new UserVo(no, id , password, name, gender);
	
				}
				
			} catch (SQLException e) {
				System.out.println("error:" + e);
			}
			close();
			return userVo;
		}
		
// 회원정보 수정
		public int Update(UserVo userVo) {
		
			getConnection();
	
			try {
	
				// 3. SQL문 준비 / 바인딩 / 실행
				String query = ""; // 쿼리문 문자열만들기, ? 주의
				query += " update users ";
				query += " set password = ? , ";
				query += "     name = ? , ";
				query += "     gender = ? ";
				query += " where no = ? ";
	
				pstmt = conn.prepareStatement(query); // 쿼리로 만들기
	
				pstmt.setString(1, userVo.getPassword()); // ?(물음표) 중 1번째, 순서중요
				pstmt.setString(2, userVo.getName()); // ?(물음표) 중 2번째, 순서중요
				pstmt.setString(3, userVo.getGender()); // ?(물음표) 중 3번째, 순서중요
				pstmt.setInt(4, userVo.getNo()); // ?(물음표) 중 4번째, 순서중요
	
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


