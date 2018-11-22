<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet"
	href="${pageContext.request.contextPath }/res/bootstrap-3.3.7-dist/css/bootstrap.min.css">
<script
	src="${pageContext.request.contextPath }/res/js/jquery-3.3.1.min.js"></script>
<script
	src="${pageContext.request.contextPath }/res/bootstrap-3.3.7-dist/js/bootstrap.min.js"></script>

<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>

<script type="text/javascript">
	$(function() {
		$(".del").hide();
		$(".upd").hide();
		$("#del").click(function() {
			$(".del").toggle();
			$(".upd").hide();
		});
		$("#upd").click(function() {
			$(".upd").toggle();
			$(".del").hide();
		});
	});
</script>
</head>
<body>
	<!-- <button>
		<span>产线管理</span>
	</button>
	<button>
		<span>用户管理</span>
	</button>
	<button>
		<span>角色管理</span>
	</button> -->

	<hr style="color: blue; size: 8px;">
	<form id="form1" class="form1-inline"
		action="${pageContext.request.contextPath}/all/findByCondition"
		method="post">
		<table style="width: 90%; margin: 30px;">
			<tr>
				<td>所属车间 <select name="shopId"
					style="margin-left: 15px; margin-right: 30px;">
						<option value="0">--</option>
						<option value="1">1</option>
						<option value="2">2</option>
						<option value="3">3</option>
				</select></td>
				<td>产线名称<input style="margin-left: 15px; margin-right: 30px;"
					type="text" name="linerName" /></td>
				<td>产线主管<input style="margin-left: 15px; margin-right: 30px;"
					type="text" name="linerAdmin" /></td>
				<td><button style="margin-left: 15px; margin-right: 30px;"
						type="submit">
						<span class="glyphicon glyphicon-zoom-in"></span>&nbsp;&nbsp; 查询
					</button></td>
			</tr>
		</table>
	</form>
	<hr style="color: blue; size: 8px;">
	<table style="margin-left: 40px; margin-top: 20px;">
		<tr>
			<td><a style="margin-left: 20px; margin-right: 30px"
				class="btn btn-default"
				href="${pageContext.request.contextPath}/all/add" role="button">
					<span class="glyphicon glyphicon-plus"></span>&nbsp;添加
			</a></td>
			<td><a style="margin-right: 35px; margin-left: 20px;" id="upd"
				class="btn btn-default" type="submit" href="#"><span
					class="glyphicon glyphicon-pencil"></span>&nbsp;修改</a></td>
			<td><a style="margin-right: 35px; margin-left: 20px;" id="del"
				class="btn btn-default" type="submit"><span
					class="glyphicon glyphicon-minus"></span>&nbsp;刪除</a></td>
			<td><a href="#" type="submit" class="btn btn-default"><span
					class="glyphicon glyphicon-share-alt"></span>&nbsp;导出</a></td>
		</tr>
	</table>

	<table class="table table-striped"
		style="margin-left: 40px; margin-top: 20px;">
		<tr>
			<th>序号</th>
			<th>产线名称</th>
			<th>产线主管</th>
			<th>所属车间</th>
			<th class="del">删除</th>
			<th class="upd">修改</th>
		</tr>
		<c:forEach items="${sys}" var="sy">
			<tr>
				<td>${sy.linerId}</td>
				<td>${sy.linerName}</td>
				<td>${sy.linerAdmin}</td>
				<td>${sy.shopId}</td>
				<td class="del"><a
					href="${pageContext.request.contextPath}/all/del/${sy.linerId}">删除
				</a></td>
				<td class="upd"><a href="#">修改</a></td>
			</tr>
		</c:forEach>
	</table>
</body>
</html>