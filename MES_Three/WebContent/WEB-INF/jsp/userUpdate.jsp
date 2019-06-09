<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>更新用户</title>
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet"
	href="${pageContext.request.contextPath }/res/bootstrap-3.3.7-dist/css/bootstrap.min.css">
</head>
<body>
	<h3 align="center">用户信息修改</h3>
	<form action="${pageContext.request.contextPath }/user/doUpdate"
		method="post">
		<input type="hidden" name="userId" value="${u.userId }">
		<table class="table">
			<tr>
				<td>用户名：</td>
				<td><input type="text" class="btn btn-default" name="userCode"
					value="${u.userCode }" /></td>
				<td>密码：</td>
				<td><input type="text" class="btn btn-default"
					name="userPassword" value="${u.userPassword }" /></td>
			</tr>
			<tr>
				<td>用户组：</td>
				<td><input type="text" class="btn btn-default" name="userGroup"
					value="${u.userGroup }" /></td>
				<td>用户角色：</td>
				<td><input type="text" class="btn btn-default" name="userRole"
					value="${u.userRole }" /></td>
			</tr>
			<tr>
				<td>职务：</td>
				<td><input type="text" class="btn btn-default" name="userJob"
					value="${u.userJob }" /></td>
				<td>邮箱：</td>
				<td><input type="text" class="btn btn-default" name="userEmail"
					value="${u.userEmail }" /></td>
			</tr>
			<tr>
				<td>手机号：</td>
				<td><input type="text" class="btn btn-default"
					name="userMobile" value="${u.userMobile }" /></td>
				<td>微信号：</td>
				<td><input type="text" class="btn btn-default" name="userWxnd"
					value="${u.userWxnd }" /></td>
			</tr>
			<tr>
				<td>是否允许登录：</td>
				<td><input type="text" class="btn btn-default" name="isLoginer"
					value="${u.isLoginer }" /></td>
				<td>所属工位：</td>
				<td><input type="text" class="btn btn-default"
					name="lockPlaceId" value="${u.lockPlaceId }" /></td>
			</tr>
			<tr>
				<td colspan="4" align="center"><input type="submit"
					class="btn btn-default " value="保存" /> &nbsp;&nbsp;<input
					type="button" name="reback" class="btn btn-default "
					onclick="javascript:history.back(-1);" value="返回"></td>
			</tr>
		</table>
	</form>
</body>
</html>