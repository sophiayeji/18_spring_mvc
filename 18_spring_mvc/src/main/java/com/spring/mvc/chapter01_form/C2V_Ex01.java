package com.spring.mvc.chapter01_form;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class C2V_Ex01 {


	/*
	 * 
	 * 1) HttpServeletRequest
	 * 
	 * - 컨트롤러 클래스 메서드의 파라메타로 HttpServletRequest를 추가하여 사용한다.
	 * - setAttribute("속성명", 데이터) 메서드를 사용하여 데이터를 뷰로 전송 한다.
	 * 
	 * */
	
	@GetMapping("/requestEx")
		public String requestEx() {
			return "chapter01_form/view";
	}
	
	/*
	 * 
	 *  2) Model
	 *  
	 *  - 컨트롤러 클래스 메서드의 파라메타로 Model을 추가하여 사용한다. 
	 *  - addAddtribute("속성명", 데이터) 메서드를 사용하여 데이터를 뷰로 전송 한다.
	 * 
	 * */
	
	/*
	 * 
	 * 3) ModelAndView
	 * 
	 * - ModelAndView객체를 메서드 안(파라메타x)에서 생성한다.
	 * - setViewName("뷰 경로") 메서드를 사용하여 뷰 경로를 지정한다. 
	 * - setViewName() 메서드 대신 생성자의 인수로 뷰 경로를 지정할 수 있다.
	 * - addObject("속성명", 데이터) 메서드를 사용하여 데이터를 뷰로 전송 한다.
	 * - ModelAndView 객체를 return한다.
	 * - 관용적으로 객체명은 mv 혹은 mav로 사용한다.
	 * 
	 * */
	
}
