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
	<h3 align="center">增加用户</h3>
	<form action="${pageContext.request.contextPath }/user/doAdd"
		method="post">
		<table width="500" border="1" align="center">
			<tr>
				<td>编号</td>
				<td><input type="text" name="id" />输入一个合适的编号（可以不填）</td>
			</tr>
			<tr>
				<td>用户名</td>
				<td><input type="text" name="name" /></td>
			</tr>
			<tr>
				<td>组名</td>
				<td><select name="groupid">
						<c:forEach items="${gs }" var="g">
							<option value="${g.id}">${g.groupname}</option>
						</c:forEach>
				</select></td>
			</tr>
			<tr>
				<td colspan="2" align="center"><input type="submit" value="增加" /></td>
			</tr>
		</table>
	</form>
</body>
</html>