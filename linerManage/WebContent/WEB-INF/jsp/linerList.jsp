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
<script src="${pageContext.request.contextPath }/res/paging.js"></script>
<title>产线管理</title>
<script type="text/javascript">
	/* 删除及修改列的隐藏和显示 */
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
	function batchDel() {
		var delSwls = new Array();
		var delSwl = document.getElementsByName("batchDel");
		for (var i = 0; i < delSwl.length; i++) {
			if (delSwl[i].checked)
				delSwls.push(delSwl[i].value);
		}
		if (window.confirm("       确认删除？")) {
			location.href = "${pageContext.request.contextPath }/liner/delete/"
					+ delSwls;
		}
	}

	/* 跳转页面 */
	function jump() {
		var goalPage = document.getElementById("jumpPage").value;
		if(goalPage<1||goalPage>${totalPage}){
			alert("该页面不存在！");
			return false;
		}
		location.href = "${pageContext.request.contextPath }/liner/findAll?currentPage="
				+ goalPage;
	}
</script>
</head>
<body>

	<!-- 此表单为查询功能 -->
	<div style="margin: 40px;">
		<form id="form1"
			action="${pageContext.request.contextPath }/liner/findByCondition"
			method="post" class="form-inline">
			<div class="form-group">
				<label>所属车间</label> <select
					style="margin-left: 15px; margin-right: 30px;" name="shopId"
					class="form-control">
					<option value="-1">---</option>
					<option value="1">1车间</option>
					<option value="2">2车间</option>
					<option value="3">3车间</option>
				</select>
			</div>
			<div class="form-group">
				<label>产线名称</label> <input
					style="margin-left: 15px; margin-right: 30px;" class="form-control"
					type="text" name="linerName" placeholder="请填数字">
			</div>
			<div class="form-group">
				<label>产线主管</label> <input
					style="margin-left: 15px; margin-right: 30px;" class="form-control"
					type="text" name="linerAdmin" placeholder="产线主管">
			</div>
			<button style="margin-left: 20px;" class="btn btn-default"
				type="submit">
				<span class="glyphicon glyphicon-search"></span>&nbsp;&nbsp;查询
			</button>
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

		<!-- 此表格显示数据 -->
		<table class="table table-striped"
			style="margin-left: 35px; margin-top: 20px;">
			<tr>
				<th>序号</th>
				<th>产线名称</th>
				<th>产线主管</th>
				<th>所属车间</th>
				<th class="upd">修改</th>
				<th class="del"><button onclick="batchDel()" id="batchDel"
						type="button" class="btn btn-default">
						<span class="glyphicon glyphicon-minus"></span>&nbsp;删除
					</button></th>
			</tr>
			<c:forEach items="${swls}" var="sw">
				<tr>
					<td>${sw.linerId}</td>
					<td>${sw.linerName }号产线</td>
					<td>${sw.linerAdmin }</td>
					<td>${sw.shopId }车间</td>
					<td class="upd"><a class="btn btn-default btn-xs"
						href="${pageContext.request.contextPath }/liner/update/${sw.linerId }">修改</a></td>
					<td class="del"><input type="checkbox" value="${sw.linerId }"
						name="batchDel" class="batchDel"></td>
				</tr>
			</c:forEach>
		</table>

		<!-- 此部分为分页功能 -->
		<div align="right" style="margin-bottom: 20px; margin-right: 20px;">
			<button class="btn btn-default">第${currentPage }/${totalPage }页</button>
			<a
				href="${pageContext.request.contextPath }/liner/findAll?currentPage=1"
				class="btn btn-default"><span
				class="glyphicon glyphicon-fast-backward"></span>&nbsp;首页</a> <a
				href="${pageContext.request.contextPath }/liner/findAll?currentPage=${currentPage-1<1?1:currentPage-1 }"
				class="btn btn-default"><span
				class="glyphicon glyphicon-step-backward"></span>&nbsp;上一页</a> <a
				href="${pageContext.request.contextPath }/liner/findAll?currentPage=${currentPage+1>totalPage?totalPage:currentPage+1 }"
				class="btn btn-default"><span
				class="glyphicon glyphicon-step-forward"></span>&nbsp;下一页</a> <a
				href="${pageContext.request.contextPath }/liner/findAll?currentPage=${totalPage}"
				class="btn btn-default"><span
				class="glyphicon glyphicon-fast-forward"></span>&nbsp;尾页</a>
			&nbsp;&nbsp;&nbsp;<span class="btn btn-default">跳转到&nbsp;<input
				type="number" style="width: 30px;" id="jumpPage">页
			</span>&nbsp;&nbsp;&nbsp; <input type="button" onclick="jump()" value="跳转"
				class="btn btn-default">
		</div>
	</div>
</body>
</html>