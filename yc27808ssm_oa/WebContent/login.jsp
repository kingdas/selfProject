<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<div align="center">
		<h3 style="background-color: #eee">系统登录</h3>
		<form action="${pageContext.request.contextPath }/emp/login"
			method="post">
			<table>
				<tr>
					<td>登录名：</td>
					<td><input type="text" name="loginName" value="zhangfei"/></td>
				</tr>
				<tr>
					<td>密&nbsp;&nbsp;码：</td>
					<td><input type="password" name="password" value="zhangfei"/></td>
				</tr>
				<tr>
					<td colspan="2"><input type="submit" value="登录" /></td>
				</tr>
			</table>
		</form>
	</div>
</body>
</html>