<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<c:set var="basePath"
	value="${pageContext.request.scheme}://${pageContext.request.serverName}:${pageContext.request.localPort}${pageContext.request.contextPath}/" />


<script type="text/javascript">
	function qrCode() {
		var qr=document.getElementById("qr");
		var tableNum = document.getElementById("tableNum").value;
		if (tableNum != null && tableNum != "") {
			qr.src = "${basePath}qr/tableNum/" + tableNum;
		} else {
			qr.src = "${basePath}qr/tableNum/1";
		}
	}
</script>
</head>
<body>
	<div align="center">
		<h3>生成二维码</h3>
		桌号：<input id="tableNum" type="text" name="tableNum" /><font
			color="red">输入桌号后点下面的二维码图</font>
		<hr />
		<img id="qr" alt="二维码" src="${basePath}qr/tableNum/1"
			onclick="qrCode()" />
	</div>
	<br/>
	${basePath}qrCodeController
	<br/>
</body>
</html>