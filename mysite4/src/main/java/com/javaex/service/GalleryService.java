package com.javaex.service;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.javaex.dao.GalleryDao;
import com.javaex.vo.GalleryVo;

@Service
public class GalleryService {
	
	@Autowired
	private GalleryDao galleryDao;
	
//리스트	
	public List<GalleryVo> getGalleryList() {
		
		System.out.println("guestbookService.getGusetList()");
		
		return galleryDao.getGalleryList();
	}
	
//파일 업로드
	public void upload(MultipartFile file, GalleryVo galleryVo) {
		
		System.out.println("GalleryService.upload()"+file.getOriginalFilename());
		System.out.println("GalleryService.upload()"+galleryVo);
		//저장경를 변수로
		String saveDir="C:\\javaStudy\\upload\\";
		
		//파일을 하드디스크에 저장(운영내용)
		//원본파일 이름
		String orgName = file.getOriginalFilename();
		galleryVo.setOrgName(orgName);
		//확장자                               //점뒤에 다가져오기                     //점으로 위치 지정
		String exName = file.getOriginalFilename().substring(file.getOriginalFilename().lastIndexOf("."));
		 
		//저장파일이름                      //현재시간을 숫자로             //랜덤 이름 생성 
		String saveName = System.currentTimeMillis() + UUID.randomUUID().toString() + exName;
		galleryVo.setSaveName(saveName);
		
		//파일패스 생성
		String filePath = saveDir + saveName; 
		galleryVo.setFilePath(filePath);
		
		//파일사이즈
		long fileSize = file.getSize();
		galleryVo.setFileSize(fileSize);
		
		//파일 저장(업로드)
				try {
					byte[] fileData = file.getBytes();
					//저장할 이름이랑 경로 까지 같이 입력
					
					OutputStream out = new FileOutputStream(filePath);
					BufferedOutputStream bout = new BufferedOutputStream(out);
					
					bout.write(fileData);
					bout.close();
					
				}catch(IOException e) {
					e.printStackTrace();
				}
				//DB에 저장
				galleryDao.upload(galleryVo);
			
	}

//읽기
	public GalleryVo read(int no) {
		return galleryDao.selectNo(no);
	}
	
//삭제
	public int remove(int no) {
		
			return galleryDao.remove(no);
		
	}
	
	/*
	public String restore(MultipartFile file) {
		
		System.out.println("FileService.restore()"+file.getOriginalFilename());
		
		//저장경를 변수로
		String saveDir="C:\\javaStudy\\upload\\";
				
		//파일을 하드디스크에 저장(운영내용)
		
		//원본파일 이름
		String orgName = file.getOriginalFilename();
		
		//확장자                                   //점뒤에 다가져오기                         //점으로 위치 지정
		String exName = file.getOriginalFilename().substring(file.getOriginalFilename().lastIndexOf("."));
		
		//저장파일이름            //현재시간을 숫자로             //랜덤 이름 생성    
		String saveName = System.currentTimeMillis() + UUID.randomUUID().toString() + exName;
		
		System.out.println(saveName);
		
		//파일패스 생성
		String filePath = saveDir + saveName;  
		
		//파일 사이즈
		long fileSize = file.getSize();
		
		//파일 저장(업로드)
		try {
			byte[] fileData = file.getBytes();
			//저장할 이름이랑 경로 까지 같이 입력
			
			OutputStream out = new FileOutputStream(filePath);
			BufferedOutputStream bout = new BufferedOutputStream(out);
			
			bout.write(fileData);
			bout.close();
			
		}catch(IOException e) {
			e.printStackTrace();
		}
		//DB에 저장
		
		return saveName;
		
	}
	*/
}
