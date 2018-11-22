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
<title>Insert title here</title>
</head>
<body>
	<div>
		<h3 style="margin: 30px">信息修改</h3>
		<form action="${pageContext.request.contextPath }/shift/doUpdate"
			method="post">
			<table style="margin: 10px; margin-left: 30px;">
				<tr>
					<td>序号</td>
					<td><input type="text" class="btn btn-default" name="shiftId"
						readonly="readonly" value="${swss.shiftId }"
						style="margin: 20px; margin-right: 40px;"></td>
					<td>班次名称</td>
					<td><input type="text" class="btn btn-default"
						name="shiftName" style="margin-left: 20px;"
						value="${swss.shiftName }"></td>
				</tr>
				<tr style="width: 85%;">
					<td>所属车间</td>
					<td><select name="shopId" class="btn btn-default"
						style="margin-left: 20px; margin-right: 30px;">
							<option value=1 ${swss.shopId==1? "selected='selected'":'' }>1</option>
							<option value=2 ${swss.shopId==2? "selected='selected'":'' }>2</option>
							<option value=3 ${swss.shopId==3? "selected='selected'":'' }>3</option>
					</select></td>
					<td>所属产线</td>
					<td><select name="linerId" class="btn btn-default"
						style="margin-left: 20px; margin-right: 30px;">
							<option value=1 ${swss.linerId==1? "selected='selected'":'' }>1</option>
							<option value=2 ${swss.linerId==2? "selected='selected'":'' }>2</option>
							<option value=3 ${swss.linerId==3? "selected='selected'":'' }>3</option>
					</select></td>
					<td>所属工位</td>
					<td><select name="placeId" class="btn btn-default"
						style="margin-left: 20px; margin-right: 30px;">
							<option value=1 ${swss.placeId==1? "selected='selected'":'' }>1</option>
							<option value=2 ${swss.placeId==2? "selected='selected'":'' }>2</option>
							<option value=3 ${swss.placeId==3? "selected='selected'":'' }>3</option>
					</select></td>
				</tr>
				<tr>
					<td>开始时间</td>
					<td><input class="btn btn-default" type="text"
						name="shiftStartTime" style="margin: 20px; margin-right: 100px;"
						value="${swss.shiftStartTime }"></td>
					<td>结束时间</td>
					<td><input class="btn btn-default" type="text"
						name="shiftEndTime" style="margin-left: 20px;"
						value="${swss.shiftEndTime }"></td>
				</tr>
				<tr>
					<td colspan="3"><input style="align-content: center;"
						type="submit" value="保存" class="btn btn-default"></td>
				</tr>
			</table>
		</form>
	</div>
</body>
</html>