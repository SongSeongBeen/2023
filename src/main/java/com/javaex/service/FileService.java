package com.javaex.service;

import java.util.UUID;

import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

@Service
public class FileService {
	
	public void restore(MultipartFile file) {
		
		System.out.println("FileService.restore()"+file.getOriginalFilename());
		
		//파일을 하드디스크에 저장(운영내용)
		
		//원본파일 이름
		String orgName = file.getOriginalFilename();
		
		//확장자
		                                           //점뒤에 다가져오기                         //점으로 위치 지정
		String exName = file.getOriginalFilename().substring(file.getOriginalFilename().lastIndexOf("."));
		
		//저장파일이름            //현재시간을 숫자로             //랜덤 이름 생성
		String saveName = System.currentTimeMillis() + UUID.randomUUID().toString();
		
		System.out.println(saveName);
	
		//DB에 저장 

			
	}
	
}
