package com.javaex.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.javaex.dao.BoardDao;
import com.javaex.vo.BoardVo;
import com.javaex.vo.UserVo;

@Service
public class BoardService {

		@Autowired
		private BoardDao boardDao;
		private BoardVo boardVo;
		
		private int count  = 0;
		
		public List<BoardVo> getList() {

			return boardDao.getList();
		}

}


