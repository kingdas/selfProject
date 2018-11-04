<%@page import="user.User"%>
<%@page import="java.util.List"%>
<%@page import="dao.Daoimplement"%>
<%@page import="dao.Userdao"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>更新</title>
<script>
	/* function checkName(name) {
		var xhr = new XMLHttpRequest();
		xhr.onreadystatechange = function() {
			if (xhr.readyState == 4 && xhr.status == 200) {
				if (xhr.responseText == 1) {
					document.getElementById("err").innerHTML = "用户名已存在";
				} else {
					document.getElementById("err").innerHTML = "";
				}
			}
		};
		xhr.open("get",
				"${pageContext.request.contextPath }/rely?m=findName&name="
						+ name, true);
		xhr.send(null);
	} */
	function checkNameAndPwd() {
		//alert(1);
		s = "";
		name = document.getElementById("name").value;
		password = document.getElementById("password").value;
		if (name == null || name.trim().length < 1) {
			s += "用户名";
		}
		if (password == null || password.trim().length < 1) {
			s += "密码";
		}
		if (s.length > 0) {
			s += "不能为空";
			alert(s);
			return false;
		}
		return true;
	}
</script>
</head>
<body bgcolor="#77cc77">
	<div align="center">
		<h3 align="center">修改用户</h3>
		<form action="${pageContext.request.contextPath }/rely" method="post"
			onSubmit="return checkNameAndPwd()">
			<input type="hidden" name="m" value="doUpdate" />
			<table border="0">
				<tr>
					<td>账号</td>
					<td><input type="text" name="operator_id"
						value="${u.operator_id }" readonly="readonly" /></td>
				</tr>
				<tr>
					<td>姓名</td>
					<td><input id="name" type="text" name="name"
						value="${u.name }" /></td>
				</tr>
				<tr>
					<td>密码</td>
					<td><input id="password" type="text" name="password"
						value="${u.password }" /></td>
				</tr>
				<tr>
					<td>状态</td>
					<td><select name="status">
							<option value="1">有效</option>
							<option value="0" ${u.status==0? "selected='selected'":''}>无效</option>
					</select></td>
				<tr>
					<td colspan="2"><input type="submit" value="提交" /></td>
				</tr>
			</table>
		</form>
	</div>
</body>
</html>