<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<script type="text/javascript">
<link rel="stylesheet"
	href="${pageContext.request.contextPath}/res/bootstrap-3.3.7-dist/css/bootstrap.min.css">
<script src="${pageContext.request.contextPath}/res/js/jquery-1.11.0.js"></script>
<script
	src="${pageContext.request.contextPath}/res/bootstrap-3.3.7-dist/js/bootstrap.min.js"></script>
<script
	src="${pageContext.request.contextPath}/res/My97DatePicker/WdatePicker.js"></script>

function fanhui(){
	location.href="${pageContext.request.contextPath}/test/findall;"
}
</head>
<body>



	<div align="center" style="margin-top: 20px">
		<form action="${pageContext.request.contextPath}/test/findByCondition"
			method="post">
			角色名称：<input type="text" name="name"> 角色描述：<input type="text"
				name="miaosu">
			<button type="submit" class="glyphicon glyphicon-search"
				aria-label="Left Align">
				<span>查询</span>
			</button>
		</form>
	</div>

	<br>
	<br>
	<br>
	<br>

	<div align="center">
		<button type="button" 
			aria-label="Left Align" id="zj" class="btn btn-default"
			style="font-size: 18px; margin-left: 60px;">
			<span class="glyphicon glyphicon-plus">增加</span>
		</button>

		<button type="button" class="btn btn-default"
			aria-label="Left Align" id="show"
			style="font-size: 18px; margin-left: 60px;">
			<span class="glyphicon glyphicon-pencil">修改</span>
		</button>

		<button type="button" class="btn btn-default"
			aria-label="Left Align" id="hide"
			style="font-size: 18px; margin-left: 60px;">
			<span class="glyphicon glyphicon-minus">删除</span>
			</button>
	</div>

 <br>
 <br>
 <br>
 <br>
 
	<div align="center">
		<form action="${pageContext.request.contextPath}/test/doupdate"
			method="post">
			<table class="table table-bordered">
				<tr>
				<th>角色名称</th>
				<th>角色描述</th>
				</tr>
				
				<tr>
					<td><input size="30" type="text" name="name"  value="${mo.name}"></td>
					<td><input size="30" type="text" name="miaosu" value="${mo.miaosu}"></td>
				</tr>
				</table>
			<input class="btn btn-default" type="submit" value="保存">
			 <input class="btn btn-default"  type="reset" value="返回" onclick="fanhui()">
		</form>
	</div>


<%-- <div align="center">
<form action="${pageContext.request.contextPath}/test/doupdate"  method="post">

用户名&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; <input  type="text"  name="name"  value="${mo.name} "></br>
角色描述&nbsp;&nbsp;<input type="text"  name="miaosu"  value="${mo.miaosu} "></br>
<input class="btn btn-default" type="submit" value="保存" >
<input type="reset" value="返回" onclick="fanhui()">
</form> --%>
<!-- <input class="btn btn-default" type="button" value="返回"  onclick="fanhui()"> -->

<!-- </div>
 --></body>
</html>