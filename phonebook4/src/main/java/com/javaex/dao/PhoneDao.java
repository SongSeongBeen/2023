package com.javaex.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.javaex.vo.PersonVo;

@Repository
public class PhoneDao {

	@Autowired
	private SqlSession sqlSession;
	
//전체리스트 가져오기
	public List<PersonVo> getPersonList() {
		System.out.println("PhoneDao.getpersonList");
		List<PersonVo> personList = sqlSession.selectList("phonebook.selectList");
	
		return personList;
	}
//전화번호 추가	
	public int personInsert(PersonVo personVo) {
		System.out.println("PhoneDao.personInser");
		int count = sqlSession.insert("phonebook.insert", personVo);
		System.out.println(count+"건");
		return count;
		
	}
	
//삭제
	public int personDelete(int personId) {
		System.out.println("PhoneDao.personDelete");
		int count = sqlSession.delete("phonebook.delete", personId);
		System.out.println(count +"건");
		return count;
	}
	
//한명 가져오기	
	public PersonVo getPerson(int personId) {
		System.out.println("PhoneDao.getPerson");
		PersonVo personVo = sqlSession.selectOne("phonebook.updateForm", personId);
		System.out.println(personVo);
		return personVo;
	}
	
//수정
	public int personUpdate(PersonVo personVo) {
		System.out.println("PhoneDao.personUpdate");
		int count = sqlSession.update("phonebook.update", personVo);
		return count;
	}
	
/*	public PersonVo getPerson(int personId) {
		PersonVo personVo = null;

		try {

			// 3. SQL문 준비 / 바인딩 / 실행 --> 완성된 sql문을 가져와서 작성할것
			String query = "";
			query += " select  person_id, ";
			query += "         name, ";
			query += "         hp, ";
			query += "         company ";
			query += " from person ";
			query += " where person_id = ? ";

			pstmt = conn.prepareStatement(query); // 쿼리로 만들기

			pstmt.setInt(1, personId); // ?(물음표) 중 1번째, 순서중요

			rs = pstmt.executeQuery();

			// 4.결과처리
			rs.next();
			int id = rs.getInt("person_id");
			String name = rs.getString("name");
			String hp = rs.getString("hp");
			String company = rs.getString("company");

			personVo = new PersonVo(id, name, hp, company);

		} catch (SQLException e) {
			System.out.println("error:" + e);
		}

		close();

		return personVo;

	}


			
			

	
			
			
			public PersonVo getPerson(int personId) {
				PersonVo personVo = null;
			      
				getConnection();
			
				try {
			         // 3. SQL문 준비 / 바인딩 / 실행 --> 완성된 sql문을 가져와서 작성할것
					 String query = "";
					 query += " select  person_id, ";
					 query += "         name, ";
					 query += "         hp, ";
					 query += "         company ";
					 query += " from person ";
					 query += " where person_id = ? ";
					
					 pstmt = conn.prepareStatement(query); // 쿼리로 만들기
					
					 pstmt.setInt(1, personId); // ?(물음표) 중 1번째, 순서중요
					 
					 
					 rs = pstmt.executeQuery();
					
					 // 4.결과처리
					 rs.next();
					 int id = rs.getInt("person_id");
					 String name = rs.getString("name");
					 String hp = rs.getString("hp");
					 String company = rs.getString("company");
					
					        personVo = new PersonVo(id, name, hp, company);
					     
				} catch (SQLException e) {
			    	System.out.println("error:" + e);
				}
			
			      close();
			
			      return personVo;
			   }
*/
		
}
