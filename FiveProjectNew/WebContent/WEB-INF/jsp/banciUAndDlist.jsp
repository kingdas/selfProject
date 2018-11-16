<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<!--此处${pageContext.request.contextPath }==/com.five.banci-->
<!--ssm框架中springmvc会拦截静态资源，所以应该在mvc中处理静态资源-->
<!--ssm框架中应该加上所用资源的绝对路径，或者在根路径前加‘/’-->
<link rel="stylesheet"
	href="${pageContext.request.contextPath}/res/bootstrap-3.3.7-dist/css/bootstrap.min.css">
<script src="${pageContext.request.contextPath}/res/js/jquery-1.11.0.js"></script>
<script
	src="${pageContext.request.contextPath}/res/bootstrap-3.3.7-dist/js/bootstrap.min.js"></script>
<!-- JS -->
<script type="text/javascript">
	function myfunction() {
		var sids = new Array();
		var sid = document.getElementsByName("delete");
		for ( var i = 0; i < sid.length; i++) {
			if (sid[i].checked)
				sids.push(sid[i].value);
		}
		location.href = "${pageContext.request.contextPath }/bcl/del/" + sids;
		alert("已删除！");
	}
	/* alert("已删除！"); */
</script>
<title>Insert title here</title>
</head>
<body>
	<br>
	<br>
	<br>
	<br>
	<br>
	<br>
	<div align="center">
		<table class="table table-bordered" style="width: 800px;">
			<tr>
				<th>序号</th>
				<th>班次名称</th>
				<th>开始时间</th>
				<th>结束时间</th>
				<th>所属车间</th>
				<th>所属产线</th>
				<th>所属工位</th>
				<th>修改</th>
				<!-- <th>删除</th> -->
				<th><button onclick="myfunction()" id="queren" type="button"
						class="btn btn-default">
						<span class="glyphicon glyphicon-ok">&nbsp;确认</span>
					</button></th>
			</tr>
			<c:forEach items="${us }" var="u">
				<tr>
					<td>${u.shiftid}</td>
					<td>${u.shiftname}</td>
					<td>${u.shiftstarttime}</td>
					<td>${u.shiftendtime}</td>
					<%-- <td><fmt:formatDate value="${u.shiftstarttime}"
							pattern="HH:mm"></fmt:formatDate></td>
					<td><fmt:formatDate value="${u.shiftendtime}"
							pattern="HH:mm"></fmt:formatDate></td> --%>
					<td>${u.shopid}</td>
					<td>${u.linerid}</td>
					<td>${u.placeid}</td>
					<td><a
						href="${pageContext.request.contextPath }/bcl/update/${u.shiftid}"
						class="btn btn-default">修改</a></td>
					<td><input type="checkbox" value="${u.shiftid }"
						name="delete" class="delete"></td>
				</tr>
			</c:forEach>
		</table>
		<a href="${pageContext.request.contextPath }/bcl/lis?startPage=0"
			class="btn btn-default"><span
			class="glyphicon glyphicon-step-backward">&nbsp;第一页</span></a> <a
			href="${pageContext.request.contextPath }/bcl/lis?startPage=${currentPage-2<=0?0:currentPage-2}"
			class="btn btn-default"><span
			class="glyphicon glyphicon-backward">&nbsp;上一页</span></a> <a
			href="${pageContext.request.contextPath }/bcl/lis?startPage=${currentPage-1==totalPage?totalPage:currentPage}"
			class="btn btn-default"><span class="glyphicon glyphicon-forward">&nbsp;下一页</span></a>
		<a
			href="${pageContext.request.contextPath }/bcl/lis?startPage=${totalPage}"
			class="btn btn-default"><span
			class="glyphicon glyphicon-step-forward">&nbsp;尾页</span></a> <a
			href="${pageContext.request.contextPath }/bcl/list"
			class="btn btn-default"><span class="glyphicon glyphicon-repeat">&nbsp;返回首页</span></a>
	</div>
</body>
</html>