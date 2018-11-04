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
		String[] num = new String[] { num1, num2 };
		for (int i = 0; i < num.length; i++) {
			if (num[i] != null && Integer.parseInt(num[i]) > 0) {
				OrderModel om = new OrderModel((i + 1), 2, Integer.parseInt(num[i]));
				session.setAttribute("cold" + i, om);
			}
		}
		response.sendRedirect("${pageContext.request.contextPath}/order/orderList");
	%>
</body>
</html>