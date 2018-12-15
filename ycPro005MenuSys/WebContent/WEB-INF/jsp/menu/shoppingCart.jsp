<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<c:set var="basePath"
	value="${pageContext.request.scheme}://${pageContext.request.serverName}:${pageContext.request.localPort}${pageContext.request.contextPath}/" />

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>菜单</h1>
	<table width="360">
		<c:forEach items="${sc.menuList}" var="m">
			<tr>
				<td>${m.name }</td>
				<td>${m.price }</td>
				<td>${m.num }</td>
				<td>${m.num *m.price }</td>
			</tr>
		</c:forEach>
	</table>
	<table width="360">
		<tr>
			<td align="right">${sc.totalPrice }</td>
		</tr>
	</table>
	<br />
	<a href="${basePath }menuSys/order/addOrder">下单</a>


</body>
</html>