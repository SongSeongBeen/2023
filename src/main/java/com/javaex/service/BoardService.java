package com.javaex.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

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

//리스트 페이징(10개)
		public Map<String, Object> getBoardList2(int crtPage){
			
			//페이지당 글개수
			int listCnt = 10;
			
			//현재페이지 처리
			crtPage = (crtPage>0) ? crtPage : (crtPage=1); 
			
			/*
			if(crtPage<0) {
				crtPage = 1;
			}
			*/
			//시작 글 번호
			int startRnum = (crtPage-1)*listCnt + 1; 
			//끝글 번호
			int endRnum = (startRnum+listCnt) -1;
			List<BoardVo> boardList = boardDao.selectList2(startRnum, endRnum);
			
			////페이징 버튼
			//전체 글 갯수 가져오기
			int totalCnt = boardDao.selectTotal();
			
			System.out.println(totalCnt);
			
			//페이지당 버튼 갯수
			int pageBtnCount = 5;
			
			int endPageBtnNo =(int) ( Math.ceil(crtPage/(double)pageBtnCount) )*pageBtnCount; 
			
			int startpageBtnNo = endPageBtnNo-(pageBtnCount-1);
			
			boolean next = false;
			
			
			//다음 화살표 유무
			if(endPageBtnNo*listCnt < totalCnt) {
				next = true;
			}else {//다음화살표가 안보이면 마지막 버튼값을 다시계산
				endPageBtnNo = (int) (Math.ceil(totalCnt/(double)listCnt));
			}
			boolean prev = false;
			//처음화살표 유무
			if (startpageBtnNo != 1) {
				prev = true;
			}
			
			Map<String, Object> pMap = new HashMap<String, Object>();
			pMap.put("prev", prev);
			pMap.put("startPageBtnNo", startpageBtnNo);
			pMap.put("endPageBtnNo", endPageBtnNo);
			pMap.put("next", next);
			pMap.put("boardList", boardList);
			System.out.print(pMap);
			
			return pMap;
			
		}
		
//게시판 글읽기+조회수 증가
		public BoardVo boardReadHit(int no) {
			
			boardDao.hit(no);
			return boardDao.boardRead(no);
			
//게시판 글읽기			
		}
		public BoardVo boardRead(int no) {
			
			return boardDao.boardRead(no);
		}
		
//글쓰기
		public void boardWrite(BoardVo boardVo) {
				
				boardDao.boardWrite(boardVo);
				
//			for(int i=1; i<=123; i++) {
//				boardVo.setTitle(i + "번째 글 제목입니다.");
//				boardVo.setContent(i + "번째 글 내용입니다.");
//				boardVo.setUserNo(1);
//				boardDao.boardWrite(boardVo);
//			}
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


