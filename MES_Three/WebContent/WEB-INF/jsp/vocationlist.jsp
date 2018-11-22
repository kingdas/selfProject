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
		$(".update").hide();
		$("#del").click(function() {
			$(".del").toggle();
			$(".update").hide();
		});
		$("#update").click(function() {
			$(".update").toggle();
			$(".del").hide();
		});
	});
</script>
</head>
<body>
	<div align="center">
		<form
			action="${pageContext.request.contextPath }/vocation/findByShopOrName"
			method="post">
			<table style="margin-top: 50px;">
				<tr>
					<td>车&nbsp;&nbsp;间<select name="shopId"
						style="margin-right: 20px">
							<option value="-1"></option>
							<option value="1">1</option>
							<option value="2">2</option>
							<option value="3">3</option>
					</select>
					</td>
					<td>产&nbsp;&nbsp;线<select name="linerId"
						style="margin-right: 20px">
							<option value="-1"></option>
							<option value="1">1</option>
							<option value="2">2</option>
							<option value="3">3</option>
					</select>
					</td>
					<td>工&nbsp;&nbsp;位<select name="placeId"
						style="margin-right: 20px">
							<option value="-1"></option>
							<option value="1">1</option>
							<option value="2">2</option>
							<option value="3">3</option>
					</select>
					</td>
				</tr>
				<tr>
					<td>班&nbsp;&nbsp;次<select name="shiftId"
						style="margin-right: 20px">
							<option value="-1"></option>
							<option value="1">1</option>
							<option value="2">2</option>
							<option value="3">3</option>
					</select>
					</td>
					<td>假期名称<input type="text" name="holidayName"
						style="margin-right: 20px" />
					</td>
					<td><input class="btn btn-default" type="submit" value="查詢"></td>
				</tr>
			</table>
		</form>
	</div>
	<hr />
	<div align="center" style="margin-top: 50px;">
		<p>
			<a class="btn btn-default"
				href="${pageContext.request.contextPath }/vocation/add"><span
				class="glyphicon glyphicon-plus"></span>增加</a> <a id="del"
				class="btn btn-default" href="#"><span
				class="glyphicon glyphicon-minus"></span>删除</a> <a id="update"
				class="btn btn-default" href="#"><span
				class="glyphicon glyphicon-pencil"></span>修改</a>
		</p>
	</div>
	<div align="center">
		<table width="640" border="2">
			<thead>
				<tr>
					<th>序号</th>
					<th>假期名称</th>
					<th>开始时间</th>
					<th>结束时间</th>
					<th>车间</th>
					<th>产线</th>
					<th>工位</th>
					<th>班次</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach items="${us}" var="u">
					<tr>
						<td>${u.holidayId}</td>
						<td>${u.holidayName}</td>
						<td>${u.holidayStartTime}</td>
						<td>${u.holidayEndTime}</td>
						<td>${u.shopId}</td>
						<td>${u.linerId}</td>
						<td>${u.placeId}</td>
						<td>${u.shiftId}</td>
						<td class="update"><a
							href="${pageContext.request.contextPath}/vocation/update/${u.holidayId}">修改</a></td>
						<td class="del"><a
							href="${pageContext.request.contextPath}/vocation/del/${u.holidayId}">删除</a></td>
					</tr>
				</c:forEach>
			</tbody>
		</table>
	</div>
</body>
</html>
