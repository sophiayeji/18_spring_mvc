package com.spring.mvc.chapter02_mapper;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class SupposeController {

	@Autowired
	private M2D m2d;
	
	@Autowired
	private D2M d2m;
	
	
	
	/*  Mapper to DAO */
	
	@GetMapping("/ex01")
	public String ex01() {
		m2d.ex01();
		return "home";
	}
	
	@GetMapping("/ex02")
	public String ex02() {
		m2d.ex02();
		return "home";
	}
	
	@GetMapping("/ex03")
	public String ex03() {
		m2d.ex03();
		return "home";
	}
	
	@GetMapping("/ex04")
	public String ex04() {
		m2d.ex04();
		return "home";
	}
	
	@GetMapping("/ex05")
	public String ex05() {
		m2d.ex05();
		return "home";
	}
	
	@GetMapping("/ex06")
	public String ex06() {
		m2d.ex06();
		return "home";
	}
	
	@GetMapping("/ex07")
	public String ex07() {
		m2d.ex07();
		return "home";
	}
	
	@GetMapping("/ex08")
	public String ex08() {
		m2d.ex08();
		return "home";
	}
	
	@GetMapping("/ex09")
	public String ex09() {
		m2d.ex09();
		return "home";
	}
	
	@GetMapping("/ex10")
	public String ex10() {
		m2d.ex10();
		return "home";
	}
	
	@GetMapping("/ex11")
	public String ex11() {
		m2d.ex11();
		return "home";
	}
	
/*  DAO to Mapper */
	
	@GetMapping("/sample01")
	public String sample01() {
		d2m.sample01();
		return "home";
	}
	
	@GetMapping("/sample02")
	public String sample02() {
		d2m.sample02();
		return "home";
	}
	
	@GetMapping("/sample03")
	public String sample03() {
		d2m.sample03();
		return "home";
	}
	
	@GetMapping("/sample04")
	public String sample04() {
		d2m.sample04();
		return "home";
	}
	
	@GetMapping("/sample05")
	public String sample05() {
		d2m.sample05();
		return "home";
	}
	
	@GetMapping("/sample06")
	public String sample06() {
		d2m.sample06();
		return "home";
	}
	
	@GetMapping("/sample07")
	public String sample07() {
		d2m.sample07();
		return "home";
	}
	
	@GetMapping("/sample08")
	public String sample08() {
		d2m.sample08();
		return "home";
	}
	
	@GetMapping("/sample09")
	public String sample09() {
		d2m.sample09();
		return "home";
	}	
}
