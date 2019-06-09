<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
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
<script type="text/javascript">
	$(function() {
		$(".update").hide();
		$("#update").click(function() {
			$(".update").toggle();
			$(".del").hide();
		});
		$(".del").hide();
		$("#del").click(function() {
			$(".del").toggle();
			$(".update").hide();
		});
	});
	/* 删除确认 */
	function del(shopId,shopName,shopAdmin){
		if(window.confirm("确认删除"+shopName+"车间车间主任"+shopAdmin+"?")){
			location.href="${pageContext.request.contextPath}/workshop/del/"+shopId;
		}
	}
	
</script>
</head>
<body>
	<!-- 查询功能 -->
	<div align="center">
		<form id="form1"
			action="${pageContext.request.contextPath }/workshop/findByCondition"
			method="post" class="form-inline">
			<table
				style="width: 70%; margin: 30px; display: inline; float: left;">
				<tr>
					<td>车间名称</td>
					<td><input style="margin-left: 20px; margin-right: 20px;"
						class="btn btn-default" type="text" name="shopName"></td>
					<td>车间主管</td>
					<td><input style="margin-left: 20px; margin-right: 20px;"
						class=" btn btn-default" type="text" name="shopAdmin"></td>
					<td><button style="margin-left: 20px;" class="btn btn-default"
							type="submit">
							<span class="glyphicon glyphicon-search"></span>&nbsp;查询&nbsp;
						</button></td>
				</tr>
			</table>
		</form>
	</div>
	<hr style="color: red; size: 10px;" />
	<hr>
	<!-- 增删改 -->
	<div>
		<table style="margin-left: 30px; margin-top: 30px;">
			<tr>
				<td><a style="margin-right: 35px;" class="btn btn-default"
					href="${pageContext.request.contextPath }/workshop/add"> <span
						class="glyphicon glyphicon-plus"></span>&nbsp;增加
				</a></td>
				<td><a style="margin-right: 35px;" id="update"
					class="btn btn-default" href="#"> <span
						class="glyphicon glyphicon-pencil"></span>&nbsp;修改
				</a></td>
				<td><a style="margin-right: 35px;" id="del"
					class="btn btn-default" href="#"> <span
						class="glyphicon glyphicon-minus"></span>&nbsp;删除
				</a></td>
				<td><a class="btn btn-default" href="#"> <span
						class="glyphicon glyphicon-share-alt"></span>&nbsp;导出
				</a></td>
			</tr>
		</table>
	</div>
	<div>
		<table class="table table-striped"
			style="margin-left: 35px; margin-top: 30px;">
			<tr>
				<th>序号</th>
				<th>车间名称</th>
				<th>车间主管</th>
				<th class="update">修改</th>
				<th class="del">删除</th>
			</tr>
			<c:forEach items="${wms }" var="t">
				<tr>
					<td>${t.shopId }</td>
					<td>${t.shopName }</td>
					<td>${t.shopAdmin }</td>
					<td class="update"><a class="btn btn-default btn-xs"
						href="${pageContext.request.contextPath }/workshop/update/${t.shopId}">修改</a></td>
					<td class="del"><a href="#" class="btn btn-default btn-xs"
						onclick="del(${t.shopId} ,'${t.shopName }','${t.shopAdmin }')">删除</a></td>
				</tr>
			</c:forEach>
		</table>
	</div>
</body>
</html>