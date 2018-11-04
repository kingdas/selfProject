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
	function check(name) {//利用json实现aJax 功能
		$.ajax({
			url : "${pageContext.request.contextPath }/ms1?name="+name,
			type : "get",
			success : function(msg) {
				if (msg % 2 == 0) {
					$("#err").html("用户已存在");
				} else {
					$("#err").html("注册成功");
				}
			}
		});
	}
</script>
</head>
<body>
	<div id="err"></div>
	<input name="xx" type="text" onblur="check(this.value)">
	<!-- http://localhost:8080/servletTest -->
</body>
</html>