<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>컨트롤러에서 보내온 데이터  출력</h1>
<hr>
<%
Integer data = (Integer)request.getAttribute("result");
%>
expression tag: <%=data %>
<hr>
EL : ${result}
</body>
</html>