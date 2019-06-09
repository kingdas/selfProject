<%@page import="java.util.List"%>
<%@page import="dao.User"%>
<%@page import="dao.Daoimplement"%>
<%@page import="dao.Userdao"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>

	<div align="center">
		<p align="right">
			<a href="rely?m=add"><font size=5>增加用户</font></a>
		</p>
		<h3>用户信息</h3>
		<table width="640" border="10">
			<tr>
				<td>编号</td>
				<td>姓名</td>
				<td>组号</td>
				<td>组名</td>
				<td>修改</td>
				<td>删除</td>
			</tr>
			<c:forEach items="${us}" var="u">
				<tr>
					<td>${u.id }</td>
					<td>${u.name }</td>
					<td>${u.groupid }</td>
					<td>${u.group.groupname }</td>
					<td><a href="rely?m=update&id=${u.id }">修改</a></td>
					<td><a href="rely?m=delete&id=${u.id }">删除</a></td>
				</tr>
			</c:forEach>
		</table>
	</div>
</body>
</html>