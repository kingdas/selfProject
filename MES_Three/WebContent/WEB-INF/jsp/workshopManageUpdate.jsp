<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
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
		<h3></h3>
		<form name="updateForm"
			action="${pageContext.request.contextPath }/workshop/doUpdate"
			method="post" onsubmit="return checkUpdate(); ">
			<table>
				<tr>
					<td>序号：</td>
					<td><input type="text" name="shopId" value="${wModel.shopId}"
						readonly="readonly" /></td>
				</tr>
				<tr>
					<td>车间名称：</td>
					<td><input type="text" id="shopName" name="shopName"
						value="${wModel.shopName }" /></td>
				</tr>
				<tr>
					<td>车间主管：</td>
					<td><input type="text" id="shopAdmin" name="shopAdmin"
						value="${wModel.shopAdmin }" /></td>
				</tr>
				<tr>
					<td colspan="2" align="center"><input type="submit" value="提交" />
					</td>
				</tr>
			</table>
		</form>
	</div>
</body>
</html>