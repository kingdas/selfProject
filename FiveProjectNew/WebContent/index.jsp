<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<script type="text/javascript">
		/* location.href = "${pageContext.request.contextPath }/liner/findAll"; */
		 /* location.href="${pageContext.request.contextPath}/cont/findAll"; */
		// location.href="${pageContext.request.contextPath}/cont2/findAll";//cont2为产品管理
		 //location.href="${pageContext.request.contextPath}/user/find";//cont2为产品管理
		 //location.href="${pageContext.request.contextPath}/test/findall";
		// location.href="${pageContext.request.contextPath}/cont3/findAll";
		location.href = "${pageContext.request.contextPath}/userbj/alarm";
	</script>
	<%-- <jsp:forward page="${pageContext.request.contextPath }/liner/findAll"></jsp:forward> --%>
</body>
</html>