<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
	response.setContentType("application/vnd.ms-excel");
	response.setHeader("Content-Disposition", "inline; filename="
        + "excel.xls"); %>
        <table class="table table-hover">

			<thead>
				<tr>
					<th>序号</th>
					<th>组名称</th>
					<th>组描述</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach items="${s}" var="ss">
					<tr>
						<td>${ss.groupId}</td>
						<td>${ss.groupName}</td>
						<td>${ss.describeGroup}</td>
					</tr>
				</c:forEach>
			</tbody>
		</table>
</body>
</html>