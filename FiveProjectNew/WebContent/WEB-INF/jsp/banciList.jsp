<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
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
<script type="text/javascript">
	function checkPage() {//错的
		var sp = document.getElementById("startPage").value;
		if (sp < 0) {
			sp = 0;
		}
	}
</script>
<title>Insert title here</title>
</head>
<body>
	<br>
	<div align="center">
		<form action="${pageContext.request.contextPath }/bcl/findbycondition"
			method="post">
			<table class="table table-bordered" style="width: 800px;">
				<tr>
					<td>所属车间</td>
					<td><select name="shopid"
						class="btn btn-default dropdown-toggle" style="width: 230px;">
							<!-- mapper中写条件查询时，保持条件一致 -->
							<option value="-1">---</option>
							<option value="1">1号车间</option>
							<option value="2">2号车间</option>
							<option value="3">3号车间</option>
					</select></td>
					<td>所属产线</td>
					<td><select name="linerid"
						class="btn btn-default dropdown-toggle">
							<option value="-1">---</option>
							<option value="1">1号产线</option>
							<option value="2">2号产线</option>
							<option value="3">3号。。</option>
					</select></td>
					<td>所属工位</td>
					<td><select name="placeid"
						class="btn btn-default dropdown-toggle">
							<option value="-1">---</option>
							<option value="1">1号工位</option>
							<option value="2">2号。。</option>
							<option value="3">3号。。</option>
					</select></td>
				</tr>
				<tr>
					<td>班次名称</td>
					<td><input class="form-control" type="text"
						style="width: 230px;" id="shiftname" name="shiftname" /></td>
					<td>
						<button type="submit" class="btn btn-default">
							<span class="glyphicon glyphicon-search">&nbsp;查询</span>
						</button>
					</td>
					<!--<span class="glyphicon glyphicon-search"></span>-->
					<!-- <button class="btn btn-default" type="submit">查询</button> -->
				</tr>
			</table>
		</form>
		<hr>
		<table width="800">
			<tr>
				<td><a href="${pageContext.request.contextPath }/bcl/add"
					class="btn btn-default"><span class="glyphicon glyphicon-plus">&nbsp;添加</span></a></td>
				<td><a href="${pageContext.request.contextPath }/bcl/lis"
					class="btn btn-default"><span
						class="glyphicon glyphicon-pencil">&nbsp;修改</span></a></td>
				<td><a href="${pageContext.request.contextPath }/bcl/lis"
					class="btn btn-default"><span
						class="glyphicon glyphicon glyphicon-remove">&nbsp;删除</span></a></td>
				<td><a href="" class="btn btn-default"><span
						class="glyphicon glyphicon-share-alt">&nbsp;导出</span></a></td>
			</tr>
		</table>
		<hr>
		<table class="table table-bordered" style="width: 800px;">
			<tr>
				<th>序号</th>
				<th>班次名称</th>
				<th>开始时间</th>
				<th>结束时间</th>
				<th>所属车间</th>
				<th>所属产线</th>
				<th>所属工位</th>
			</tr>
			<c:forEach items="${us }" var="u">
				<tr>
					<td>${u.shiftid}</td>
					<td>${u.shiftname}</td>
					<%-- <td><fmt:formatDate value="${u.shiftstarttime}"
							pattern="HH:mm:ss"></fmt:formatDate></td>
					<td><fmt:formatDate value="${u.shiftendtime}"
							pattern="HH:mm:ss"></fmt:formatDate></td> --%>
					<td>${u.shiftstarttime}</td>
					<td>${u.shiftendtime}</td>
					<td>${u.shopid}</td>
					<td>${u.linerid}</td>
					<td>${u.placeid}</td>
				</tr>
			</c:forEach>
		</table>
		<a href="${pageContext.request.contextPath }/bcl/list?startPage=0"
			class="btn btn-default"><span
			class="glyphicon glyphicon-step-backward" onclick="checkPage()">&nbsp;第一页</span></a>
		<a
			href="${pageContext.request.contextPath }/bcl/list?startPage=${currentPage-2<=0?0:currentPage-2}"
			class="btn btn-default"><span
			class="glyphicon glyphicon-backward" onclick="checkPage()">&nbsp;上一页</span></a>
		<%-- <c:forEach items="${zs }" var="z">
			<a class="btn btn-default">第${z }页</a>
			</c:forEach> --%>
		<a
			href="${pageContext.request.contextPath }/bcl/list?startPage=${currentPage-1==totalPage?totalPage:currentPage}"
			class="btn btn-default"><span class="glyphicon glyphicon-forward">&nbsp;下一页</span></a>
		<a
			href="${pageContext.request.contextPath }/bcl/list?startPage=${totalPage}"
			class="btn btn-default"><span
			class="glyphicon glyphicon-step-forward" onclick="checkPage()">&nbsp;尾页</span></a>
	</div>
</body>
</html>