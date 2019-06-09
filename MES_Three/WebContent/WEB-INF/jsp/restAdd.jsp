
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<base href="<%=basePath%>">
<style type="text/css">
label {
	width: 200px;
	float: right;
}
</style>
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
	<div align="center">
		<h3>新增休息</h3>
		<hr>
		<form action="${pageContext.request.contextPath}/rest/doAdd"
			method="post" class="form-inline">
			<div class="form-group">
				<label class="col-sm-2 control-label">休息名称：</label>
				<div class="col-sm-10">
					<input type="text" id="restName" name="restName"
						class="form-control" style="width: 500px;" />
				</div>
			</div>
			<br> <br>
			<div class="form-group">
				<label class="col-sm-2 control-label">车间：</label>
				<div class="col-sm-4">
					<select class="form-control" id="shopId" name="shopId"
						style="width: 200px;">
						<option value="1">1</option>
						<option value="2">2</option>
						<option value="3">3</option>
					</select>
				</div>
				<label class="col-sm-2 control-label" style="float: left;">产线：</label>
				<div class="col-sm-4">
					<select class="form-control" id="linerId" name="linerId"
						style="width: 200px; float: left;">
						<option value="1">1</option>
						<option value="2">2</option>
						<option value="3">3</option>
					</select>
				</div>
			</div>
			<br> <br>
			<div class="form-group">
				<label class="col-sm-2 control-label">工位：</label>
				<div class="col-sm-4">
					<select class="form-control" id="placeId" name="placeId"
						style="width: 200px;">
						<option value="1">1</option>
						<option value="2">2</option>
						<option value="3">3</option>
					</select>
				</div>
				<label class="col-sm-2 control-label">班次：</label>
				<div class="col-sm-4">
					<select class="form-control" id="shiftId" name="shiftId"
						style="width: 200px;">
						<option value="1">1</option>
						<option value="2">2</option>
						<option value="3">3</option>
					</select>
				</div>
			</div>
			<br> <br>
			<div class="form-group">
				<label class="col-sm-2 control-label">开始时间：</label>
				<div class="col-sm-4">
					<input type="text" id="restStartTime" name="restStartTime"
						class="form-control" style="width: 200px;" />
				</div>
				<label class="col-sm-2 control-label">结束时间：</label>
				<div class="col-sm-4">
					<input type="text" id="restEndTime" name="restEndTime"
						class="form-control" style="width: 200px;" />
				</div>
			</div>
			<br> <br>
			<div class="form-group">
				<input type="submit" class="btn btn-default btn-sm" value="提交">
				&nbsp;&nbsp;<input type="button" name="reback"
					class="btn btn-default btn-sm"
					onclick="javascript:history.back(-1);" value="返回">
			</div>
		</form>
	</div>
</body>
</html>
