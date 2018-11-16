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
	/* 修改非空校验 */
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
		<h3 style="margin: 30px;">修改产线信息</h3>
		<form name="updateForm"
			action="${pageContext.request.contextPath }/liner/doUpdate"
			method="post" onsubmit="return checkUpdate();"
			class="form-horizontal">
			<div class="form-group" style="margin-left: 30%;">
				<label class="col-sm-2 control-label">序&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;号</label>
				<div class="col-sm-3">
					<input type="text" id="linerId" name="linerId"
						class="form-control" value="${swls.linerId }" readonly="readonly">
				</div>
			</div>
			<div class="form-group" style="margin-left: 30%;">
				<label class="col-sm-2 control-label">产线名称</label>
				<div class="col-sm-3">
					<input type="text" id="linerName" name="linerName"
						class="form-control" value="${swls.linerName }">
				</div>
			</div>
			<div class="form-group" style="margin-left: 30%;">
				<label class="col-sm-2 control-label">车间主管</label>
				<div class="col-sm-3">
					<input type="text" id="linerAdmin" name="linerAdmin"
						class="form-control" value="${swls.linerAdmin }">
				</div>
			</div>
			<div class="form-group" style="margin-left: 30%;">
				<label class="col-sm-2 control-label">所属车间</label>
				<div class="col-sm-3">
					<select name="shopId" id="shopId" class="form-control">
						<option value="1" ${swls.shopId==1? "selected='selected'":''}>1车间</option>
						<option value="2" ${swls.shopId==2? "selected='selected'":''}>2车间</option>
						<option value="3" ${swls.shopId==3? "selected='selected'":''}>3车间</option>
					</select>
				</div>
			</div>
			<div>
				<input type="submit" class="btn btn-default"
					value="&nbsp;&nbsp;提交&nbsp;&nbsp;">
			</div>
		</form>
	</div>
</body>
</html>