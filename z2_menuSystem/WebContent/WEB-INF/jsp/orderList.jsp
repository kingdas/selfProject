<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<div align="center">
		<h3>订单列表</h3>
		<table align="center" border="1">
			<tr>
				<th>编号</th>
				<th>菜名</th>
				<th>菜单名</th>
				<th>份数</th>
			</tr>
			<c:forEach items="${os }" var="o">
				<tr>
					<td>${o.id }</td>
					<td>${o.menuId }</td>
					<td>${o.menuKind==1?'热菜':'凉菜' }</td>
					<td>${o.num }</td>
				</tr>
			</c:forEach>
		</table>
	</div>
</body>
</html>