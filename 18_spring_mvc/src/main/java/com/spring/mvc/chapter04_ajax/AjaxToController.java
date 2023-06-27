package com.spring.mvc.chapter04_ajax;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.spring.mvc.dto.ProductDTO;

@Controller
@RequestMapping("/ajax")
public class AjaxToController {
	
	/*
	    # AJAX데이터 전송
	    
	    - pom.xml파일에 의존성 추가
	    
		<!-- jackson-core -->
		<dependency>
		    <groupId>com.fasterxml.jackson.core</groupId>
		    <artifactId>jackson-databind</artifactId>
		    <version>2.9.2</version>
		</dependency>
	*/
	
	private Object mapList;


	@GetMapping("/ajaxToController")
	public String ajaxToController() {
		return "chapter04_ajax/ajaxToController";
	}
	
	
	// 1. 단일 데이터 전송
	@GetMapping("/a2cEx01")
	public ResponseEntity<Object> a2cEx01(@RequestParam("productCd") String productCd) {
		
		System.out.println(productCd);
		System.out.println("\n=====================\n");
		
		return new ResponseEntity<Object>(HttpStatus.OK);
		
	}
	
	
	// 2. DTO 전송
	@GetMapping("/a2cEx02")
	public ResponseEntity<Object> a2cEx02(@ModelAttribute ProductDTO productDTO)  {
		
		System.out.println(productDTO);
		System.out.println("\n=====================\n");
		
		return new ResponseEntity<Object>(HttpStatus.OK);
		
	}

	
	// 3. map 전송
	@GetMapping("/a2cEx03")
	public ResponseEntity<Object> a2cEx03(@RequestParam Map<String,Object> map) {
		
		System.out.println(map);
		System.out.println("\n=====================\n");
		
		return new ResponseEntity<Object>(HttpStatus.OK);
		
	}
	
	
	// 4. List<DTO> 전송
	@GetMapping("/a2cEx04")
	public ResponseEntity<Object> a2cEx04(@RequestParam Map<String,Object> paramList) throws JsonParseException, JsonMappingException, IOException {
	
		//1) paramList로 넘어온 데이터를 문자열로 변환한다. 
		String json = paramList.get("paramList").toString();
		
		//2) ObjectMapper의 readValue() 메서드를 이용하여 JSON파일을 JAVA 객체로 매핑한다.
		ObjectMapper mapper = new ObjectMapper();
		List<ProductDTO> productList = mapper.readValue(json, new TypeReference<ArrayList<ProductDTO>>(){});

		for (ProductDTO productDTO : productList) {
			System.out.println(productDTO);
			System.out.println();
		}
		
		System.out.println("\n=====================\n");
		
		return new ResponseEntity<Object>(HttpStatus.OK);
	
	}
	

	// 5. List<Map> 전송
	@GetMapping("/a2cEx05")
	public ResponseEntity<Object> a2cEx05(@RequestParam Map<String,Object>paramList) throws JsonParseException, JsonMappingException, IOException {
	
		//1) paramList로 넘어온 데이터를 문자열로 변환한다. 
		String json = paramList.get("paramList").toString();  
		
		//2) /ObjectMapper의 readValue() 메서드를 이용하여 JSON파일을 JAVA 객체로 매핑한다.
		ObjectMapper mapper = new ObjectMapper();
		List<Map<String,Object>> mapList = mapper.readValue(json, new TypeReference<ArrayList<Map<String,Object>>>(){});
		for (Map<String, Object> map : mapList) {
			System.out.println(map);
		}
		System.out.println("\n=====================\n");
		
		return new ResponseEntity<Object>(HttpStatus.OK);
		
	}
	
	
}
