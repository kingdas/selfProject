<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>user add</title>
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet"
	href="${pageContext.request.contextPath }/res/bootstrap-3.3.7-dist/css/bootstrap.min.css">
</head>
<body>
	<h3 align="center">新增用户</h3>
	<form action="${pageContext.request.contextPath }/user/add"
		method="post">
		<table class="table">
			<tr>
				<td>用户名</td>
				<td><input type="text" name="userCode" /></td>
				<td>密码</td>
				<td><input type="text" name="userPassword" /></td>
			</tr>
			<tr>
				<td>用户组</td>
				<td><input type="text" name="userGroup" /></td>
				<td>用户角色</td>
				<td><input type="text" name="userRole" /></td>
			</tr>
			<tr>
				<td>职务</td>
				<td><input type="text" name="userJob" /></td>
				<td>邮箱</td>
				<td><input type="text" name="userEmail" /></td>
			</tr>
			<tr>
				<td>手机号</td>
				<td><input type="text" name="userMobile" /></td>
				<td>微信号</td>
				<td><input type="text" name="userWxnd" /></td>
			</tr>
			<tr>
				<td>是否允许登录</td>
				<td><input type="text" name="isLoginer" /></td>
				<td>所属工位</td>
				<td><input type="text" name="lockPlaceId" /></td>
			</tr>
			<tr>
				<td colspan="2" align="center"><input type="submit" value="保存" /></td>
			</tr>
		</table>
	</form>

</body>
</html>