package com.javaex.dao;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.javaex.vo.BlogVo;

@Repository
public class BlogDao {
	
	@Autowired
	private SqlSession sqlSession;
	
	public BlogVo getBlog(String id) {
		return sqlSession.selectOne("blog.selectBlog", id);
	}
	public void setBlog(BlogVo blogVo) {
		sqlSession.insert("blog.insertBlog", blogVo);
	}
	public void update(BlogVo blogVo) {
		sqlSession.update("blog.update", blogVo);
	}
}
