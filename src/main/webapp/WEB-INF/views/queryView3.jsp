<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>queryView3.jsp</title>
<style type="text/css">
h3 {
color: red;
}
</style>
</head>
<body>
<h2>컨트롤러에서 자동으로 저장되는 데이터들을 꺼내보자~~</h2>
<h3>String을 포함한 기본형도 보관해줄까?</h3>
<hr>
<c:if test="${ !empty guestInfo }">
	<ul>
		<li>${gname}</li>
		<li>${gnum}</li>
		<li>${gaddr}</li>	
		<li>${guestInfo}</li>
	
	</ul>
</c:if>
<c:if test="${ !empty  queryDTO }">
	<ul>
		<li>${queryDTO}</li>
		<li>${queryDTO.testName}</li>
		<li>${queryDTO.testAge}</li>
		<li>${queryDTO.testAddr}</li>	
	</ul>
</c:if>
<c:if test="${ !empty  abc }">
	<ul>
		<li>${abc}</li>	
		<li>${abc.name}</li>
		<li>${abc.phoneNumber}</li>
		<li>${abc.age}</li>	
	</ul>
</c:if>
</body>
</html>