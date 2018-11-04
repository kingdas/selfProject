<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet"
	href="${pageContext.request.contextPath }/res/css/bootstrap.css">
<script
	src="${pageContext.request.contextPath }/res/jquery-1.9.1.min.js"></script>
<script src="${pageContext.request.contextPath }/res/js/bootstrap.js"></script>
<script type="text/javascript">
	function updateForm() {
		//alert(1);
		s = "";
		linerAdmin = document.getElementById("linerAdmin").value;
		linerName = document.getElementById("linerName").value;
		if (linerAdmin == null || linerAdmin.trim().length < 1) {
			s += "主管名";
		}
		if (linerName == null || linerName.trim().length < 1) {
			s += "产线名";
		}
		if (s.length > 0) {
			s += "必填";
			alert(s);
			return false;
		}
		return true;
	}
</script>
</head>
<body>
	<div align="center">
		<h3 style="margin: 20px;">添加产线信息</h3>
		<form action="${pageContext.request.contextPath }/liner/doAdd"
			method="post" onsubmit="return updateForm();">
			<table style="border: 0; align-content: center;">
				<tr>
					<td>产线名称</td>
					<td><input style="margin: 20px; margin-right: 30px;"
						type="text" id="linerName" name="linerName"
						class="btn btn-default btn-sm"></td>
					<td>产线主管</td>
					<td><input style="margin: 20px;" type="text" id="linerAdmin"
						name="linerAdmin" class="btn btn-default btn-sm"></td>
				</tr>
				<tr>
					<td>所属车间</td>
					<td><select style="margin: 20px;"
						class="btn btn-default btn-sm" id="shopId" name="shopId">
							<option value="1">1车间</option>
							<option value="2">2车间</option>
							<option value="3">3车间</option>
					</select></td>
				</tr>
				<tr style="margin: 20px;">
					<td colspan="2" align="right"><input type="submit"
						class="btn btn-default btn-sm" value="&nbsp;保存&nbsp;"></td>
				</tr>
			</table>
		</form>
	</div>
</body>
</html>