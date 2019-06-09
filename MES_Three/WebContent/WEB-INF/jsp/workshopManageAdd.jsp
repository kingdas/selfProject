<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
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
	function updateForm() {
		s = "";
		shopName = document.getElementById("shopName").value;
		shopAdmin = document.getElementById("shopAdmin").value;
		if (shopName == null || shopName.trim.length < 1) {
			s += "车间名";
		}

		if (shopAdmin == null || shopadmin.trim.length < 1) {
			s += "车间主管";
		}

		if (s.length > 0) {
			s += "需要填写";
			alert(s);
			return false;
		}
		return true;
	}
	System.out.println(1);
</script>
<title>Insert title here</title>
</head>
<body>
	<div align="center">
		<h3>新增车间</h3>
		<form action="${pageContext.request.contextPath}/workshop/doAdd"
			method="post" onsubmit="return updateForm();">
			<table style="border: 0; align-content: center;">
				<tr>
					<td>车间名称：</td>
					<td><input type="text" id="shopName" name="shopName"
						class="btn btn-default" style="margin: 10px;"></td>
				</tr>
				<tr>
					<td>车间主管：</td>
					<td><input type="text" id="shopAdmin" name="shopAdmin"
						class="btn btn-default" style="margin: 10px;"></td>
				</tr>
				<tr>
					<td colspan="2" align="center"><input type="submit"
						class="btn btn-default btn-sm" value="添加" />&nbsp;&nbsp; <input
						type="button" name="reback" class="btn btn-default btn-sm"
						onclick="javascript:history.back(-1);" value="返回"></td>
				</tr>
			</table>
		</form>
	</div>
</body>
</html>