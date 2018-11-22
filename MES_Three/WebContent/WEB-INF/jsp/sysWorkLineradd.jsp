<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h3>新增产线</h3>
	<hr>
	<form action="${pageContext.request.contextPath}/all/doadd"
		method="post">
		<table>
			<tr>
				<td>产线 <input type="text" name="linerId" />
				</td>
				<td>产线名称 <input type="text" name="linerName" />
				</td>
				<td>产线主管 <input type="text" name="linerAdmin" /></td>
			</tr>
			<tr>
				<td>所属空间<select name="shopId">
						<option value=1>1</option>
						<option value=2>2</option>
						<option value=3>3</option>
				</select></td>
			</tr>
			<tr>
				<td colspan="2"><input type="submit" value="保存"></td>
			</tr>
		</table>
	</form>
</body>
</html>