<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet"
	href="${pageContext.request.contextPath }/res/bootstrap-3.3.7-dist/css/bootstrap.min.css">
<script
	src="${pageContext.request.contextPath }/res/js/jquery-3.3.1.min.js"></script>
<script
	src="${pageContext.request.contextPath }/res/bootstrap-3.3.7-dist/js/bootstrap.min.js"></script>
<title>Insert title here</title>
</head>
<body>
	<div align="center">
		<h3>工位修改</h3>
		<br>
		<form
			action="${pageContext.request.contextPath }/position/doUpdate/${l.placeId}"
			method="post" class="form-inline">
			<div class="form-group">
				<label class="col-sm-2 control-label">工位名称：</label>
				<div class="col-sm-4">
					<input type="text" name="placeName" class="form-control"
						value="${l.placeName }" />
				</div>
				<label class="col-sm-2 control-label">工位主管：</label>
				<div class="col-sm-4">
					<input type="text" class="form-control" name="placeAdmin"
						value="${l.placeAdmin }" />
				</div>
			</div>
			<br> <br>
			<div class="form-group">
				<label class="col-sm-2 control-label">工位车间：</label>
				<div class="col-sm-4">
					<input type="text" class="form-control" name="shopId"
						value="${l.shopId }" />
				</div>
				<label class="col-sm-2 control-label">所属产线：</label>
				<div class="col-sm-4">
					<input type="text" class="form-control" name="linerId"
						value="${l.linerId }" />
				</div>
			</div>
			<br> <br>
			<div class="form-group" align="center">
				<input type="submit" class="btn btn-default btn-sm" value="修改" />&nbsp;&nbsp;<input
					type="button" name="reback" class="btn btn-default btn-sm"
					onclick="javascript:history.back(-1);" value="返回">
			</div>
		</form>
	</div>
</body>
</html>