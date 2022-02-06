package com.javaex.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.javaex.vo.GalleryVo;

@Repository
public class GalleryDao {
	
	@Autowired
	private SqlSession sqlSession;
	private int count = 0;
//게시판 리스트	
	public List<GalleryVo> getGalleryList(){
		System.out.println("GalleryDao.getList()");
		
		List<GalleryVo> galleryList = sqlSession.selectList("gallery.selectGalleryList");
		
		return galleryList;
	}
//파일 업로드	
	public int upload (GalleryVo galleryVo) {
			System.out.println("GalleryDao.insertFile()"+galleryVo);
			count = sqlSession.insert("gallery.insertFile", galleryVo);
			System.out.println(count + "건이 추가 되었습니다.");
			return count;
	}

//번호
	public GalleryVo selectNo(int no) {
		return sqlSession.selectOne("gallery.selectNo", no);
		
	}
	
//삭제
	public int remove(int no) {
		count = sqlSession.selectOne("gallery.galleryDelete", no);
		System.out.println(count+"건이 삭제 되었습니다.");
		return count;
	}

}
