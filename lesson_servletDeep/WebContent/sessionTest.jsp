<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<!-- 对应于session监听器 -->
	<%
		session.setAttribute("x", 2);
		session.setAttribute("x", 5);
		session.removeAttribute("x");
	%>
</body>
</html>