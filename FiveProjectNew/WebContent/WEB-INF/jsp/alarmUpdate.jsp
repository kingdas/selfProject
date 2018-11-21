<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<div align="center">
		<form action="${pageContext.request.contextPath}/userbj/update"
			method="post">
			<table class="table table-bordered">
				<tr>
					<td>ID:</td>
					<td><input type="text" name="reasonId" value="${m.reasonId}"
						readonly="readonly" /></td>
				</tr>
				<tr>
					<td>报警类型:</td>
					<td><select name="typeId" value="typeId">
							<option>设备报警1</option>
							<option>质量报警2</option>
							<option>工艺报警3</option>
					</select></td>
				</tr>
				<tr>
					<td>原因描述:</td>
					<td><input type="text" name="description"
						value="${m.description}"></td>
				</tr>
				<tr>
					<td colspan="2" align="center"><input class="btn btn-default"
						type="submit" value="保存"></td>
				</tr>
				<tr>
					<td colspan="2" align="center"><a
						href="${pageContext.request.contextPath}/userbj/alarm"
						method="post">返回</a></td>
				</tr>
			</table>
		</form>
	</div>
</body>
</html>