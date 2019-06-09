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
<title>Insert title here</title>
<style type="text/css">
input .nn {
	margin-top: 20px;
	margin-bottom: 20px;
	padding-bottom: 20px;
	padding-top: 20px;
}
</style>
<script type="text/javascript">
	/* 修改非空校验 */
	function checkUpdate() {
		str = "";
		shopName = document.getElementById("shopName").value;
		shopAdmin = document.getElementById("shopAdmin").value;
		if (shopName == null || shopName.trim.length < 1) {
			str += "车间名";
		}
		if (shopAdmin == null || shopadmin.trim.length < 1) {
			Str += "车间主管";
		}
		if (str.length > 0) {
			str += "需要填写";
			alert(str);
			return false;
		}
		return true;
	}
</script>

</head>
<body>
	<div align="center">
		<h3>车间信息修改</h3>
		<form name="updateForm"
			action="${pageContext.request.contextPath }/workshop/doUpdate"
			method="post" onsubmit="return checkUpdate();">
			<table>
				<tr>
					<td>序号：</td>
					<td><input type="text" class="btn btn-default" name="shopId"
						value="${wModel.shopId}" readonly="readonly" style="margin: 10px;" /></td>
				</tr>
				<tr>
					<td>车间名称：</td>
					<td><input type="text" class="btn btn-default" id="shopName"
						name="shopName" value="${wModel.shopName }" style="margin: 10px;" /></td>
				</tr>
				<tr>
					<td>车间主管：</td>
					<td><input type="text" class="btn btn-default" id="shopAdmin"
						name="shopAdmin" value="${wModel.shopAdmin }"
						style="margin: 10px;" /></td>
				</tr>
				<tr>
					<td colspan="2" align="center"><input type="submit"
						class="btn btn-default btn-sm" value="修改" />&nbsp;&nbsp;<input
						type="button" name="reback" class="btn btn-default btn-sm"
						onclick="javascript:history.back(-1);" value="返回"></td>
				</tr>
			</table>
		</form>
	</div>
</body>
</html>