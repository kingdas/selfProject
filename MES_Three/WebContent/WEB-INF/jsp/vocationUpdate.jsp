<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<div align="center">
		<h3>修改用户</h3>
		<form action="${pageContext.request.contextPath}/vocation/doUpdate"
			method="post">
		 
			<table width="640" border="1">
			<tr>
			<td>序号</td>
			<td><input type="text" name="holidayId" value="${u.holidayId}" readonly="readonly"/></td>
			</tr> 
				<tr>
					<td>假期名称</td>
					<td><input type="text" name="holidayName"
						value="${u.holidayName}"  /></td>
				</tr>
				<tr>
					<td>开始时间</td>
					<td><input type="text" name="holidayStartTime" value="${u.holidayStartTime}" /></td>
				</tr>
				<tr>
					<td>结束时间</td>
					<td><input type="text" name="holidayEndTime"
						value="${u.holidayEndTime}" /></td>
				</tr>
				<tr>
					<td>车&nbsp;&nbsp;间</td>
					<td><select name="shopId">
							<option value="1">1</option>
							<option value="2">2</option>
							<option value="3">3</option>
					</select></td>
				</tr>
				<tr>
				<td>产&nbsp;&nbsp;线</td>
					<td><select name="linerId">
							<option value="1">1</option>
							<option value="2">2</option>
							<option value="3">3</option>
					</select></td>
				</tr>
				<tr>
				<td>工&nbsp;&nbsp;位</td>
					<td><select name="placeId">
							<option value="1">1</option>
							<option value="2">2</option>
							<option value="3">3</option>
					</select></td>
				</tr>
				<tr>
					<td>班&nbsp;&nbsp;次</td>
					<td><select name="shiftId">
							<option value="1">1</option>
							<option value="2">2</option>
							<option value="3">3</option>
					</select></td>
					</tr>
				<tr>
					<td colspan="2"><input type="submit" value="修改" /></td>
				</tr>
			</table>
		</form>
	</div>
</body>
</html>

				
					
					