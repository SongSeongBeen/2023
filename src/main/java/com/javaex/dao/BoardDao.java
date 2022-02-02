package com.javaex.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.javaex.vo.BoardVo;

@Repository
public class BoardDao {
	
	@Autowired
	private SqlSession sqlSession;
	private int count = 0;
	

//게시판 리스트	
	public List<BoardVo> getList(){
		System.out.println("BoardDao.getList()");
		
		List<BoardVo> boardList = sqlSession.selectList("board.selectList");
		
		return boardList;
	}
	
//게시판 읽기
	public BoardVo boardRead(int no){
		System.out.println("BoardDao.boardRead()");
		
		return sqlSession.selectOne("board.boardRead", no);
	}
	
//조회수 증가
	public void hit(int no) {
		System.out.println("BoardDao.hit()");
		
		sqlSession.update("board.hit", no);
	} 
	
//글쓰기
	public int boardWrite(BoardVo boardVo) {
		System.out.println("BoardDao.boardWrite()");
		
		count= sqlSession.insert("board.boardInsert", boardVo);
		
		System.out.println(count+"건이 증가 했습니다.");
		
		return count;
	} 
	
//글수정	
	public int boardUpdate(BoardVo boardVo) {
		System.out.println("BoardDao.boardUpdate");
		
		count= sqlSession.update("board.boardUpdate", boardVo);
		
		System.out.println(count+"건이 수정 되었습니다.");
		
		return count;
	}
	
//글삭제
	public int boardDelete(int no) {
		System.out.println("BoardDao.boardDelete");
		
		count= sqlSession.delete("board.boarbDelete", no);
		
		System.out.println(count+"건이 삭제 되었습니다.");
		
		return count;
	} 
	
	
}
