<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<link rel="stylesheet"
	href="${pageContext.request.contextPath}/res/bootstrap-3.3.7-dist/css/bootstrap.min.css">
<script src="${pageContext.request.contextPath}/res/js/jquery-1.11.0.js"></script>
<script
	src="${pageContext.request.contextPath}/res/bootstrap-3.3.7-dist/js/bootstrap.min.js"></script>

</script>
<script>
$(document).ready(function(){
	 $(".sc1").hide();
 $("#hide").click(function(){
	 $(".sc1").toggle();
  });
});
</script>
<script>

$(document).ready(function(){
	 $(".sc2").hide();
 $("#show").click(function(){
	 
    $(".sc2").toggle();
  });
});
</script>
</head>
<script type="text/javascript"
	src="${pageContext.request.contextPath}/res/js/myJs.js"></script>
<body>
	<div align="center">
		<form action="${pageContext.request.contextPath}/user/select"
			method="post">
			<tr>
				车间名称：
				<td><input type="text" name="shopName" /></td> 车间主管：
				<td><input type="text" name="shopAdmin" /></td>
				<button type="submit" class="glyphicon glyphicon-search"
					aria-label="Left Align">
					<span>查询</span>
				</button>
			</tr>
		</form>
	</div>
	<hr />
	<div align="center">
		<tr>
			<button type="button" class="glyphicon glyphicon-plus"
				onclick="window.location.href=
     '${pageContext.request.contextPath}/user/add'"
				style="font-size: 18px; margin-left: 60px;">
				<span>增加</span>
			</button>

			<button type="button" class="glyphicon glyphicon-pencil"
				aria-label="Left Align" id="show"
				style="font-size: 18px; margin-left: 60px;">
				<span>修改</span>
			</button>

			<button type="button" class="glyphicon glyphicon-minus"
				aria-label="Left Align" id="hide"
				style="font-size: 18px; margin-left: 60px;">删除</button>

			<!--  <button type="button" class="glyphicon glyphicon-minus"
			aria-label="Left Align" id="hide"
			 style="font-size:18px; margin-left:60px;">导出</button> -->
		</tr>
	</div>
	<br />
	<br />
	<br />
	<table class="table table-bordered" align="center">

		<tr>
			<th>序号</th>
			<th>车间名称</th>
			<th>车间主管</th>
		</tr>
		
		<c:forEach items="${us}" var="u" varStatus="i">
			<tr>
				<td><c:forEach items="${ti}" var="ti" begin="${i.count-1 }"
						end="${i.count-1 }"> ${ti}     <!-- 序号 -->
					</c:forEach></td>
				<td>${u.shopName}</td>
				<td>${u.shopAdmin}</td>
				<td class="sc2"><a
					href="${pageContext.request.contextPath}
						/user/up/${u.shopId}">修改</a></td>
				<td class="sc1"><a href="#"
					onclick="Del(${u.shopId},'${u.shopAdmin}')">删除</a></td>
				<!-- <td class="sc3" >导出</td> -->
			</tr>
		</c:forEach>

	</table>
	<div align="center">

		<form name="f1" method="POST"
			action="${pageContext.request.contextPath}/user/find">
			当前第${currentPage}页/共${x }页 <a
				href="${pageContext.request.contextPath}/user/find?n=1">首页</a>
			<c:if test="${x>1}">
				<a
					href="${pageContext.request.contextPath}/user/find?n=${currentPage-1}">
					上一页</a>
			</c:if>
			<c:if test="${x==1}">
				<a>上一页</a>
			</c:if>
			<%-- <c:forEach items="${li}" var="li"> 
			
				<a href="${pageContext.request.contextPath}/user/find?n=${li}"
					class="btn btn-default">${li}</a>       <!-- // 把每一页都直观地迭代显示在下方，点击则对应跳转  -->
			
 </c:forEach> --%>
			<c:if test="${x==1}">
				<a
					href="${pageContext.request.contextPath}/user/find?n=${currentPage+1}">
					第二页 </a>
			</c:if>
			<!--  当条件查询时只显示一页，点击第二页跳转到列表分页第二页 -->
			<c:if test="${x>1}">
				<a
					href="${pageContext.request.contextPath}/user/find?n=${currentPage+1}">
					下一页 </a>
			</c:if>
			<!-- 有多页时，下一页链接 -->
			<c:if test="${x>1}">
				<a href="${pageContext.request.contextPath}/user/find?n=${x}">尾页</a>
			</c:if>
			<!-- 多页时，点击跳转到尾页 -->
			<c:if test="${x==1}">
				<!--  只有一页时，点击不起任何作用 -->
				<a>尾页</a>
			</c:if>
			转到第:<input type="text" name="n" size="4">页 <input
				type="submit" value="跳转" name="cndok" class="btn btn-default">
		</form>
	</div>
</body>
</html>