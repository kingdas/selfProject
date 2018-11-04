<%@page import="java.util.List"%>
<%@page import="user.User"%>
<%@page import="dao.Daoimplement"%>
<%@page import="dao.Userdao"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Information</title>
<script type="text/javascript">
	function myOpen(url) {
		//alert(url);
		ww = window.screen.width;//屏幕的宽度
		wh = window.screen.height;//屏幕的高度
		width = 360;
		height = 230;
		l = (ww - width) / 2;
		t = (wh - height) / 2;
		window.open(url, "xx", "top=" + t + ",left=" + l
				+ ",width=360,height=200,location='no',revisable='no'");
	}
	function del(id,name)
	{
		if(window.confirm("确认删除用户："+name))
			{
		location.href ="${pageContext.request.contextPath }/rely?m=delete&operator_id="+id;
			}
	}
</script>
</head>
<body bgcolor="#77cc77">
	<div align="center">
		<p align="left">
			<a href="#"
				onclick="myOpen('${pageContext.request.contextPath }/userAdd.jsp')"><font
				size=5>创建用户</font></a>
		</p>
		<form action="${pageContext.request.contextPath }/rely" method="post">
			<input type="hidden" name="m" value="statusName" />
			<table width="640" border="0">
				<tr>
					<td>按姓名查找:</td>
					<td><input type="text" name="name" /></td>
					<td><select name="status">
							<option value="-1">---</option>
							<option value="1">有效</option>
							<option value="0">无效</option>
					</select></td>
					<td><input type="submit" value="查询" /></td>
				</tr>
			</table>
		</form>
		<br />
		<table width="640" border="0">
			<tr>
				<td>账号</td>
				<td>姓名</td>
				<td>密码</td>
				<td>状态</td>
				<td>修改</td>
				<td>删除</td>
			</tr>
			<c:forEach items="${us}" var="u">
				<tr>
					<td>${u.operator_id }</td>
					<td>${u.name }</td>
					<td>${u.password }</td>
					<td>${u.status==1?'有效':'无效' }</td>
					<td><a
						href="${pageContext.request.contextPath }/rely?m=update&operator_id=${u.operator_id}">修改</a></td>
					<td><a href="#" onclick="del(${u.operator_id},'${u.name}')">删除</a></td>
				</tr>
			</c:forEach>
		</table>
	</div>
</body>
</html>