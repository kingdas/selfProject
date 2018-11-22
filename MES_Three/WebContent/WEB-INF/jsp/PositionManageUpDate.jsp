<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<style type="text/css">
</style>

</head>
<body>
	<div align="center">
		<form
			action="${pageContext.request.contextPath }/positionManage/doupdate?placeId=${l.placeId}"
			method="post">

			<table width="640" border="1">
				<tr>
					<td>工位名称</td>
					<td><input type="text" name="placeName"
						value="${l.placeName }" /></td>
				</tr>
				<tr>
					<td>工位主管</td>
					<td><input type="text" name="placeAdmin"
						value="${l.placeAdmin }" /></td>
				</tr>
				<tr>
					<td>所属车间</td>
					<td><input type="text" name="shopId" value="${l.shopId }" /></td>
				</tr>
				<tr>
					<td>所属产线</td>
					<td><input type="text" name="linerId" value="${l.linerId }" /></td>
				</tr>
			</table>
			<tr>
				<td colspan="2"><input type="submit" value="修改" /></td>
			</tr>
		</form>
	</div>
</body>
</html>