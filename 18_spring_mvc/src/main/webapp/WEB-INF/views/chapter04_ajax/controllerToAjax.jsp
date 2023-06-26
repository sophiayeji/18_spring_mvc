<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c"  uri="http://java.sun.com/jsp/jstl/core"%>
<c:set var="contextPath" value="${pageContext.request.contextPath }"/>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title></title>
<script src="${contextPath}/resources/jquery/jquery-3.5.1.min.js"></script>
<script>

	$().ready(function(){
		
		
		// 1. 단일데이터 return
		$("#btn1").click(function(){
			
			$.ajax({
				
				url : "${contextPath}/ajax/c2aEx01",
				type : "get",
				success : function() {
					/*
						
						[형식]
					
						파라메타
						
					*/
				}
			});
			
		});
		
		
		// 2. DTO return
		$("#btn2").click(function(){
			
			$.ajax({
				
				url : "${contextPath}/ajax/c2aEx02",
				type : "get",
				success : function() {
					/*
					
						[형식]

						파라메타.속성명
						
					*/
				}
				
			});
			
		});
		
		
		// 3. Map return
		$("#btn3").click(function(){
			
			$.ajax({
				
				url : "${contextPath}/ajax/c2aEx03",
				type : "get",
				success : function() {
					
					/*
					
						[형식]
	
						파라메타.키
						
					*/
					
				}
				
			});
			
		});
		
		
		// 4. List<DTO> return
		$("#btn4").click(function(){
					
			$.ajax({
				
				url : "${contextPath}/ajax/c2aEx04",
				type : "get",
				success : function() {
					
					/*
					
						[형식]	
					
						$(파라메타).each(function{
							this.속성명
						});
						
					*/
					
				}
				
			});
					
		});
	
		
		// 5. List<Map> return
		$("#btn5").click(function(){
			
			$.ajax({
				
				url : "${contextPath}/ajax/c2aEx05",
				type : "get",
				success : function() {
					
					/*
					
						[형식]
					
						$(파라메타).each(function{
							this.키
						});
					
					*/
					
				}
				
			});
			
		});
		
	});
</script>
</head>
<body>
	<fieldset>
		<legend>ControllerToAjax</legend>
	    <input type="button" id="btn1" value="1) 단일데이터" >
	    <input type="button" id="btn2" value="2) DTO" >
	    <input type="button" id="btn3" value="3) map" >
	    <input type="button" id="btn4" value="4) List(DTO)" >
	    <input type="button" id="btn5" value="5) List(map)" >
	</fieldset>
</body>
</html>