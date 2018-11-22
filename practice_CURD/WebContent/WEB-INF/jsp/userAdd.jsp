<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>添加</title>
<script type="text/javascript">
	function checkName(name) {
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
				"${pageContext.request.contextPath }/user/findName?name="
						+ name, true);
		xhr.send(null);
	}
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
			s += "必填";
			alert(s);
			return false;
		}
		return true;
	}
	
	function checkId(id) {
		if (!/^[1-9]\d{0,9}$/.test(id)) {
			alert("ID是正整数，且不能过长");
		}
	}
</script>
</head>
<body bgcolor="#77cc77">
	<div align="center">
		<h3>创建用户</h3>
		<form action="${pageContext.request.contextPath }/user/add"
			method="post" onSubmit="return checkNameAndPwd()">
			<table border="0">
				<tr>
					<td colspan="2"><font color="red"><span id="err"></span></font></td>
				</tr>
				<tr>
					<td>账号</td>
					<td><input type="text" name="operator_id"
						onblur="checkId(this.value)" /></td>
				</tr>
				<tr>
					<td>姓名</td>
					<td><input id="name" type="text" name="name"
						onblur="checkName(this.value)" /></td>
				</tr>
				<tr>
					<td>密码</td>
					<td><input id="password" type="text" name="password" /></td>
				</tr>
				<tr>
					<td>状态</td>
					<td><select name="status">
							<option value="1">有效</option>
							<option value="0">无效</option>
					</select></td>
				</tr>
				<tr>
					<td colspan="2"><input type="submit" value="提交" /></td>
				</tr>
			</table>
		</form>
	</div>
</body>
</html>