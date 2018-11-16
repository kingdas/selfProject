<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet"
	href="${pageContext.request.contextPath}/res/bootstrap-3.3.7-dist/css/bootstrap.min.css">
<script src="${pageContext.request.contextPath}/res/js/jquery-1.11.0.js"></script>
<script
	src="${pageContext.request.contextPath}/res/bootstrap-3.3.7-dist/js/bootstrap.min.js"></script>

<title>Insert title here</title>
</head>
<body>
	<div align="center">
		<h3>修改用户</h3>
		<form action="${pageContext.request.contextPath }/bcl/doupdate"
			method="post">
			<table class="table table-unbordered" style="width: 320px;">
				<tr>
					<td>序号</td>
					<td><input type="text" class="form-control" name="shiftid"
						value="${u.shiftid }" readonly="readonly" /></td>
				</tr>
				<tr>
					<td>班次名称</td>
					<td><input type="text" class="form-control" name="shiftname"
						value="${u.shiftname }" /></td>
				</tr>
				<tr>
					<td>开始时间</td>
					<td><input type="text" id="startTime" name="shiftstarttime"
						value="${u.shiftstarttime }" class="Wdate"
						style="margin-top: 2px; height: 30px; width: 230px;"
						onfocus="WdatePicker({dateFmt:'HH:mm:ss'})" /></td>
				</tr>
				<tr>
					<td>结束时间</td>
					<td><input type="text" id="startTime" name="shiftendtime"
						class="Wdate" style="margin-top: 2px; height: 30px; width: 230px;"
						onfocus="WdatePicker({dateFmt:'HH:mm:ss'})" /><br></td>
				<tr>
					<td>所属车间</td>
					<td><input type="text" class="form-control" name="shopid"
						value="${u.shopid }" />
				</tr>
				<tr>
					<td>所属产线</td>
					<td><input type="text" class="form-control" name="linerid"
						value="${u.linerid }" />
				</tr>
				<tr>
					<td>所属ID</td>
					<td><input type="text" class="form-control" name="placeid"
						value="${u.placeid }" />
				</tr>
			</table>
			<button type="submit" class="btn btn-default"
				style="float: none; height: 35px;">
				<span class="glyphicon glyphicon-ok">&nbsp;保存</span>
			</button>
		</form>
	</div>
</body>
</html>