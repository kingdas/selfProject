<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script type="text/javascript">/* 修改非空校验 */
	function checkUpdate() {
		str = "";
		linerName = document.getElementById("linerName").value;
		linerAdmin = document.getElementById("linerAdmin").value;
		if (linerName == null || linerName.trim().length < 1) {
			str += "产线名 ";
		}
		if (linerAdmin == null || linerAdmin.trim().length < 1) {
			str += "主管名 ";
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
		<h3>产线信息修改</h3>
		<form name="updateForm"
			action="${pageContext.request.contextPath }/liner/doUpdate"
			method="post" onsubmit="return checkUpdate();">
			<table>
				<tr>
					<td>序号：</td>
					<td><input type="text" name="linerId" value="${swls.linerId }"
						readonly="readonly">
				</tr>
				<tr>
					<td>产线名称：</td>
					<td><input type="text" name="linerName" id="linerName"
						value="${swls.linerName }"></td>
				</tr>
				<tr>
					<td>车间主管：</td>
					<td><input type="text" name="linerAdmin" id="linerAdmin"
						value="${swls.linerAdmin }"></td>
				</tr>
				<tr>
					<td>所属车间：</td>
					<td><select name="shopId">
							<option value="1" ${swls.shopId==1? "selected='selected'":''}>1车间</option>
							<option value="2" ${swls.shopId==2? "selected='selected'":''}>2车间</option>
							<option value="3" ${swls.shopId==3? "selected='selected'":''}>3车间</option>
					</select>
				</tr>
				<tr>
					<td colspan="2" align="center"><input type="submit" value="提交">
					</td>
				</tr>
			</table>
		</form>
	</div>
</body>
</html>