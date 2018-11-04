<%@page import="ssm.model.OrderModel"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
		String num1 = request.getParameter("num1");
		String num2 = request.getParameter("num2");
		String num3 = request.getParameter("num3");
		String[] num = new String[] { num1, num2, num3 };
		for (int i = 0; i < num.length; i++) {
			if (num[i] != null && Integer.parseInt(num[i]) > 0) {
				OrderModel om = new OrderModel((i + 1), 1, Integer.parseInt(num[i]));
				session.setAttribute("hot" + i, om);
			}
		}
	%>
	<div align="center">
		<p align="left">
			<a href="hotDishes.jsp"><font size=4>返回</font></a>
		</p>
		<h3>凉菜菜单</h3>
		<form action="dealOrder.jsp" method="post">
			<table align="center" border="0">
				<tr>
					<td align="center" valign="middle"><img alt="图片无法显示"
						src="/images/..."></td>
					<td align="center" valign="middle">数量:<input type="text"
						name="num1" width="30"></td>
				</tr>
				<tr>
					<td align="center" colspan="2">腐竹7元</td>
				</tr>
				<tr>
					<td align="center" valign="middle"><img alt="图片无法显示"
						src="/images/..."></td>
					<td align="center" valign="middle">数量:<input type="text"
						name="num2" width="30"></td>
				</tr>
				<tr>
					<td align="center" colspan="2">青菜9元</td>
				</tr>
				<tr>
					<td align="center" colspan="2"><input type="submit" value="下单"></td>
				</tr>
			</table>
		</form>
	</div>
</body>
</html>