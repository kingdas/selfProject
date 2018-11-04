<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script type="text/javascript"
	src="${pageContext.request.contextPath }/res/js/jquery-1.9.1.js"></script>

<script type="text/javascript">
	/* 	function init() {
	 alert("init");
	 } */

	/* $(document).ready(function(){  用jQuery的方法来代替js中的onload事件 
		alert("jQueryOnLoad")
	}) */

	/* $(function() { //更简便的方法，用jQuery的方法代替js中的onload事件
		alert("jQueryOnload2");
	}) */

	/* function pro() {
		alert("$$$")
		document.getElementById("err").innerHTML = "good";
	} */

	$(function() {
		$("a").click(function() {
			alert("SSS");
			document.getElementById("err").innerHTML = "nice";
		})
	})

	/////////////////////////////////////////
	var a = function b() {
		alert("bb");
	}

	function c(a) {//一个函数的参数是另外一个函数  在函数的内部使用作为参数的函数 称为回调 此处a表示函数类型的形参
		a();
	}

	c(function() {//由于上面c方法的形参是一个函数  所以此处c函数的实参必须是一个函数
		alert("回调");
	})
</script>
</head>
<body>
	<span id="err"><font color="red">.</font></span>
	<br>
	<a href="#">点击</a>
</body>
</html>