<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

<!-- 引入bootstrap -->
<meta http-equiv="X-UA-Compatible" content="IE=edge"> <!-- 兼容IE浏览器 -->
<meta name="viewport" content="width=device-width, initial-scale=1"><!-- 声明使用 -->
<link rel="stylesheet"
	href="${pageContext.request.contextPath}/res/bootstrap-3.3.7-dist/css/bootstrap.min.css">
<script src="${pageContext.request.contextPath}/res/js/jquery-1.11.0.js"></script>
<script
	src="${pageContext.request.contextPath}/res/bootstrap-3.3.7-dist/js/bootstrap.min.js"></script>
<title>Insert title here</title>

<title>Insert title here</title>
</head>
<body>
<h3 style="margin: 30px;">新增产品</h3>

<hr size="2" color="black" />


<form action="${pageContext.request.contextPath}/cont2/add" method="post">

  <div class="form-group">
    <label for="itemCode" >产品编码：</label>
    <input type="text" class="form-control"  name="itemCode">
  </div>
  
  <div class="form-group">
    <label for="description" >产品描述：</label>
         <input type="text" class="form-control" name="description">
  </div>
  
  <div class="form-group">
    <label for="crustSource" >来源：</label>
         <input type="text" class="form-control" name="crustSource">
  </div>
  
  <div class="form-group">
    <label for="program" >程序：</label>
         <input type="text" class="form-control" name="program">
  </div>
  
  <div class="form-group">
    <label for="oem" >品牌：</label>
         <input type="text" class="form-control" name="oem">
  </div>
  
  <div class="form-group">
    <label for="carModel" >车型：</label>
         <input type="text" class="form-control" name="carModel">
  </div>
  
  <div class="form-group">
    <label for="component" >组件：</label>
         <input type="text" class="form-control" name="component">
  </div>
  
  <div class="form-group">
    <label for="hideRatio" >覆盖率：</label>
         <input type="text" class="form-control" name="hideRatio">
  </div>
  
  <div class="form-group">
    <label for="scrap" >报废率：</label>
         <input type="text" class="form-control" name="scrap">
  </div>
  
  <div style="margin: 30px;" align="center">
      <button type="submit" class="btn btn-default btn-lg active">
      <span class="glyphicon glyphicon-ok" aria-hidden="true"></span> 保存</button>
      
       <a href="${pageContext.request.contextPath}/cont2/findAll" class="btn btn-default btn-lg active" role="button">
      <span class="glyphicon glyphicon-remove" aria-hidden="true"></span>  返回</a>
   </div> 
</form>

</body>
</html>