<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
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
<title>班次列表信息</title>
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
	
	function delConfirm(shiftId){
		if (window.confirm("确认删除此班次信息？")) {
			location.href = "${pageContext.request.contextPath }/shift/delete/"+ shiftId;
		}
	}
</script>
<style type="text/css">
label {
	margin-right: 15px;
}

/* #shopId {
	margin-right: 100px;
}

#linerId {
	margin-right: 100px;
}

#part1 {
	margin: 30px;
	margin-left: 40px;
}
*/
a {
	margin-right: 40px;
}

/* #firstLine {
	align-items: center;
	max-width: 85%;
}

#secondLine {
	width: 55%;
	align-items: center;
} */
</style>
</head>
<body>
	<!-- 查询功能 -->
	<form action="${pageContext.request.contextPath }/shift/search"
		method="post" class="form-inline">
		<div class="form-group">
			<label>所属车间</label> <select name="shopId" id="shopId"
				class="form-control" style="margin-right: 100px;">
				<option value="-1">请选择</option>
				<option value="1">1</option>
				<option value="2">2</option>
				<option value="3">3</option>
			</select>
		</div>
		<div class="form-group">
			<label>所属产线</label> <select name="linerId" id="linerId"
				class="form-control" style="margin-right: 100px;">
				<option value="-1">请选择</option>
				<option value="1">1</option>
				<option value="2">2</option>
				<option value="3">3</option>
			</select>
		</div>
		<div class="form-group">
			<label>所属工位</label> <select name="placeId" id="linerId"
				class="form-control">
				<option value="-1">请选择</option>
				<option value="1">1</option>
				<option value="2">2</option>
				<option value="3">3</option>
			</select>
		</div>
		<br> <br>
		<div class="form-group">
			<label>班次名称</label> <input type="text" name="shiftName"
				class="form-control" placeholder="班次名称" style="margin-right: 200px;">
		</div>
		<button class="btn btn-default" type="submit">
			<span class="glyphicon glyphicon-search" aria-hidden="true"></span>&nbsp;&nbsp;查询&nbsp;
		</button>
	</form>


	<hr style="color: black; size: 5px;" />
	<!-- 增删查改 -->
	<div style="margin: 20px; margin-left: 30px;">
		<a class="btn btn-default"
			href="${pageContext.request.contextPath }/shift/add" role="button"><span
			class="glyphicon glyphicon-plus" aria-hidden="true"></span>&nbsp;&nbsp;增加&nbsp;</a>
		<a id="upd" class="btn btn-default" href="#" role="button"><span
			class="glyphicon glyphicon-pencil" aria-hidden="true"></span>&nbsp;&nbsp;修改&nbsp;</a>
		<a id="del" class="btn btn-default" href="#" role="button"><span
			class="glyphicon glyphicon-minus" aria-hidden="true"></span>&nbsp;&nbsp;删除&nbsp;</a>
		<button class="btn btn-default">
			<span class="glyphicon glyphicon-share-alt" aria-hidden="true"></span>&nbsp;&nbsp;导出&nbsp;
		</button>
	</div>
	<!-- 显示数据表 -->
	<div style="margin: 20px; margin-left: 20px;">
		<table class="table table-hover">
			<tr>
				<th>序号</th>
				<th>班次名称</th>
				<th>开始时间</th>
				<th>结束时间</th>
				<th>所属车间</th>
				<th>所属产线</th>
				<th>所属工位</th>
				<th class="upd">修改</th>
				<th class="del">删除</th>
			</tr>
			<c:forEach items="${swss }" var="s">
				<tr>
					<td>${s.shiftId }</td>
					<td>${s.shiftName }</td>
					<td>${s.shiftStartTime }</td>
					<td>${s.shiftEndTime }</td>
					<td>${s.shopId }</td>
					<td>${s.linerId }</td>
					<td>${s.placeId }</td>
					<td class="upd"><a class="btn btn-default btn-xs"
						href="${pageContext.request.contextPath }/shift/update/${s.shiftId}">修改</a></td>
					<td class="del"><a id="delConfirm" href="#"
						class="btn btn-default btn-xs" onclick="delConfirm(${s.shiftId})">删除</a></td>
				</tr>
			</c:forEach>
		</table>
	</div>
</body>
</html>

