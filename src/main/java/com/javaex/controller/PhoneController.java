package com.javaex.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.javaex.dao.PhoneDao;
import com.javaex.vo.PersonVo;

@Controller
@RequestMapping(value = "/phone")
public class PhoneController {
		// 필드
	
		// 생성자
	
		// 메소드gs
	
		// 메소드 일반

//쓰기-폼
		@RequestMapping(value = "/writeForm", method = { RequestMethod.GET, RequestMethod.POST })
		public String writeForm() {
				System.out.println("PhoneController=writeForm");
				return "/WEB-INF/views/writeForm.jsp";
		}

//쓰기-확인	
		// Vo를 가지고와서 필드에 있는 이름이랑 연결만 시켜 주면 되는 방법
		@RequestMapping(value = "/write", method = { RequestMethod.GET, RequestMethod.POST })
		public String write(@ModelAttribute PersonVo personVo) {
			System.out.println("PhoneController=write");
	
			new PhoneDao().personInsert(personVo);
	
			return "redirect:/phone/list";
		}

//리스트	
		@RequestMapping(value = "/list", method = { RequestMethod.GET, RequestMethod.POST })
		public String list(Model model) {
			System.out.println("PhoneController=list");
			// 다오에서 리스트를 가져온다
			List<PersonVo> pList = new PhoneDao().getPersonList();
			System.out.println(pList.toString());
	
			// 컨트롤러-->DS데이터를 보낸다
			model.addAttribute("pList", pList);
	
			return "/WEB-INF/views/list.jsp";
		}

//업데이트-폼
		@RequestMapping(value = "/updateForm", method = { RequestMethod.GET, RequestMethod.POST })
		public String updateForm(@RequestParam("personId") int personId, Model model) {
			System.out.println("PhoneController=updateForm");
			
			PersonVo personVo = new PhoneDao().getPerson(personId);
			
			model.addAttribute("personVo", personVo);
			
			return "/WEB-INF/views/updateForm.jsp";
		}

//업데이트-확인
		@RequestMapping(value = "/update", method = { RequestMethod.GET, RequestMethod.POST })
		public String update(@ModelAttribute PersonVo personVo) {
	
			new PhoneDao().personUpdate(personVo);
	
			return "redirect:/phone/list";
		}

//지우기	
		@RequestMapping(value = "/delete", method = { RequestMethod.GET, RequestMethod.POST })
		public String delete(@RequestParam("personId") int personId) {
	
			new PhoneDao().personDelete(personId);
	
			return "redirect:/phone/list";
		}
	
		/*
		 * // 파라미터안에 있는거 바로 들고 오는 방법
		 * 
		 * @RequestMapping(value="/phone/write", method= {RequestMethod.GET,
		 * RequestMethod.POST}) public String write(@RequestParam("name") String name,
		 * 
		 * @RequestParam("hp") String hp,
		 * 
		 * @RequestParam("company") String company) {
		 * System.out.println("PhoneController=write");
		 * 
		 * System.out.println(name); System.out.println(hp);
		 * System.out.println(company);
		 * 
		 * PersonVo personVo = new PersonVo(name, hp, company); new
		 * PhoneDao().personInsert(personVo);
		 * 
		 * 
		 * 
		 * return ""; }
		 */

}
