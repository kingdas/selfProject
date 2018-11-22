<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>content</title>
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet"
	href="${pageContext.request.contextPath }/res/bootstrap-3.3.7-dist/css/bootstrap.min.css">
<script
	src="${pageContext.request.contextPath }/res/js/jquery-3.3.1.min.js"></script>
<script
	src="${pageContext.request.contextPath }/res/bootstrap-3.3.7-dist/js/bootstrap.min.js"></script>
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
</script>

</head>
<body>
	<br>
	<br>
	<form action="${pageContext.request.contextPath }/user/findbyCondition"
		method="post">
		<table class="table">
			<tr>
				<td>用户名：</td>
				<td><input type="text" name="userCode" /></td>
				<td>用户组：</td>
				<td><input type="text" name="userGroup" /></td>
				<td>用户角色</td>
				<td><input type="text" name="userRole" /></td>
			</tr>
			<tr>
				<td>姓名：</td>
				<td><input type="text" name="userName" /></td>
				<td>职务：</td>
				<td><input type="text" name="userJob" /></td>
				<td colspan="2" align="center"><input type="submit" value="查询" /></td>
			</tr>
		</table>
	</form>
	<br>
	<!-- 增删改 -->
	<div>
		<table style="margin-left: 30px; margin-top: 30px;">
			<tr>
				<td><a style="margin-right: 35px;" class="btn btn-default"
					href="${pageContext.request.contextPath }/page/useradd"> <span
						class="glyphicon glyphicon-plus"></span>&nbsp;增加&nbsp;
				</a></td>
				<td><a style="margin-right: 35px;" id="upd"
					class="btn btn-default" href="#"> <span
						class="glyphicon glyphicon-pencil">&nbsp;修改&nbsp;</span>
				</a></td>
				<td><a style="margin-right: 35px;" id="del"
					class="btn btn-default" href="#"> <span
						class="glyphicon glyphicon-minus">&nbsp;删除&nbsp;</span>
				</a></td>
				<td><a class="btn btn-default" href="#"> <span
						class="glyphicon glyphicon-share-alt">&nbsp;导出&nbsp;</span>
				</a></td>
			</tr>
		</table>
	</div>

	<table class="table" align="center" width="640">
		<tr>
			<td>用户名</td>
			<td>姓名</td>
			<td>用户组</td>
			<td>职务</td>
			<td>角色</td>
			<td>邮箱</td>
			<td>手机</td>
			<td>微信</td>
			<td>所属工位</td>
			<td class="upd">修改</td>
			<td class="del">删除</td>
		</tr>

		<c:forEach items="${ls}" var="u">
			<tr>
				<td>${u.userCode }</td>
				<td>${u.userName }</td>
				<td>${u.userGroup }</td>
				<td>${u.userJob }</td>
				<td>${u.userRole }</td>
				<td>${u.userEmail }</td>
				<td>${u.userMobile }</td>
				<td>${u.userWxnd }</td>
				<td>${u.lockPlaceId }</td>
				<td class="upd"><a
					href="${pageContext.request.contextPath }/user/update/${u.userId }">修改</a></td>
				<td class="del"><a
					href="${pageContext.request.contextPath }/user/del/${u.userId }">删除</a></td>
			</tr>
		</c:forEach>
	</table>
</body>
</html>