<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet"
	href="${pageContext.request.contextPath }/res/bootstrap-3.3.7-dist/css/bootstrap.min.css">
<script
	src="${pageContext.request.contextPath }/res/js/jquery-3.3.1.min.js"></script>
<script
	src="${pageContext.request.contextPath }/res/bootstrap-3.3.7-dist/js/bootstrap.min.js"></script>

<link rel="stylesheet" type="text/css"
	href="${pageContext.request.contextPath }/res/time/jquery-ui.css" />
<script type="text/javascript"
	src="${pageContext.request.contextPath }/res/js/jquery-3.3.1.min.js"></script>
<script type="text/javascript"
	src="${pageContext.request.contextPath }/res/time/jquery-ui.js"></script>
<script type="text/javascript"
	src="${pageContext.request.contextPath }/res/time/jquery-ui-timepicker-addon.js"></script>

<title>Insert title here</title>
<script type="text/javascript">
	function emptyCheck() {
		str = "";
		shiftName = document.getElementById("shiftName").value;
		shiftStartTime = document.getElementById("shiftStartTime").value;
		shiftEndTime = document.getElementById("shiftEndTime").value;
		if (shiftName == null || shiftName.trim().length < 1) {
			str += "班次名称  ";
		}
		if (shiftStartTime == null || shiftStartTime.trim().length < 1) {
			str += "开始时间   ";
		}
		if (shiftEndTime == null || shiftEndTime.trim().length < 1) {
			str += "结束时间   ";
		}
		if (str.length > 0) {
			str += "需要填写"
			alert(str);
			return false;
		}
		return true;
	}

	$(function() {
		$("#shiftStartTime").timepicker();
		$("#shiftEndTime").timepicker();
	});
</script>
</head>
<body>
	<h3 style="margin: 20px; margin-left: 50px;">新增班次</h3>
	<hr style="color: black; size: 5px;" />
	<form action="${pageContext.request.contextPath }/shift/doAdd"
		method="post" onsubmit="return emptyCheck();">
		<table style="margin: 10px; margin-left: 30px;">
			<tr>
				<td>班次名称</td>
				<td><input type="text" class="btn btn-default" name="shiftName"
					id="shiftName" style="margin-left: 20px;"></td>
			</tr>
			<tr style="width: 85%;">
				<td>所属车间</td>
				<td><select name="shopId" class="btn btn-default"
					style="margin-left: 20px; margin-right: 30px;">
						<option value="1">1</option>
						<option value="2">2</option>
						<option value="3">3</option>
				</select></td>
				<td>所属产线</td>
				<td><select name="linerId" class="btn btn-default"
					style="margin-left: 20px; margin-right: 30px;">
						<option value="1">1</option>
						<option value="2">2</option>
						<option value="3">3</option>
				</select></td>
				<td>所属工位</td>
				<td><select name="placeId" class="btn btn-default"
					style="margin-left: 20px; margin-right: 30px;">
						<option value="1">1</option>
						<option value="2">2</option>
						<option value="3">3</option>
				</select></td>
			</tr>
			<tr>
				<td>开始时间</td>
				<td><input class="btn btn-default" type="text"
					id="shiftStartTime" name="shiftStartTime"
					style="margin: 20px; margin-right: 100px;"></td>
				<td>结束时间</td>
				<td><input class="btn btn-default" type="text"
					id="shiftEndTime" name="shiftEndTime" style="margin-left: 20px;"></td>
			</tr>
			<tr>
				<td colspan="3"><input style="align-content: center;"
					type="submit" value="保存" class="btn btn-default"></td>
			</tr>
		</table>
	</form>
</body>
</html>