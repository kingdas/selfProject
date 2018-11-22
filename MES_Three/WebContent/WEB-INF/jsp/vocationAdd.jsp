<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<script language="javascript" type="text/javascript"
	src="My97DatePicker/WdatePicker.js"></script>
</head>
<body>
	<div align="left">
		<h3>新增用户</h3>
		<hr />
		<form action="${pageContext.request.contextPath}/vocation/doAdd"
			method="post">
			<table width="640" border="0">
				<tr>
					<td>假期名称</td>
					<td><input type="text" name="holidayName" /></td>
				</tr>
				<tr>
					<td>车&nbsp;&nbsp;间</td>
					<td><select name="shopId">
							<option value="1">1</option>
							<option value="2">2</option>
							<option value="3">3</option>
					</select></td>
					<td>产&nbsp;&nbsp;线</td>
					<td><select name="linerId">
							<option value="1">1</option>
							<option value="2">2</option>
							<option value="3">3</option>
					</select></td>
					<td>工&nbsp;&nbsp;位</td>
					<td><select name="placeId">
							<option value="1">1</option>
							<option value="2">2</option>
							<option value="3">3</option>
					</select></td>
					<td>班&nbsp;&nbsp;次</td>
					<td><select name="shiftId">
							<option value="1">1</option>
							<option value="2">2</option>
							<option value="3">3</option>
					</select></td>
				</tr>
				<tr>
					<td>开始时间</td>
					<td><input type="text" name="holidayStartTime" class="Wdate"
						onfocus="WdatePicker({dateFmt:'yyyy-MM-dd HH:mm:ss'})" /><br></td>
					<td>结束时间</td>
					<td><input type="text" name="holidayEndTime" class="Wdate"
						onfocus="WdatePicker({dateFmt:'yyyy-MM-dd HH:mm:ss'})" /></td>
				</tr>
				<tr>
					<td colspan="2"><input type="submit" value="保存" /></td>
				</tr>
			</table>
		</form>
	</div>
</body>
</html>
