package com.spring.mvc.chapter02_mapper;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;


@Repository
public class M2D {

	@Autowired
	private SqlSession sqlSession;

	
	// DTO List 반환 예시1
	public void ex01() {
		
		System.out.println("\n - ex01 - \n");
		
	}
	
	// DTO List 반환 예시2
	public void ex02() {
		
		System.out.println("\n - ex02 - \n");
		
	}
	
	
	// DTO 반환 예시1
	public void ex03() {
		
		System.out.println("\n - ex03 - \n");
		
	}
	
	
	// DTO 반환 예시2
	public void ex04() {
		
		System.out.println("\n - ex04 - \n");
		
	}
	
	
	// 단일 데이터 반환 예시1
	public void ex05() {
		
		System.out.println("\n - ex05 - \n");
		
	}
	
	
	
	// 단일 데이터 반환 예시2
	public void ex06() {
		
		System.out.println("\n - ex06 - \n");
		
	}
	
	
	// 단일 데이터 반환 예시3
	public void ex07() {
		
		System.out.println("\n - ex07 - \n");
		
	}
	
	
	// <![CDATA[]]> 사용예시
	public void ex08() {
		
		System.out.println("\n - ex08 - \n");
		
	}
	
	
	// 테이블 컬럼과 자바 프로퍼티 바인딩 예시1
	public void ex09() {
		
		System.out.println("\n - ex09 - \n");
		
	}

	
	// 테이블 컬럼과 자바 프로퍼티 바인딩 예시2
	public void ex10() {
		
		System.out.println("\n - ex10 - \n");
		
	}
	
	
	// 테이블 컬럼과 자바 프로퍼티 바인딩 예시3
	public void ex11() {
		
		System.out.println("\n - ex11 - \n");
		
	}
	
	
}
