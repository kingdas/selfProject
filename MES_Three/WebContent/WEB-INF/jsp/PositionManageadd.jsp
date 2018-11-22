<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<style type="text/css">
.table{
   bor
}
</style>
</head>
<body>
<div align="center">
		<form action="${pageContext.request.contextPath }/positionManage/doadd"
			method="post" >		
			<table border="0" height="200px">
				
				<tr>
					<td>工位名称</td>
					<td><input type="text" name="placeName" /></td>
				</tr>
				<tr>
					<td>工位主管</td>
					<td><input type="text" name="placeAdmin" /></td>
				</tr>
				<tr>
					<td>所属车间</td>
					<td><select name="shopId">
							<option value="1">1</option>
							<option value="2">2</option>
							<option value="3">3</option>
					</select></td>
				</tr>
				<tr>
					<td>所属产线</td>
					<td><select name="linerId">
							<option value="1">1</option>
							<option value="2">2</option>
							<option value="3">3</option>
					</select></td>
				</tr>
				<tr>
					<td colspan="2"><input type="submit" value="增加" /></td>
				</tr>
			</table>
		</form>
	</div>
</body>
</html>