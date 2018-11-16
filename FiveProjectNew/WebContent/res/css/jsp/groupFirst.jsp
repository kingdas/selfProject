<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

<!-- 引入bootstrap -->
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<!-- 兼容IE浏览器 -->
<meta name="viewport" content="width=device-width, initial-scale=1">
<!-- 声明使用 -->
<%-- <link rel="stylesheet"
	href="${pageContext.request.contextPath}/res/bootstrap-3.3.5-dist/css/bootstrap.min.css">
<script
	src="${pageContext.request.contextPath}/res/jquery/jquery-1.11.0.js"></script>
<script
	src="${pageContext.request.contextPath}/res/bootstrap-3.3.5-dist/js/bootstrap.min.js"></script> --%>
<link rel="stylesheet"
	href="${pageContext.request.contextPath}/res/bootstrap-3.3.7-dist/css/bootstrap.min.css">
<script src="${pageContext.request.contextPath}/res/js/jquery-1.11.0.js"></script>
<script
	src="${pageContext.request.contextPath}/res/bootstrap-3.3.7-dist/js/bootstrap.min.js"></script>
<title>Insert title here</title>

   
       
</head>
<body>
<div align="center">
 
<form class="form-inline" action="${pageContext.request.contextPath}/cont/findByConditons"
			method="post">
  <div class="form-group">
    <label for=groupName">组名称：</label>
    <input type="text" class="form-control" id="groupName" name="groupName">
  </div>
  <div class="form-group">
    <label for=describeGroup">组描述：</label>
    <input type="text" class="form-control" id="describeGroup" name="describeGroup">
  </div>
  <button type="submit" class="btn btn-default">查询       <span class="glyphicon glyphicon-search" aria-hidden="true" ></span></button>
</form>

		<hr size="2" color="black" />
		<br />
      
      <!-- 删除的隐藏与显示 -->
       <script type="text/javascript">
        $(document).ready(function(){
        	$(".chu").hide();
        	$("#shan").click(function(){
        		$(".chu").toggle();
        	});
        });
        </script>
        
        <!-- 修改的隐藏与显示 -->
        <script type="text/javascript">
        $(document).ready(function(){
        	$(".gai").hide();
        	$("#xiu").click(function(){
        		$(".gai").toggle();
        	});
        	//导出文件绑定事件
        	$("#Output").click(function(){
        		location.href = "${pageContext.request.contextPath}/cont/outfile";
        	});
        });
        </script>
         
        <p>
        <!-- 增加 -->
        <a href="${pageContext.request.contextPath}/cont/jumpAdd" class="btn btn-default btn-lg active" role="button">
        <span class="glyphicon glyphicon-plus-sign" aria-hidden="true"></span> 添加</a>
        <!-- 修改 -->
        <button type="button" class="btn btn-default btn-lg active" id="xiu">
        <span class="glyphicon glyphicon-pencil" aria-hidden="true"></span> 修改</button>
        <!-- 删除 -->
        <button type="button" class="btn btn-default btn-lg active" id="shan">
        <span class="glyphicon glyphicon-minus-sign" aria-hidden="true" ></span> 删除</button>
        <!--  导出 -->
        <button type="button" class="btn btn-default btn-lg active" id="Output">
        <span class="glyphicon glyphicon-export" aria-hidden="true" ></span> 导出</button>
        </p>


		<table class="table table-hover">

			<thead>
				<tr>
					<th>序号</th>
					<th>组名称</th>
					<th>组描述</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach items="${s }" var="ss">
					<tr>
						<td>${ss.groupId}</td>
						<td>${ss.groupName}</td>
						<td>${ss.describeGroup}</td>
						<td class="chu"><a href="${pageContext.request.contextPath}/cont/del/${ss.groupId}">刪除</a></td>
						<td class="gai"><a href="${pageContext.request.contextPath}/cont/qUpd/${ss.groupId}">修改</a></td>
					</tr>
				</c:forEach>
			</tbody>
		</table>

</div>
	
</body>
</html>