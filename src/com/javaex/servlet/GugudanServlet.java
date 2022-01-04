package com.javaex.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/Gugudan")
public class GugudanServlet extends HttpServlet {


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//코드작성
		response.setContentType("text/html;charset=utf-8");
		
		int dan = Integer.parseInt(request.getParameter("dan"));
		//파라미터 값 꺼내기
		PrintWriter out = response.getWriter();
		for(int i=1; i<=9; i++) {
		out.print("<table border='1'>");
		out.print("		<tr>");
		out.print("			<td>"+ dan +"</td>");
		out.print("			<td>"+ i +"</td>");
		out.print("			<td>"+ dan+i +"</td>");
		out.print("		</tr>");
		}
		out.print("</table>");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		doGet(request, response);
	}

}
