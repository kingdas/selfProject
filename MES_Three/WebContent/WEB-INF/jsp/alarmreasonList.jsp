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
<!-- <script type="text/javascript">
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
	-->
<title>Insert title here</title>
</head>
<body>
	<!-- <div align="center">
		<table style="margin-top: 30px; margin-bottom: 30px;">
			<tr>
				<td><a style="margin-right: 35px;" class="btn btn-default">报警原因管理
						<span class="glyphicon glyphicon-remove"></span>
				</a></td>
				<td><a style="margin-right: 35px;" class="btn btn-default">用户管理
						<span class="glyphicon glyphicon-remove"></span>
				</a></td>
				<td><a style="margin-right: 35px;" class="btn btn-default">产线管理
						<span class="glyphicon glyphicon-remove"></span>
				</a></td>
				<td><a style="margin-right: 35px;" class="btn btn-default">角色管理
						<span class="glyphicon glyphicon-remove"></span>
				</a></td>
			</tr>
		</table>
	</div>
	<hr> -->
	<div align="center">
		<form
			action="${pageContext.request.contextPath}/alarmreason/findcondition"
			method="post">
			所属报警类型&nbsp;&nbsp; <input style="margin-right: 35px;" type="text"
				name="typeId" /> 原因描述 &nbsp;&nbsp; <input
				style="margin-right: 35px;" type="text" name="description" />
			<button style="margin-right: 35px;" class="btn btn-default"
				type="submit">
				<span class="glyphicon glyphicon-search"></span>&nbsp;查询
			</button>
		</form>
	</div>
	<hr>
	<div align="center">
		<table style="margin-left: 30px; margin-top: 30px;">
			<tr>
				<td><a style="margin-right: 35px;" class="btn btn-default"
					href="${pageContext.request.contextPath }/alarmreason/add"> <span
						class="glyphicon glyphicon-plus-sign"></span>&nbsp;添加
				</a></td>
				<td><a id="upd" style="margin-right: 35px;"
					class="btn btn-default" href="#"> <span
						class="glyphicon glyphicon-pencil"></span>&nbsp;修改
				</a></td>
				<td><a id="del" style="margin-right: 35px;"
					class="btn btn-default" href="#"> <span
						class="glyphicon glyphicon-minus-sign"></span>&nbsp;删除
				</a></td>
				<td><a style="margin-right: 35px;" class="btn btn-default"
					href="#"> <span class="glyphicon glyphicon-export"></span>&nbsp;导出
				</a></td>
			</tr>
		</table>
	</div>
	<div align="center">
		<table class="table table-striped" style="margin-top: 20px;">
			<thead>
				<tr>
					<th>序号</th>
					<th>所属报警类型</th>
					<th>原因描述</th>
					<th>修改</th>
					<th>删除</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach items="${al}" var="a">
					<tr>
						<td>${a.reasonId}</td>
						<td>${a.typeId }</td>
						<td>${a.description }</td>
						<td><a
							href="${pageContext.request.contextPath}/alarmreason/update/${a.reasonId}">修改</a>
						</td>
						<td><a
							href="${pageContext.request.contextPath}/alarmreason/del/${a.reasonId}">删除</a>
						</td>
					</tr>
				</c:forEach>
			</tbody>
		</table>
	</div>
</body>
</html>