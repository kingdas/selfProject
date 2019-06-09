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
	<form
		action="${pageContext.request.contextPath }/position/findByCondition"
		method="post" class="form-inline">
		<label>所属车间：</label> <select name="shopId" style="margin-right: 20px"
			class="btn btn-default">
			<option value="0">----</option>
			<option value="1">1</option>
			<option value="2">2</option>
			<option value="3">3</option>
		</select> <label>所属产线：</label> <select name="linerId"
			style="margin-right: 20px" class="btn btn-default">
			<option value="0">----</option>
			<option value="1">1</option>
			<option value="2">2</option>
			<option value="3">3</option>
		</select> <label>工位名称：</label> <input type="text" name="placeName"
			style="margin-right: 20px" class="btn btn-default" /> <label>工位主管：</label><input
			type="text" name="placeAdmin" class="btn btn-default"
			style="margin-right: 20px" />
		<button class="btn btn-default" type="submit">
			<span class="glyphicon glyphicon-search"></span>&nbsp;&nbsp;查询
		</button>
	</form>
	<hr>
	<table style="margin-left: 20px; margin-top: 20px;">
		<tr>
			<td><a class="btn btn-default"
				href="${pageContext.request.contextPath}/page/positionAdd"> <span
					class="glyphicon glyphicon-plus"></span>&nbsp;添加
			</a></td>
			<td><a style="margin-left: 20px;" id="upd"
				class="btn btn-default" type="submit" href="#"><span
					class="glyphicon glyphicon-pencil"></span>&nbsp;修改</a></td>
			<td><a style="margin-left: 20px;" id="del"
				class="btn btn-default" type="submit" href="#"><span
					class="glyphicon glyphicon-minus"></span>&nbsp;删除</a></td>
			<td><a href="#" style="margin-left: 20px;" type="submit"
				class="btn btn-default"><span
					class="glyphicon glyphicon-share-alt"></span>&nbsp;导出</a></td>
		</tr>
	</table>

	<table class="table table-striped"
		style="margin-left: 20px; margin-top: 20px;">
		<thead>
			<tr>
				<th>编号</th>
				<th>工位名称</th>
				<th>工位主管</th>
				<th>所属车间</th>
				<th>所属产线</th>
				<th class="upd">修改</th>
				<th class="del">删除</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach items="${li}" var="l">
				<tr>
					<td>${l.placeId }</td>
					<td>${l.placeName }</td>
					<td>${l.placeAdmin }</td>
					<td>${l.shopId }</td>
					<td>${l.linerId }</td>
					<td class="upd"><a class="btn btn-default btn-xs"
						href="${pageContext.request.contextPath}/position/update/${l.placeId}">修改</a></td>
					<td class="del"><a class="btn btn-default btn-xs"
						href="${pageContext.request.contextPath}/position/del/${l.placeId}">删除</a></td>
				</tr>
			</c:forEach>
		</tbody>
	</table>
</body>
</html>