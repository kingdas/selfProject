<%@page import="ssm.model.OrderModel"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
		session.invalidate();
	%>
	<div align="center">
		<h3>热菜菜单</h3>
		<form action="coldDishes.jsp" method="post">
			<table border="0" align="center">
				<tr>
					<td align="center" valign="middle"><img alt="图片无法显示"
						src="/images/hotDishes"></td>
					<td align="center" valign="middle">数量<input type="text"
						name="num1" width="30"></td>
				</tr>
				<tr>
					<td colspan="2" align="center">红烧肉18元</td>
				</tr>
				<tr>
					<td align="center" valign="middle"><img alt="图片无法显示"
						src="/images/hotDishes"></td>
					<td align="center" valign="middle">数量<input type="text"
						name="num3" width="30"></td>
				</tr>
				<tr>
					<td colspan="2" align="center">宫保鸡丁14元</td>
				</tr>
				<tr>
					<td align="center" valign="middle"><img alt="图片无法显示"
						src="/images/hotDishes"></td>
					<td align="center" valign="middle">数量<input type="text"
						name="num3" width="30"></td>
				</tr>
				<tr>
					<td colspan="2" align="center">青椒肉丝15元</td>
				</tr>
				<tr>
					<td colspan="2" align="center"><input type="submit" value="凉菜"></td>
				</tr>
			</table>
		</form>
	</div>
</body>
</html>