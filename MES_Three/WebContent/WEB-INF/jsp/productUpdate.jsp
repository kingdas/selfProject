<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<style>
.td {
	width: 100px;
	height: 40px;
}

.input {
	height: 30px;
	width: 400px
}

div {
	border: 1px solid #DCDCDC;
	width: 100%;
	height: 100%
}

.div {
	background: #DCDCDC
}
</style>
</head>
<body>
	<form
		action="${pageContext.request.contextPath}/product/update?itemId=${pmodel.itemId}"
		method="post">
		<div class="text-uppercase" class="div">
			<center>
				<h1 style="background: #DCDCDC">更新产品</h1>
			</center>
		</div>
		<div class="text-uppercase">
			<table align="center" class="table">
				<tr class="text-uppercase">
					<td class="td">产品ID</td>
					<td class="td"><input class="input" type="text" name="itemId"
						value="${pmodel.itemId}" readonly="readonly" class="form-control" /></td>
				</tr>
				<tr class="text-uppercase">
					<td class="td">产品编码</td>
					<td class="td"><input class="input" type="text"
						name="itemCode" value="${pmodel.itemCode}" /></td>
				</tr>
				<tr class="text-uppercase">
					<td class="td">产品描述</td>
					<td class="td"><input class="input" type="text"
						name="description" value="${pmodel.description}" /></td>
				</tr>
				<tr class="text-uppercase">
					<td class="td">来源</td>
					<td class="td"><input class="input" type="text"
						name="crustSource" value="${pmodel.crustSource}" /></td>
				</tr>
				<tr class="text-uppercase">
					<td class="td">程序</td>
					<td class="td"><input class="input" type="text" name="program"
						value="${pmodel.program}" /></td>
				</tr>
				<tr class="text-uppercase">
					<td class="td">品牌</td>
					<td class="td"><input class="input" type="text" name="oem"
						value="${pmodel.oem}" /></td>
				</tr>
				<tr class="text-uppercase">
					<td class="td">车型</td>
					<td class="td"><input class="input" type="text"
						name="carModel" value="${pmodel.carModel}" /></td>
				</tr>
				<tr class="text-uppercase">
					<td class="td">组件</td>
					<td class="td"><input class="input" type="text"
						name="component" value="${pmodel.component}" /></td>
				</tr>
				<tr>
					<td class="td">覆盖率</td>
					<td class="td"><input class="input" type="text"
						name="hideRatio" value="${pmodel.hideRatio}" /></td>
				</tr>
				<tr class="text-uppercase">
					<td class="td">报废率</td>
					<td class="td"><input class="input" type="text" name="scrap"
						value="${pmodel.scrap}" /></td>
				</tr>
				<tr class="text-uppercase">
					<td colspan="2" class="td" align="center"><input type="submit"
						value="保存" class="form-control" aria-describedby="sizing-addon1" /></td>
				</tr>
			</table>
		</div>
	</form>
</body>
</html>