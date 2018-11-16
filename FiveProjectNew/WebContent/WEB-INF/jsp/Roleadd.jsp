<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<script type="text/javascript">
	function fanhui() {
		location.href = "${pageContext.request.contextPath}/test/findall;"
	}
	
	function jx(){
		if(form1.name.value==""){
			alert("角色名称不可为空！")
			form1.name.focus();
			return;
		}else if(form1.miaosu.value==""){
			alert("角色描述不可为空！");
			form1.miaosu.focus();
			return;
		}else{
			form1.submit();
		}
	}
</script>
<!-- 最新版本的 Bootstrap 核心 CSS 文件 -->
<link rel="stylesheet"
	href="https://cdn.jsdelivr.net/npm/bootstrap@3.3.7/dist/css/bootstrap.min.css"
	integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u"
	crossorigin="anonymous">

<!-- 可选的 Bootstrap 主题文件（一般不用引入） -->
<link rel="stylesheet"
	href="https://cdn.jsdelivr.net/npm/bootstrap@3.3.7/dist/css/bootstrap-theme.min.css"
	integrity="sha384-rHyoN1iRsVXV4nD0JutlnGaslCJuC7uwjduW9SVrLvRYooPp2bWYgmgJQIXwl/Sp"
	crossorigin="anonymous">

<!-- 最新的 Bootstrap 核心 JavaScript 文件 -->
<script
	src="https://cdn.jsdelivr.net/npm/bootstrap@3.3.7/dist/js/bootstrap.min.js"
	integrity="sha384-Tc5IQib027qvyjSMfHjOMaLkfuWVxZxUPnCJA7l2mCWNIpG9mGCD8wGNIcPD7Txa"
	crossorigin="anonymous"></script>

</head>
<body>


	 
	<div align="center">
		<form action="${pageContext.request.contextPath}/test/doadd" method="post" name="form1">
			<table class="table table-bordered">
				<tr>

					<th>角色名称</th>
					<th>角色描述</th>

				</tr>
				<tr>
					<td><input type="text" name="name"></td>
					<td><input type="text" name="miaosu"></td>
				</tr>
			</table>
			<input class="btn btn-default" type="button" value="保存" onclick="jx()">
			 <input class="btn btn-default"  type="reset" value="返回" onclick="fanhui()">
		</form>
	</div>
	<%-- <div align="center">
		<form action="${pageContext.request.contextPath}/test/doadd"
			method="post">
			用户名: <input  class="btn btn-default" type="text" name="name"> 
			&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
			角色描述:<input   class="btn btn-default"  type="text" name="miaosu">
			 </br>
			<input class="btn btn-default" type="submit"value="保存">
			 <input  class="btn btn-default"  type="reset" value="返回"	onclick="fanhui()">
		</form> --%>
		<!-- <input class="btn btn-default" type="button" value="返回"  onclick="fanhui()"> -->

	<!-- </div> -->

</body>
</html>