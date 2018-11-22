<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<base href="<%=basePath%>">

<title>My JSP 'restAdd.jsp' starting page</title>

<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="expires" content="0">
<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
<meta http-equiv="description" content="This is my page">
<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet"
	href="${pageContext.request.contextPath}/res/bootstrap-3.3.7-dist/css/bootstrap.min.css">
<script type="text/javascript"
	src="${pageContext.request.contextPath}/res/js/jquery-3.3.1.min.js"></script>
<script
	src="${pageContext.request.contextPath}/res/bootstrap-3.3.7-dist/js/bootstrap.min.js"></script>
</head>

<body>
	<h3>新增休息</h3>
	<hr />
	<form action="${pageContext.request.contextPath}/rest/doAdd">

		<nobr>休息名称：</nobr>
		<input style="margin: 25px; margin-right: 25px;" type="text"
			id="restName" name="restName" class="btn btn-default btn-sm" />
		<nobr>车间：</nobr>
		<select style="margin: 20px;" class="btn btn-default btn-sm"
			id="shopId" name="shopId">
			<option value="1">1</option>
			<option value="2">2</option>
			<option value="3">3</option>
		</select>
		<nobr>产线：</nobr>
		<select style="margin: 20px;" class="btn btn-default btn-sm"
			id="linerId" name="linerId">
			<option value="1">1</option>
			<option value="2">2</option>
			<option value="3">3</option>
		</select>
		<nobr>工位：</nobr>
		<select style="margin: 20px;" class="btn btn-default btn-sm"
			id="placeId" name="placeId">
			<option value="1">1</option>
			<option value="2">2</option>
			<option value="3">3</option>
		</select> <br>
		<nobr>班次：</nobr>
		<select style="margin: 20px;" class="btn btn-default btn-sm"
			id="shifId" name="shiftId">
			<option value="1">1</option>
			<option value="2">2</option>
			<option value="3">3</option>
		</select>
		<nobr>开始时间：</nobr>
		<input style="margin: 20px; margin-right: 25px;" type="time"
			id="restStartTime" name="restStartTime" />
		<nobr>结束时间：</nobr>
		<input style="margin: 20px; margin-right: 25px;" type="time"
			id="restEndTime" name="restEndTime" /> <br>
		<button type="submit" class="btn btn-default ">
			<span class="glyphicon glyphicon-ok" aria-hidden="true"></span> 提交
		</button>

	</form>
</body>
</html>
