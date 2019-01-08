<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<div align="center">
		<table style="align-content: center;">
			<tr>
				<td colspan="4" align="center"><h4>申请列表</h4></td>
			</tr>
			<tr style="background: gray;">
				<th>标题</th>
				<th width="100" align="center">借款金额</th>
				<th width="170" align="center">借款日期</th>
				<th>状态</th>
			</tr>
			<c:forEach items="${li }" var="lo">
				<tr>
					<td>${lo.title }</td>
					<td style="align-content: center;">${lo.amount }</td>
					<td width="170" align="center">${lo.applyDate}</td>
					<td>${lo.status == 0?'未审批':lo.status==1?'审批通过':'审批驳回' }
				</tr>
			</c:forEach>
		</table>
	</div>
</body>
</html>