<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>

<script type="text/javascript"
	src="${pageContext.request.contextPath}/res/js/AlarmmyJs.js"></script>

</head>
<body>
	<h2 align="center">新增报警原因</h2>
	<hr />
	<div align="center">
		<form action="${pageContext.request.contextPath}/userbj/add"
			method="post" onsubmit="return checkDescription();">
			<tr>
				<td align="center">报警类型：</td>
				<td><select name="typeId">
						<option value="设备报警1">设备报警1</option>
						<option value="质量报警2">质量报警2</option>
						<option value="工艺报警3">工艺报警3</option>
				</select></td>
			</tr>
			<br /> <br />
			<tr>

				&nbsp;&nbsp;&nbsp;&nbsp; &nbsp;&nbsp;&nbsp;&nbsp;
				&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
				<td align="center">原因描述：</td>
				<td><input id="description" type="text" name="description" /></td>
			</tr>
			<br /> <br />
			<tr>
				<td><input class="btn btn-default" type="submit" value="保存" /></td>
			</tr>
			<br /> <br /> <br />
			<tr>
				<td><a href="${pageContext.request.contextPath}/userbj/alarm"
					method="post">返回</a></td>
			</tr>
		</form>
	</div>
</body>
</html>