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
	/* $(function() {
		$("p").css("background-color", "orange");
		$("#p").css("background-color", "#505");
		$(".p").css("background-color", "#4f5e6d");
		$("div>p").html("zz");
		alert($("div>p").html());
	}) */

	var flg = true;
	function jq() {//隐藏和显示
		if (flg) {
			$(form1.elements).hide();
			/* $(form1.elements).fadeId(); */
		} else {
			$(form1.elements).show();
		}
		$("#test").html(flg == true ? "显示" : "隐藏");
		flg = !flg;
	}

	 function jq2() {//点击更换图片
		$("img").each(function() {
			this.src = "res/image/2.jpg"
		});
	} 
</script>
</head>
<body>
	<p>x</p>
	<div>
		<p>xx</p>
	</div>
	<p id="p">pi</p>
	<p class="p">pc</p>
	<br>
	<hr>
	<form id="form1">
		<input type="text" name="textfield"> <input type="submit"
			value="11">
	</form>
	<a href="#" id="test" onClick="jq()">隐藏</a>
	<br>
	<hr>
	<img src="res/image/1.jpg" />
	<img src="res/image/1.jpg" />
	<br>
	<a href="#" id="t" onClick="jq2()">change</a>
</body>
</html>