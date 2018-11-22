<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script type="text/javascript">
	function checkNameAndPwd() {
		var name = document.getElementById("loginName").value;
		var pwd = document.getElementById("password").value;
		xhr.open("get",
				"${pageContext.request.contextPath }/loan/loginAction?loginName="
						+ name + "&password=" + pwd, true);
		/* xhr.setRequestHeader("Content-Type",
				"application/x-www-form-urlencoded"); */
		var xhr = new XMLHttpRequest();
		xhr.onreadystatechange = function() {
			if (xhr.readyState == 4 && xhr.status == 200) {
				if (xhr.responseText == "1") {
					return true;
				} else {
					alert("不存在此用户");
					name = "";
					pwd = "";
					return false;
				}
			}
		}
		xhr.send(null);//"loginName=" + name + "&password=" + pwd
	}
</script>
</head>
<body>
	<div align="center">
		<form name="form1"
			action="${pageContext.request.contextPath }/loan/loginAction"
			method="post" onsubmit="return checkNameAndPwd(form1);">
			<table>
				<tr>
					<td align="center" colspan="2" style="background: gray;"><font
						size="4">系&nbsp;统&nbsp;登&nbsp;录</font></td>
				</tr>
				<tr>
					<td>登录名:</td>
					<td><input type="text" name="loginName" id="loginName"
						value="liubei" /></td>
				</tr>
				<tr>
					<td>密&nbsp;&nbsp;码:</td>
					<td><input type="text" name="password" id="password"
						value="liubei" /></td>
				</tr>
				<tr>
					<td align="center" colspan="2"><input type="submit" value="登录" /></td>
				</tr>
			</table>
		</form>
	</div>
</body>
</html>