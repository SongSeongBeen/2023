package com.javaex.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.javaex.dao.UserDao;
import com.javaex.util.WebUtil;
import com.javaex.vo.UserVo;

@WebServlet("/user")
@SuppressWarnings("serial")//부모클래스에 객체가 있기때문
public class UserController extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String act = request.getParameter("action");
		
		if("joinForm".equals(act)){
			
			System.out.println("action=joinForm");
			WebUtil.forward(request, response, "/WEB-INF/views/user/joinForm.jsp");	
	
//조인-확인	
		}else if("join".equals(act)){
			System.out.println("action=join");	
			
			String id = request.getParameter("id");
			String password = request.getParameter("password");
			String name = request.getParameter("name");
			String gender = request.getParameter("gender");
			
			UserVo userVo = new UserVo(id, password, name, gender); 
					
			new UserDao().insert(userVo);  
			
			WebUtil.forward(request, response, "/WEB-INF/views/user/joinOk.jsp");
			
//조인폼		
		}else if("loginForm".equals(act)){
			System.out.println("action=loginForm");	
			WebUtil.forward(request, response, "/WEB-INF/views/user/loginForm.jsp");
//글쓰기로그인			
		}else if("writeLoginForm".equals(act)){
			System.out.println("action=writeloginForm");	
			WebUtil.forward(request, response, "/WEB-INF/views/user/writeLoginForm.jsp");
			
//회원가입 완료 폼		
		}else if("joinOk".equals(act)){
			System.out.println("action=joinOk");	
			WebUtil.forward(request, response, "/WEB-INF/views/user/joinOk.jsp");	
//로그인	
		}else if("login".equals(act)){
			System.out.println("action=login");
			
			String id = request.getParameter("id");
			String password = request.getParameter("password");
			
			UserDao userDao  = new UserDao();
			//변수를 새로 만들어 넣는다
			UserVo authVo = userDao.getUser(id, password);
			//System.out.println(authVo);
			//서버에 세션을 만든다
			
//null = 로그인실패
			if(authVo == null) {
				System.out.println("login실패");
				
				WebUtil.redirect(request, response, "/mysite/user?action=loginForm&result=fail");
//로그인 성공
			}else {
				System.out.println("로그인성공");
				
				HttpSession session = request.getSession();
				//id,password를 담아 비교할 공간을 만든다(한웹에서만 허용) 여러게 만들수있다.
				session.setAttribute("authUser", authVo);
				WebUtil.redirect(request, response, "/mysite/main");
			}
			
//글쓰기에서 로그인 바로가기 -- 이것도 그냥 이렇게	
		}else if("writelogin".equals(act)){
			System.out.println("action=login");
			
			String id = request.getParameter("id");
			String password = request.getParameter("password");
			
			UserDao userDao  = new UserDao();
			//변수를 새로 만들어 넣는다
			UserVo authVo = userDao.getUser(id, password);
			//System.out.println(authVo);
			//서버에 세션을 만든다
			
//null = 로그인실패
			if(authVo == null) {
				System.out.println("login실패");
				
				WebUtil.redirect(request, response, "/mysite/user?action=loginForm&result=fail");
//로그인 성공
			}else {
				System.out.println("로그인성공");
				
				HttpSession session = request.getSession();
				//id,password를 담아 비교할 공간을 만든다(한웹에서만 허용) 여러게 만들수있다.
				session.setAttribute("authUser", authVo);
				WebUtil.redirect(request, response, "./bod?action=writeForm");
			}
//로그아웃	
		}else if("logout".equals(act)) {
			System.out.println("로그아웃");
			
			HttpSession session = request.getSession();
			//session 삭제
			session.removeAttribute("authUser");
			session.invalidate();
			
			WebUtil.redirect(request, response, "/mysite/main");
//회원정보 수정폼		
		}else if("modifyForm".equals(act)){
			System.out.println("action=modifForm");
			
			HttpSession session = request.getSession();
			UserVo authUser = (UserVo)session.getAttribute("authUser");
			
			int no = authUser.getNo();
			
			UserDao userDao = new UserDao();
			UserVo userVo = userDao.getUserNo(no);
			
			request.setAttribute("userVo", userVo);
			WebUtil.forward(request, response, "/WEB-INF/views/user/modifyForm.jsp");
			
//회원정보 수정 입력		
		}else if("modify".equals(act)){
			System.out.println("action=modify");
			
			int no = Integer.parseInt(request.getParameter("no"));
			String password = request.getParameter("password");
			String name = request.getParameter("name");
			String gender = request.getParameter("gender");
			String id = request.getParameter("id");
			
			UserVo userVo = new UserVo(no, id, password, name, gender);
			new UserDao().Update(userVo);

			
			UserVo authVo = new UserVo(userVo.getNo(), userVo.getName());
			
			HttpSession session = request.getSession();
			session.setAttribute("authUser", authVo);
			
			WebUtil.redirect(request, response, "/mysite/main");
			
		}else {
			System.out.println("파라미터값 없음");
		}
				
	}
					
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
