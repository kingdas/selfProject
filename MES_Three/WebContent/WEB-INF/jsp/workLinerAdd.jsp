<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet"
	href="${pageContext.request.contextPath }/res/bootstrap-3.3.7-dist/css/bootstrap.min.css">
<script
	src="${pageContext.request.contextPath }/res/js/jquery-3.3.1.min.js"></script>
<script
	src="${pageContext.request.contextPath }/res/bootstrap-3.3.7-dist/js/bootstrap.min.js"></script>

</head>
<body>
	<div align="center">
		<h3>新增产线</h3>
		<br>
		<form action="${pageContext.request.contextPath}/liner/doAdd"
			method="post" class="form-horizontal">
			<div class="form-group">
				<label class="col-sm-5 control-label">产线名称：</label>
				<div class="col-sm-7">
					<input type="text" name="linerName" class="form-control"
						style="width: 200px; display: inline; float: left;" />
				</div>
			</div>
			<div class="form-group">
				<label class="col-sm-5 control-label">产线主管：</label>
				<div class="col-sm-7">
					<input type="text" name="linerAdmin" class="form-control"
						style="width: 200px; display: inline; float: left;" />
				</div>
			</div>
			<div class="form-group">
				<label class="col-sm-5 control-label">所属车间：</label>
				<div class="col-sm-7">
					<select name="shopId" class="form-control"
						style="width: 200px; display: inline; float: left;">
						<option value="1">1</option>
						<option value="2">2</option>
						<option value="3">3</option>
					</select>
				</div>
			</div>
			<input type="submit" value="添加" class="btn btn-default btn-sm">&nbsp;&nbsp;<input
				type="button" name="reback" class="btn btn-default btn-sm"
				onclick="javascript:history.back(-1);" value="返回">
		</form>
	</div>
</body>
</html>