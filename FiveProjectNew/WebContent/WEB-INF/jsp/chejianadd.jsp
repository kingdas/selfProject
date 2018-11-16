<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<h2 align="center">新增车间</h2>
<hr/>
<div align="center">
<form action="${pageContext.request.contextPath}/user/add" method="post" >
<tr>
            车间名称：<td><input type="text" name="shopName" /> </td>
            车间主管：<td><input type="text" name="shopAdmin" /></td>        
</tr> <br/> <br/>
<tr>
<td><input class="btn btn-default" type="submit" value="保存" /></td>
</tr> <br/> <br/> <br/>
<tr>
<td><a href="${pageContext.request.contextPath}/user/find" method="post">返回</a></td>
</tr>
</form>
</div>
</body>
</html>