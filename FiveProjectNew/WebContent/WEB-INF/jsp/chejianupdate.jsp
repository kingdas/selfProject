<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<div align="center">
<form action="${pageContext.request.contextPath}/user/update"  method="post">
<table class="table table-bordered">
<tr>
<td>车间ID:</td>
<td><input type="text"  name="shopId"  value="${m.shopId}" readonly="readonly"/></td>
</tr>
<tr>
<td>车间名称:</td> 
<td><input  type="text"  name="shopName"  value="${m.shopName}"></td>
</tr>
<tr>
<td>车间主管:</td>
<td><input type="text"  name="shopAdmin"  value="${m.shopAdmin}"></td>
</tr>
<tr>
<td colspan="2"  align="center"><input class="btn btn-default" type="submit" value="保存" ></td>
</tr>
<tr>
<td colspan="2"  align="center"><a href="${pageContext.request.contextPath}
/user/find" method="post">返回</a></td>
</tr>
</table>
</form>
</div>
</body>
</html>