<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet"
	href="${pageContext.request.contextPath }/res/css/bootstrap.min.css">
<script
	src="${pageContext.request.contextPath }/res/jquery-1.9.1.min.js"></script>
<script
	src="${pageContext.request.contextPath }/res/js/bootstrap.min.js"></script>
<title>Insert title here</title>
<script type="text/javascript">/* 删除和修改列的隐藏和显示 */
	$(function() {
		$(".upd").hide();
		$("#upd").click(function() {
			$(".upd").toggle();
			$(".del").hide();
		});
		$(".del").hide();
		$("#del").click(function() {
			$(".del").toggle();
			$(".upd").hide();
		});
	});
	/* 删除确认 */
	function del(linerId,linerName,linerAdmin,shopId){
		if (window.confirm("确认删除" + shopId + "车间"+ linerName + "产线" + linerAdmin + "?")) {
			location.href = "${pageContext.request.contextPath }/liner/delete/"+ linerId;
		}
	}
</script>
</head>
<body>
	<!-- 此表单为查询功能 -->
	<div>
		<form id="form1"
			action="${pageContext.request.contextPath }/liner/findByCondition"
			method="post" class="form-inline">
			<table style="width: 90%; margin: 30px;">
				<tr>
					<td>所属车间</td>
					<td><select style="margin-left: 15px; margin-right: 30px;"
						name="shopId" class="btn btn-default">
							<option value="-1">---</option>
							<option value="1">1车间</option>
							<option value="2">2车间</option>
							<option value="3">3车间</option>
					</select></td>
					<td>产线名称</td>
					<td><input style="margin-left: 15px; margin-right: 30px;"
						class="btn btn-default" type="text" name="linerName"></td>
					<td>产线主管</td>
					<td><input style="margin-left: 15px; margin-right: 30px;"
						class="btn btn-default" type="text" name="linerAdmin"></td>
					<td><button style="margin-left: 20px;" class="btn btn-default"
							type="submit">
							<span class="glyphicon glyphicon-search"></span>&nbsp;&nbsp;查询
						</button></td>
				</tr>
			</table>
		</form>
	</div>
	<hr style="color: black; size: 5px;" />
	<!-- 此模块为增、删、查、改功能 -->
	<div>
		<table style="margin-left: 40px; margin-top: 20px;">
			<tr>
				<td><a style="margin-right: 35px;" class="btn btn-default"
					href="${pageContext.request.contextPath }/liner/add" role="button">
						<span class="glyphicon glyphicon-plus">&nbsp;增加&nbsp;</span>
				</a></td>
				<td><a style="margin-right: 35px;" id="upd"
					class="btn btn-default" href="#" role="button"> <span
						class="glyphicon glyphicon-pencil">&nbsp;修改&nbsp;</span></a></td>
				<td><a style="margin-right: 35px;" id="del"
					class="btn btn-default" href="#" role="button"> <span
						class="glyphicon glyphicon-minus">&nbsp;删除&nbsp;</span>
				</a></td>
				<td><a class="btn btn-default" href="#" role="button"> <span
						class="glyphicon glyphicon-share-alt">&nbsp;导出&nbsp;</span></a></td>
			</tr>
		</table>
	</div>
	<div>
		<!-- 此表单显示数据 -->
		<table class="table table-striped"
			style="margin-left: 35px; margin-top: 20px;">
			<tr>
				<th>序号</th>
				<th>产线名称</th>
				<th>产线主管</th>
				<th>所属车间</th>
				<th class="upd">修改</th>
				<th class="del">删除</th>
			</tr>
			<c:forEach items="${swls}" var="sw">
				<tr>
					<td>${sw.linerId}</td>
					<td>${sw.linerName }号产线</td>
					<td>${sw.linerAdmin }</td>
					<td>${sw.shopId }车间</td>
					<td class="upd"><a
						href="${pageContext.request.contextPath }/liner/update/${sw.linerId }">修改</a></td>
					<td class="del"><a href="#"
						onclick="del(${sw.linerId},'${sw.linerName }','${sw.linerAdmin }','${sw.shopId }')">删除</a></td>
				</tr>
			</c:forEach>
		</table>
	</div>
</body>
</html>