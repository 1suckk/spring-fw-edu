<%@page import="edu.example.springedu.domain.MemberDTO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %> 
<!DOCTYPE html> 
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>회원 정보</h1>
	<hr>
	<c:choose>
	<c:when test= "${ !empty requestScope.member }">
	<h2>member2 요청 결과</h2>
	<ul>
		<li>회원 이름 : ${member.name }</li>
		<li>회원 전화번호 : ${member.phone }</li>
		<li>회원 계정 : ${member.id }</li>
		<li>회원 암호 : ${member.password }</li>
	</ul>	
	</c:when>
	<c:when test= "${ !empty requestScope.memberDTO }">
	<h2>member3 요청 결과</h2>	
	<ul>
		<li>회원 이름 : ${memberDTO.name }</li>
		<li>회원 전화번호 : ${memberDTO.phone }</li>
		<li>회원 계정 : ${memberDTO.id }</li>
		<li>회원 암호 : ${memberDTO.password }</li>
	</ul>
	</c:when>
	<c:otherwise>
	<h2>member1 요청 결과</h2>
	<ul>
		<li>회원 이름 : ${ name }</li>
		<li>회원 전화번호 : ${ phone }</li>
		<li>회원 계정  : ${ id }</li>
		<li>회원 암호  : ${ password }</li>		
	</ul>
	</c:otherwise>
	</c:choose>
	<hr>
	<a href=${ header.referer }>입력화면</a>
</body>
</html>
