<%@page import="java.util.Random"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script type="text/javascript" src="jquery-1.9.1.min.js"></script>
<script type="text/javascript">
	function gainCode(img) {
		img.src = "${pageContext.request.contextPath }/codeServlet?t="+Math.random();
	}
</script>
</head>
<body>
	
	<form action="login" method="post">
		用户名：<input type="text" name="name" /><br> 
		密&nbsp;&nbsp;码：<input type="password" name="password"><br> 
		验证码：<input type="text" name="c">
		<img id="code" alt="验证码" src="${pageContext.request.contextPath }/codeServlet"
			onclick="gainCode(this)"> <br> 
		<input type="submit" value="登录" />
	</form>
</body>
</html>