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
<script
	src="${pageContext.request.contextPath}/res/My97DatePicker/WdatePicker.js"></script>
	
<title>Insert title here</title>
</head>
<body>
	<div align="center">
		<form action="${pageContext.request.contextPath}/bcl/add"
			method="post">
			<table class="table table-bordered" style="width: 850px;">
				<tr>
					<td>班次名称</td>
					<td><input class="form-control" type="text" id="shiftname"
						name="shiftname" /><br></td>
				</tr>
				<tr>
					<td>所属车间</td>
					<td><input class="form-control" type="text" id="shopid"
						name="shopid" /><br></td>
					<td>所属产线</td>
					<td><input class="form-control" type="text" id="linerid"
						name="linerid" /><br></td>
					<td>所属工位</td>
					<td><input class="form-control" type="text" id="placeid"
						name="placeid" /><br></td>
				</tr>
				<tr>
					<!-- <td>开始时间</td>
					<td><input class="form-control" type="text"
						name="shiftstarttime" /></td>
					<td>结束时间</td>
					<td><input class="form-control" type="text"
					name="shiftendtime" /></td> -->
					<td>开始时间</td>
					<td><input type="text" id="startTime" name="shiftstarttime"
						class="Wdate" style="margin-top: 2px; height: 30px; width: 210px;"
						onfocus="WdatePicker({dateFmt:'HH:mm:ss'})" /><br></td>
					<td>结束时间</td>
					<td><input type="text" id="startTime" name="shiftendtime"
						class="Wdate" style="margin-top: 2px; height: 30px; width: 180px;"
						onfocus="WdatePicker({dateFmt:'HH:mm:ss'})" /><br></td>
				</tr>
				<!-- <tr>
					<td colspan="3"><button type="submit" class="btn btn-default">
							<span class="glyphicon glyphicon-ok">&nbsp;保存</span>
						</button><br></td>
				</tr> -->
			</table>
			<br>
			<button type="submit" class="btn btn-default"
				style="float: none; height: 35px;">
				<span class="glyphicon glyphicon-ok">&nbsp;保存</span>
			</button>
		</form>
	</div>
</body>
</html>