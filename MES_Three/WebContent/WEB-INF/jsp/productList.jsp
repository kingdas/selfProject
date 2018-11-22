<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
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
<title>Insert title here</title>
<style>
div{ border:1px solid #DCDCDC; width:100%; height:100px;line-height:100px;text-align:center;} 
.div1{
background:#DCDCDC;
}
.btn_submit{
    width: 44px;
    height: 40px;
    background: #ddd;
    font-size: 20px;
    color: #fff;
    border: 0;
}
</style>
</head>
<body>
   <div class="div">
	<form
		action="${pageContext.request.contextPath}/product/findByCondition"
		method="post">
		<table>
			<tr class="text-uppercase">
				<td>产品编码</td>
				<td><input type="text" name="itemCode" class="form-control" aria-describedby="sizing-addon1"/></td>
				<td>产品描述</td>
				<td><input type="text" name="description" class="form-control" aria-describedby="sizing-addon1"/></td>
				<td>产品来源</td>
				<td><input type="text" name="crustSource" class="form-control" aria-describedby="sizing-addon1"/></td>
				<td><input type="submit" value="查询" class="form-control" aria-describedby="sizing-addon1"/></td>
			</tr>
		</table>
	</form>
   </div>
	<div class="text-uppercase" class="div1">
		<a class="btn btn-default" href="${pageContext.request.contextPath}/product/add"><span class="glyphicon glyphicon-plus"></span>&nbsp;&nbsp;添加&nbsp;</a>
	    <a id="del" class="btn btn-default" href="#">
	    <span class="glyphicon glyphicon-minus"></span>&nbsp;&nbsp;删除&nbsp;</a>
	    <a id="upd" class="btn btn-default" href="#"><span class="glyphicon glyphicon-pencil"></span>&nbsp;&nbsp;修改&nbsp;</a>
	</div>
	<div class="div">
		<table class="table table-hover" class="text-uppercase" class="table table-condensed">
			<tr>
				<td>序号</td>
				<td>产品编码</td>
				<td>产品描述</td>
				<td>来源</td>
				<td>程序</td>
				<td>品牌</td>
				<td>车型</td>
				<td>组件</td>
				<td>覆盖率</td>
				<td>报废率</td>
				<td class="del">删除</td>
				<td class="upd">修改</td>
			</tr>
			<c:forEach items="${pmodel}" var="p">
				<tr>
					<td>${p.itemId}</td>
					<td>${p.itemCode}</td>
					<td>${p.description}</td>
					<td>${p.crustSource}</td>
					<td>${p.program}</td>
					<td>${p.oem}</td>
					<td>${p.carModel}</td>
					<td>${p.component}</td>
					<td>${p.hideRatio}</td>
					<td>${p.scrap}</td>
					<td class="del"><a
						href="${pageContext.request.contextPath}/product/del/${p.itemId}">删除</a></td>
					<td class="upd"><a
						href="${pageContext.request.contextPath}/product/findByitemId/${p.itemId}">修改</a></td>
				</tr>
			</c:forEach>
		</table>
	</div>
</body>
</html>