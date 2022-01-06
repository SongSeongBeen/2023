package com.javaex.dao;

import java.util.List;

import com.javaex.vo.GuestbookVo;

public class test {

	public static void main(String[] args) {
	
			GuestbookDao guestbookDao = new GuestbookDao();
			List<GuestbookVo> gbList= guestbookDao.getList();
			
			System.out.println(gbList.toString());
	}

}
