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
</head>
<body>
	<h3>新增休息</h3>
	<hr />
	<form action="${pageContext.request.contextPath}/rest/doUpdate"
		method="post">
		<input type="hidden" name="restId" value="${swr.restId }" />
		<nobr>休息名称：</nobr>
		<input type="text" name="restName" value="${swr.restName }" />
		<nobr>车间：</nobr>
		<select style="margin: 20px;" name="shopId">
			<option value="1" ${swr.shopId==1? "selected='selected'":''}>1</option>
			<option value="2" ${swr.shopId==2? "selected='selected'":''}>2</option>
			<option value="3" ${swr.shopId==3? "selected='selected'":''}>3</option>
		</select>
		<nobr>产线：</nobr>
		<select style="margin: 20px;" name="linerId">
			<option value="1" ${swr.linerId==1? "selected='selected'":''}>1</option>
			<option value="2" ${swr.linerId==2? "selected='selected'":''}>2</option>
			<option value="3" ${swr.linerId==3? "selected='selected'":''}>3</option>
		</select>
		<nobr>工位：</nobr>
		<select style="margin: 20px;" name="placeId">
			<option value="1" ${swr.placeId==1? "selected='selected'":''}>1</option>
			<option value="2" ${swr.placeId==2? "selected='selected'":''}>2</option>
			<option value="3" ${swr.placeId==3? "selected='selected'":''}>3</option>
		</select>
		<nobr>班次：</nobr>
		<select style="margin: 20px;" name="shiftId">
			<option value="1" ${swr.shiftId==1? "selected='selected'":''}>1</option>
			<option value="2" ${swr.shiftId==2? "selected='selected'":''}>2</option>
			<option value="3" ${swr.shiftId==3? "selected='selected'":''}>3</option>
		</select>
		<nobr>开始时间：</nobr>
		<input style="margin: 20px;" type="time" name="restStartTime"
			value="${swr.restStartTime }" />
		<nobr>结束时间：</nobr>
		<input style="margin: 20px;" type="time" name="restEndTime"
			value="${swr.restEndTime }" /> <br> <input type="submit"
			value="提交" />

	</form>
</body>
</html>
