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
	private int connt = 0;
	
//전체리스트 가져오기
	public List<PersonVo> getPersonList() {
		System.out.println("PhoneDao.getpersonList");
		List<PersonVo> personList = sqlSession.selectList("phonebook.selectList");
	
		return personList;
	}
	
//전화번호 추가	
	public int personInsert(PersonVo personVo) {
		System.out.println("PhoneDao.personInser");
		sqlSession.insert("phonebook.insert", personVo);
		System.out.println(connt +"건");
		return connt;
	}
	
//삭제
	public int personDelete(int personId) {
		System.out.println("PhoneDao.personDelete");
		sqlSession.delete("phonebook.delete", personId);
		System.out.println(connt +"건");
		return connt;
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
		sqlSession.update("phonebook.update", personVo);
		return connt;
	}

		
}
