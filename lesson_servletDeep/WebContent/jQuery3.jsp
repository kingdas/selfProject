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
	$(function() {
		$("tr").hover(function() {
			$(this).addClass("test");
		}, function() {
			$(this).removeClass("test");
		});
	});
</script>
<style type="text/css">
.test {
	background-color: lime;
}
</style>
</head>
<body>
	<table>
		<thead>
			<tr>
				<td>A</td>
				<td>B</td>
				<td>C</td>
			</tr>
		</thead>
		<tbody>
			<tr>
				<td>AA</td>
				<td>BB</td>
				<td>CC</td>
			</tr>
			<tr>
				<td>AAA</td>
				<td>BBB</td>
				<td>CCC</td>
			</tr>
		</tbody>
	</table>
</body>
</html>