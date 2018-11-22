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
	<form action="${pageContext.request.contextPath}/product/doadd"
		method="post">
		<div class="text-uppercase" class="div">
			<center>
				<h1 style="background: #DCDCDC">新增产品</h1>
			</center>
		</div>
		<div class="text-uppercase">
			<table align="center" class="table">
				<tr class="text-uppercase">
					<td class="td">产品编码</td>
					<td class="td"><input class="input" type="text"
						name="itemCode" value="" /></td>
				</tr>
				<tr class="text-uppercase">
					<td class="td">产品描述</td>
					<td class="td"><input class="input" type="text"
						name="description" value="" /></td>
				</tr>
				<tr class="text-uppercase">
					<td class="td">来源</td>
					<td class="td"><input class="input" type="text"
						name="crustSource" value="" /></td>
				</tr>
				<tr class="text-uppercase">
					<td class="td">程序</td>
					<td class="td"><input class="input" type="text" name="program"
						value="" /></td>
				</tr>
				<tr class="text-uppercase">
					<td class="td">品牌</td>
					<td class="td"><input class="input" type="text" name="oem"
						value="" /></td>
				</tr>
				<tr class="text-uppercase">
					<td class="td">车型</td>
					<td class="td"><input class="input" type="text"
						name="carModel" value="" /></td>
				</tr>
				<tr class="text-uppercase">
					<td class="td">组件</td>
					<td class="td"><input class="input" type="text"
						name="component" value="" /></td>
				</tr>
				<tr class="text-uppercase">
					<td class="td">覆盖率</td>
					<td class="td"><input class="input" type="text"
						name="hideRatio" value="" /></td>
				</tr>
				<tr class="text-uppercase">
					<td class="td">报废率</td>
					<td class="td"><input class="input" type="text" name="scrap"
						value="" /></td>
				</tr>
				<tr class="text-uppercase">
					<td colspan="2" class="td" align="center"><input type="submit"
						value="保存" class="form-control" /></td>
				</tr>
			</table>
		</div>
	</form>
</body>
</html>