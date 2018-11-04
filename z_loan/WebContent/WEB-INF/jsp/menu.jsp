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
	<div align="left">
		<table border="0">
			<tr>
				<td align="left"><a
					href="${pageContext.request.contextPath }/loan/loadAction"
					target="cnt">查看申请列表</a></td>
			</tr>
			<tr>
				<td align="left"><a
					href="${pageContext.request.contextPath }/page/apply" target="cnt">发起申请贷款</a></td>
			</tr>
			<c:if test="${lm.groupId==1 }">
				<tr>
					<td align="left"><a href="#">审批申请</a></td>
				</tr>
			</c:if>
			<tr>
				<td align="left"><a
					href="${pageContext.request.contextPath }/login.jsp" target="_top">重新登录</a></td>
			</tr>
		</table>
	</div>
</body>
</html>