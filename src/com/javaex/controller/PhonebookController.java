package com.javaex.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.javaex.dao.PhoneDao;
import com.javaex.vo.PersonVo;


@WebServlet("/pbc")
public class PhonebookController extends HttpServlet {
	//private static final long serialVersionUID = 1L; long 필드 식별자(하나씩 던저주면 판단)

	
	// Get 방식으로 설정하면 여기 코드 사용
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		System.out.println("PhonebookController");

		String act = request.getParameter("action");
		List<PersonVo> personList = new PhoneDao().getPersonList();

		if ("list".equals(act)) {
			System.out.println("action=list");
			// System.out.print(personList);
			// html과 list 섞어서 표현
			// servlet로 표현이 복잡 -->jsp 이용

			// 포워드

			request.setAttribute("pList", personList); // 주소만 준거다
			// ^^^^^ setAttribute(값입력) ex("pList", personList);
			RequestDispatcher re = request.getRequestDispatcher("/WEB-INF/list.jsp");
			re.forward(request, response);
		} else if ("writeForm".equals(act)) {
			System.out.println("action=writeForm");

			RequestDispatcher rd = request.getRequestDispatcher("/WEB-INF/writeForm");
			rd.forward(request, response);

		} else if ("write".equals(act)) {
			System.out.println("action=write");
			
			//파라미터 3개를 꺼내온다
			String name = request.getParameter("name");
			String hp = request.getParameter("hp");
			String company = request.getParameter("company");
			//vo로 만든다
			PersonVo personVo = new PersonVo(name, hp, company); 
			//dao 메모리 올린다. //dao.insert(vo);
			new PhoneDao().personInsert(personVo);
			
			//리다이렉트 (포워트x) //바로 엔터까지 처준다.
			response.sendRedirect("/phonebook2/pbc?action=list");
		
		} else {
			System.out.println("파라미터값 없음");
		}

	}

	//Post방식으로 설정하면 여기 코드 사용
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		doGet(request, response);
	}

}
