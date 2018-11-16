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
<link rel="stylesheet"
	href="${pageContext.request.contextPath}/res/bootstrap-3.3.7-dist/css/bootstrap.min.css">
<script src="${pageContext.request.contextPath}/res/js/jquery-1.11.0.js"></script>
<script
	src="${pageContext.request.contextPath}/res/bootstrap-3.3.7-dist/js/bootstrap.min.js"></script>
<title>Insert title here</title>
<title>Insert title here</title>

   
       
</head>
<body>
<div align="center" style="margin-top: 10px;">
<form class="form-inline" action="${pageContext.request.contextPath}/cont2/findByConditons"
			method="post">
  <div class="form-group">
    <label for=itemCode">产品编码：</label>
    <input type="text" class="form-control" id="itemCode" name="itemCode">
  </div>
  <div class="form-group">
    <label for=description">产品描述：</label>
    <input type="text" class="form-control" id="description" name="description">
  </div>
  <div class="form-group">
    <label for=crustSource">来源：</label>
    <input type="text" class="form-control" id="crustSource" name="crustSource">
  </div>
  <button type="submit" class="btn btn-default">查询   <span class="glyphicon glyphicon-search" aria-hidden="true" ></span></button>
</form>

		<hr size="2" color="black" />
		<br />
      
      
       <script type="text/javascript">
        $(document).ready(function(){
        	//删除的隐藏与显示
        	$(".chu").hide();
        	$("#shan").click(function(){
        		$(".chu").toggle();
        	});
        	
        	//修改的隐藏与显示
        	$(".gai").hide();
        	$("#xiu").click(function(){
        		$(".gai").toggle();
        	});
        	
        	//批量删除
        	$("#makeSure").click(function() {
    	    var ids=new Array();
    	    var objs = document.getElementsByName("isdelete");
    	    for ( var i = 0; i < objs.length; i++) {
    	       if (objs[i].checked)
    			  ids.push(objs[i].value);
    				}
    			location.href="http://localhost:8080/web6/cont2/del/"+ids;
    	});
        	
        });
        </script>
         
        <p>
        <!-- 增加 -->
        <a href="${pageContext.request.contextPath}/cont2/jumpAdd" class="btn btn-default btn-lg active" role="button">
        <span class="glyphicon glyphicon-plus-sign" aria-hidden="true"></span> 添加</a>
        <!-- 修改 -->
        <button type="button" class="btn btn-default btn-lg active" id="xiu">
        <span class="glyphicon glyphicon-pencil" aria-hidden="true"></span> 修改</button>
        <!-- 删除 -->
        <button type="button" class="btn btn-default btn-lg active" id="shan">
        <span class="glyphicon glyphicon-minus-sign" aria-hidden="true" ></span> 删除</button>
        <!--  导出 -->
        <button type="button" class="btn btn-default btn-lg active" >
        <span class="glyphicon glyphicon-export" aria-hidden="true" ></span> 导出</button>
        </p>


		<table class="table table-hover">

			<thead>
				<tr>
					<th>序号</th>
					<th>产品编码</th>
					<th>产品描述</th>
					<th>来源</th>
					<th>程序</th>
					<th>品牌</th>
					<th>车型</th>
					<th>组件</th>
					<th>覆盖率</th>
					<th>报废率</th>
					<th><button type="button" class="btn btn-default btn-lg active" id="makeSure">确定</button></th>
				</tr>
			</thead>
			<tbody>
				<c:forEach items="${l }" var="ll">
					<tr>
						<td>${ll.itemId}</td>
						<td>${ll.itemCode}</td>
						<td>${ll.description}</td>
						<td>${ll.crustSource}</td>
						<td>${ll.program}</td>
						<td>${ll.oem}</td>
						<td>${ll.carModel}</td>
						<td>${ll.component}</td>
						<td>${ll.hideRatio}</td>
						<td>${ll.scrap}</td>
						<%-- <td class="chu"><a href="${pageContext.request.contextPath}/cont2/del/${ll.itemId}">刪除</a></td> --%>
						<td class="chu"><input type="checkbox" name="isdelete" value="${ll.itemId}"></td><!-- 确定是否删除 -->
						<td class="gai"><a href="${pageContext.request.contextPath}/cont2/qUpd/${ll.itemId}">修改</a></td>
					</tr>
				</c:forEach>
			</tbody>
		</table>

</div>
	
	
</body>
</html>