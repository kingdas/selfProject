<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action="${pageContext.request.contextPath}/uploads" method="post"
		enctype="multipart/data-form">
		文件：<input type="file" name="filename"><input type="submit"
			value="upload">
	</form>
</body>
</html>