package com.javaex.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.javaex.dao.BoardDao;
import com.javaex.vo.BoardVo;

@Service
public class BoardService {

		@Autowired
		private BoardDao boardDao;

//게시판 리스트
		public List<BoardVo> getList() {

			return boardDao.getList();
		}

//게시판 글읽기
		public BoardVo boardRead(int no) {
			
			boardDao.hit(no);
			return boardDao.boardRead(no);
		}
		
//글쓰기
		public void boardWrite(BoardVo boardVo) {
			boardDao.boardWrite(boardVo);
		}
		
//글수정
		public void boardUpdate(BoardVo boardVo) {
			boardDao.boardUpdate(boardVo);
		}
		
//글삭제
		public void boardDelete(int no) {
			boardDao.boardDelete(no);
		}
		
}


