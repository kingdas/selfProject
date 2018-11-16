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
	href="${pageContext.request.contextPath}/res/bootstrap-3.3.7-dist/css/bootstrap.min.css">
<script src="${pageContext.request.contextPath}/res/js/jquery-1.11.0.js"></script>
<script
	src="${pageContext.request.contextPath}/res/bootstrap-3.3.7-dist/js/bootstrap.min.js"></script>

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
			method="post" onsubmit="return updateForm();" class="form-horizontal">
			<div class="form-group" style="margin-left: 30%;">
				<label class="col-sm-2 control-label">产线名称</label>
				<div class="col-sm-3">
					<input type="text" id="linerName" name="linerName"
						class="form-control" placeholder="请填数字">
				</div>
			</div>
			<div class="form-group" style="margin-left: 30%;">
				<label class="col-sm-2 control-label">产线主管</label>
				<div class="col-sm-3">
					<input type="text" id="linerAdmin" name="linerAdmin"
						class="form-control">
				</div>
			</div>
			<div class="form-group" style="margin-left: 30%;">
				<label class="col-sm-2 control-label">所属车间</label>
				<div class="col-sm-3">
					<select id="shopId" name="shopId" class="form-control">
						<option value="1">1车间</option>
						<option value="2">2车间</option>
						<option value="3">3车间</option>
					</select>
				</div>
			</div>
			<div>
				<input type="submit" class="btn btn-default"
					value="&nbsp;&nbsp;保存&nbsp;&nbsp;">
			</div>
		</form>
	</div>
</body>
</html>