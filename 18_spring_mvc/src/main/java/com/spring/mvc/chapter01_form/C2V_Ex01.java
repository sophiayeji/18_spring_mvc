package com.spring.mvc.chapter01_form;


import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class C2V_Ex01 {

	@Autowired
	private SupposeDAO supposeDAO; 
	

	/*
	 * 
	 * 1) HttpServeletRequest
	 * 
	 * - 컨트롤러 클래스 메서드의 파라메타로 HttpServletRequest를 추가하여 사용한다.
	 * - setAttribute("속성명", 데이터) 메서드를 사용하여 데이터를 뷰로 전송 한다.
	 * 
	 * */
	@GetMapping("/requestEx")
	public String requestEx(HttpServletRequest request) {
		
		request.setAttribute("enrolldProductCnt", supposeDAO.getEnrolledProductCnt());
		request.setAttribute("productDTO", supposeDAO.getProductDetail());
		request.setAttribute("productList", supposeDAO.getProductList());
		request.setAttribute("productMap", supposeDAO.getProductMap());
		request.setAttribute("productMapList", supposeDAO.getProductMapList());
		
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
	@GetMapping("/modelEx")
	public String requestEx(Model model) {
		// request.setAttribute("속성명", 데이터);
			model.addAttribute("enrolldProductCnt", supposeDAO.getEnrolledProductCnt());
			model.addAttribute("productDTO", supposeDAO.getProductDetail());
			model.addAttribute("productList", supposeDAO.getProductList());
			model.addAttribute("productMap", supposeDAO.getProductMap());
			model.addAttribute("productMapList", supposeDAO.getProductMapList());
	
		return "chapter01_form/view";
}
	
	
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
	@GetMapping("/modelAndViewEx")
	public ModelAndView modelAndViewEx() { // return 타입은 String이 아닌 ModelAndView 클래스를 작성한다.
		
		//ModelAndView mv = new ModelAndView();  // ModelAndView 객체를 생성한다.
		//mv.setViewName("chapter01_form/view");
		
		ModelAndView mv = new ModelAndView("chapter01_form/view");  
		
		mv.addObject("enrolldProductCnt" , supposeDAO.getEnrolledProductCnt());
		mv.addObject("productDTO"        , supposeDAO.getProductDetail());
		mv.addObject("productList"       , supposeDAO.getProductList());
		mv.addObject("productMap"        , supposeDAO.getProductMap());
		mv.addObject("productMapList"    , supposeDAO.getProductMapList());

		return mv; // ModelAndView 객체를 반환한다.
	}
	
	
}
