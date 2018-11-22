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
<div align="center">
	<form action="${pageContext.request.contextPath }/positionManage/findcondition" method="post">
	<table style="margin-top:50px;">
	<tr>
	<td>
		所属车间<select name="shopId" style="margin-right:20px">
		    <option value="0"></option>
			<option value="1">1</option>
			<option value="2">2</option>
			<option value="3">3</option>
		</select>
		</td>
		<td> 
		所属产线<select name="linerId"style="margin-right:20px">
		    <option value="0"></option>
			<option value="1">1</option>
			<option value="2">2</option>
			<option value="3">3</option>
		</select>
		</td> 
		<!-- 所属产线：<input type="text" name="linerId" /><br /> -->
		<td>工位名称：<input type="text" name="placeName" /></td> 
		<td>工位主管：<input type="text" name="placeAdmin" /></td> 
		<td><input class="btn btn-default" type="submit" value="查詢" ></td>
		</tr>
		</table>
	</form>
	</div>
	<div style="margin-top:50px;">
	<p>
		<a class="btn btn-default" href="${pageContext.request.contextPath }/positionManage/add"><span class="glyphicon glyphicon-plus"></span>增加用户</a>
	
	
		<a id="del" class="btn btn-default" href="#"><span class="glyphicon glyphicon-minus"></span>删除用户</a>
	
	
		<a id="upd" class="btn btn-default" href="#"><span class="glyphicon glyphicon-pencil"></span>修改用户</a>
	</p>
	</div>
	<div align="center" >
		<table width="500" class="table">
			<thead>
				<tr>
					<th>工位名称</th>
					<th>工位主管</th>
					<th>所属车间</th>
					<th>所属产线</th>
			<!-- 		<th>修改</th>
					<th>删除</th> -->
				</tr>
			</thead>
			<tbody>
				<c:forEach items="${li}" var="l">
					<tr>

						<td>${l.placeName }</td>
						<td>${l.placeAdmin }</td>
						<td>${l.shopId }</td>
						<td>${l.linerId }</td>
						<td><a class="upd" href="${pageContext.request.contextPath}/positionManage/update/${l.placeId}">修改</a></td>
						<td><a class="del"
							href="${pageContext.request.contextPath}/positionManage/del/${l.placeId}">删除</a></td>
					</tr>
				</c:forEach>
			</tbody>
		</table>
	</div>
</body>
</html>