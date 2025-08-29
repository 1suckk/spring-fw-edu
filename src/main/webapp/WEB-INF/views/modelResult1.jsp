<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>JSP 테스트 예제</title>
</head>
<body>
<h2>Receiving data from the controller</h2>
<hr>
<ul>
<li>${ v1 }</li>
<li>Array</li>
	<ul style="color:red">
	<li>${ v2[0] }</li>
	<li>${ v2[1] }</li>
	<li>${ v2[2] }</li>
	<li>${ v2[3] }</li>
	<li>${ v2[4] }</li>
	</ul>
	
	<ul style="color:blue">
	<c:forEach var="elem"  items="${v2}">
		<li>${elem}</li>
	</c:forEach>
	</ul>
<li>${ v3 }</li>
<li>${ v4 }</li>
<li>List</li>
	<ul>
	<li>${ v5[0] }</li>
	<li>${ v5[1] }</li>
	<li>${ v5[2] }</li>	
	</ul>
	
	<ul>
	<c:forEach var="elem"  items="${v5}">
		<li style="color:${elem.myColor}">${elem.myNumber}</li>
	</c:forEach>
	</ul>
</ul>
</body>
</html>


