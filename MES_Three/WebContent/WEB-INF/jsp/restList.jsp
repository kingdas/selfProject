<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<base href="<%=basePath%>">
<title>My JSP 'restMange.jsp' starting page</title>
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
<script type="text/javascript">
	$(function() {
		$(".upd").hide();
		$(".del").hide();
		$("#upd").click(function() {
			$(".upd").toggle();
			$(".del").hide();
		});
		$("#del").click(function() {
			$(".del").toggle();
			$(".upd").hide();
		});
	});
	function checkDel(restId, restName) {
		if (window.confirm("确认删除序号：" + restId + "，名称：" + restName)) {
			location.href = "${pageContext.request.contextPath }/rest/del/"
					+ restId;
		}
	}
</script>
<style type="text/css">
label {
	margin-right: 10px;
}

select {
	margin-right: 10px;
}

button {
	margin-right: 30px;
}
</style>
</head>
<body>
	<form action="${pageContext.request.contextPath}/rest/search"
		class="form-inline" method="post">
		<label>车间：</label> <select class="form-control" id="shopId"
			name="shopId">
			<option value="0">-----</option>
			<option value="1">1</option>
			<option value="2">2</option>
			<option value="3">3</option>
		</select> <label>产线：</label> <select class="form-control" id="linerId"
			name="linerId">
			<option value="0">-----</option>
			<option value="1">1</option>
			<option value="2">2</option>
			<option value="3">3</option>
		</select> <label>工位：</label> <select class="form-control" id="placeId"
			name="placeId">
			<option value="0">-----</option>
			<option value="1">1</option>
			<option value="2">2</option>
			<option value="3">3</option>
		</select> <label>班次：</label> <select class="form-control" id="shifId"
			name="shiftId">
			<option value="0">----</option>
			<option value="1">1</option>
			<option value="2">2</option>
			<option value="3">3</option>
		</select> <label>休息名称：</label> <input type="text" id="restName" name="restName"
			class="form-control" style="margin-right: 30px;" />
		<button type="submit" class="btn btn-default">
			<span class="glyphicon glyphicon-search"></span> &nbsp;查询
		</button>
	</form>
	<hr />
	<div style="margin-bottom: 20px;">
		<button type="button" class="btn btn-default"
			onclick="window.open('${pageContext.request.contextPath}/rest/add','_self');">
			<span class="glyphicon glyphicon-plus"></span> &nbsp;添加
		</button>
		<button type="button" class="btn btn-default" id="upd">
			<span class="glyphicon glyphicon-pencil"></span> &nbsp;修改
		</button>
		<button type="button" class="btn btn-default" id="del">
			<span class="glyphicon glyphicon-remove"></span> &nbsp;删除
		</button>
		<button type="button" class="btn btn-default">
			<span class="glyphicon glyphicon-share"></span> &nbsp;导出
		</button>
	</div>
	<table class="table table-striped">
		<tr>
			<th>序号</th>
			<th>休息名称</th>
			<th>开始时间</th>
			<th>结束时间</th>
			<th>车间</th>
			<th>产线</th>
			<th>工位</th>
			<th>班次</th>
			<th class="upd">修改</th>
			<th class="del">删除</th>
		</tr>
		<c:forEach items="${rs }" var="r">
			<tr>
				<td>${r.restId }</td>
				<td>${r.restName }</td>
				<td>${r.restStartTime }</td>
				<td>${r.restEndTime }</td>
				<td>${r.shopId }</td>
				<td>${r.linerId }</td>
				<td>${r.placeId }</td>
				<td>${r.shiftId }</td>
				<td class="upd"><input type="button" value="修改"
					onclick="window.open('${pageContext.request.contextPath}/rest/detail/${r.restId }','_self');"
					class="btn btn-default btn-xs" /></td>
				<td class="del"><input type="button" value="删除"
					onclick="checkDel(${r.restId},${r.restName })"
					class="btn btn-default btn-xs" /></td>
			</tr>
		</c:forEach>
	</table>
	<hr />
</body>
</html>
