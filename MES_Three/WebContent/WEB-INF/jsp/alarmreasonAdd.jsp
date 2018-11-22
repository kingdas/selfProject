<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet"
	href="${pageContext.request.contextPath }/res/bootstrap-3.3.7-dist/css/bootstrap.min.css">
<script
	src="${pageContext.request.contextPath }/res/js/jquery-3.3.1.min.js"></script>
<script
	src="${pageContext.request.contextPath }/res/bootstrap-3.3.7-dist/js/bootstrap.min.js"></script>
<title>Insert title here</title>
</head>
<body>
	<div align="center">
		<h4>
			<font color="lightblue">新增报警原因</font>
		</h4>
	</div>
	<div align="center">
		<form action="${pageContext.request.contextPath }/alarmreason/add"
			method="post">
			<table border="0" height="200">
				<tr>
					<td>所属报警类型</td>
					<td><select name="typeId">
							<option value=1>设备报警1</option>
							<option value=2>质量报警2</option>
							<option value=3>工艺报警3</option>
					</select></td>
				</tr>
				<tr>
					<td>原因描述</td>
					<td><input type="text" name="description" /></td>
				</tr>
				<tr align="center">
					<td colspan="2"><input class="btn btn-default" type="submit"
						value="保存" /></td>
				</tr>
			</table>
		</form>
	</div>
</body>
</html>