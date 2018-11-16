<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
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

<script type="text/javascript">
	function add() {
		location.href = "${pageContext.request.contextPath}/test/add"
	}
</script>
<script src="https://cdn.staticfile.org/jquery/1.10.2/jquery.min.js"></script>
<script type="text/javascript">
	function shanchu() {
		var id = new Array();
		var idd = document.getElementsByName("del");
		for ( var i = 0; i < idd.length; i++) {
			if (idd[i].checked)
				id.push(idd[i].value);

		}
		if (confirm("确认删除吗！") == true) {
			location.href = "${pageContext.request.contextPath}/test/del/" + id;
		}

	}

	function xiugai() {
		var id = new Array();
		var idd = document.getElementsByName("update");
		for ( var i = 0; i < idd.length; i++) {
			if (idd[i].checked)
				id.push(idd[i].value);

		}
		location.href = "${pageContext.request.contextPath}/test/update/" + id;
	}
</script>


<script>
	$(document).ready(function() {
		$(".sc1").hide();
		$("#hide").click(function() {
			$(".sc1").toggle();
		});
	});
</script>
<script>
	$(document).ready(function() {
		$(".sc2").hide();
		$("#show").click(function() {

			$(".sc2").toggle();
		});
	});
</script>
<script type="text/javascript">
	$(document).ready(function() {
		$("#zj").click(function() {
			$("#bg").load("${pageContext.request.contextPath}/test/add")
		})
	});
</script>

</head>
<body>



	<div align="center" style="margin-top: 20px">
		<form action="${pageContext.request.contextPath}/test/findByCondition">
			角色名称：<input type="text" name="name"> 
			角色描述：<input type="text"	name="miaosu">
			<button type="submit" class="btn btn-default" aria-label="Left Align">
				<span class="glyphicon glyphicon-search">查询</span>
			</button>
		</form>
	</div>

	<br>
	<br>
	<br>
	<br>

	<div align="center">
		<button type="button" class="btn btn-default" aria-label="Left Align"
			id="zj" style="font-size: 18px; margin-left: 60px;">
			<span class="glyphicon glyphicon-plus">增加</span>
		</button>

		<button type="button" class="btn btn-default" aria-label="Left Align"
			id="show" style="font-size: 18px; margin-left: 60px;">
			<span class="glyphicon glyphicon-plus">修改</span>
		</button>

		<button type="button" class="btn btn-default" aria-label="Left Align"
			id="hide" style="font-size: 18px; margin-left: 60px;">
			<span class="glyphicon glyphicon-minus">删除</span>
		</button>
	</div>

	<br>
	<br>
	<br>
	<br>
	<div align="center" id="bg">

		<table class="table table-bordered">
			<tr>
				<th>序号</th>
				<th>角色名称</th>
				<th>角色描述</th>
				<th class="sc2" width="20"><input class="btn btn-default"
					type="button" onclick="xiugai()" value="修改"></th>
				<th class="sc1" width="20"><input class="btn btn-default"
					type="button" onclick="shanchu()" value="删除"></th>
			</tr>
			<%
				int i = 0;
			%>
			<c:forEach items="${l}" var="l" varStatus="i">
			<tr>
					<td><c:forEach items="${lk}" var="lk" begin="${i.count-1}"
							end="${i.count-1}">
						${lk}
					</c:forEach></td>

					<td>${l.name}</td>
					<td>${l.miaosu}</td>
					<td class="sc2"><input align="middle" type="radio"
						name="update" value="${l.id}"></td>
					<td class="sc1"><input align="middle" type="checkbox"
						name="del" value="${l.id}"></td>
				</tr>


			</c:forEach>
		</table>


		<a
			href="${pageContext.request.contextPath}/test/findall?n=${currentPage-2}">
			上一页</a>

		<c:forEach items="${li}" var="li">

			<a href="${pageContext.request.contextPath}/test/findall?n=${li}"
				class="btn btn-default">${li}</a>

		</c:forEach>

		<a
			href="${pageContext.request.contextPath}/test/findall?n=${currentPage}">
			下一页 </a>
		<form name="f1" method="POST"
			action="${pageContext.request.contextPath}/test/findall">
			转到第: <input type="text" name="n" size="2">页 <input
				type="submit" value="GO" name="cndok" class="btn btn-default">


		</form>


	</div>


</body>
</html>