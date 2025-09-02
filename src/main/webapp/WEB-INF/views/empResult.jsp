<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
	h2 {
		color : blue;
	}
	ul {
		color : green;
	}
	h3 {
		color : magenta;
	}
	h4 {
		color : brown;
	}
</style>
</head>
<body>
<h1>Emp 테이블에서 읽어오기</h1>
<hr>
<c:if test="${ !empty num }">
	<h2>데이터는 총 ${ num }개가 있어요.....</h2>
</c:if>
<c:if test="${ !empty list }">
	<ul>
		<c:forEach var="vo"  items="${list}">
			<li>${vo}</li>
		</c:forEach>
	</ul>
</c:if>
<c:if test="${ !empty dto }">
	<h4>${ dto.empno } 번 직원의 정보 : ${ dto.ename }, ${ dto.job }, ${ dto.hiredate }, ${ dto.sal }</h4>
</c:if>
<c:if test="${ !empty msg }">
	<h3>${msg}</h3>
</c:if>
</body>
</html>