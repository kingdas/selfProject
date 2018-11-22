<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet"
	href="${pageContext.request.contextPath}/res/bootstrap-3.3.7-dist/css/bootstrap.min.css">
<script
	src="${pageContext.request.contextPath}/res/js/jquery-3.3.1.min.js"></script>
<script
	src="${pageContext.request.contextPath}/res/bootstrap-3.3.7-dist/js/bootstrap.min.js"></script>
<link rel="stylesheet"
	href="${pageContext.request.contextPath}/res/css/frame.css">
<script type="text/javascript"
	src="${pageContext.request.contextPath}/res/js/frame.js"></script>

<title>mes生产管理系统</title>
<style type="text/css">
body {
	/* position: absolute; */
	height: 100%;
	padding: 0 px;
	margin: 0 px;
	/* background-color: #C4C4C4; */
	/* background-image:linear-gradient(to top, #fcc5e4 0%, #fda34b 25%, #ff7882 35%, #c8699e 52%, #7046aa 71%, #0c1db8 87%, #020f75 100%);
	background-repeat: no-repeat; */
}
</style>
</head>
<body>
	<div class="container-fluid" boder-bottom="1px">
		<!-- 页面顶部 -->
		<div class="row navbar navbar-fixed-top"
			style="background-color: rgba(255, 240, 245, 0.2); height: 15%;">
			<div>
				<div class="imga">
					<img src="${pageContext.request.contextPath }/res/image/log.JPG"
						align="center" class="img-responsive" alt="Responsive image">
				</div>
				<div class="tl">
					<h1>MES生产管理系统</h1>
				</div>
			</div>
		</div>
	</div>
	<hr class="hr" />
	<!-- 侧面导航栏 -->
	<div class="row col-md-2.5 side-bar" id="leftrol"
		style="height: 80%; position: absolute; margin-top: 6%; background-color: rgba(255, 240, 245, 0.2); border-right: 1px #ddd solid; margin-left: 2px;">
		<div>
			<div class="h11">
				<h3 class="glyphicon glyphicon-home" style="font-weight: bold;">
					首&nbsp;页</h3>
			</div>

			<div class="h11">
				<h3 class="glyphicon glyphicon-th-large" style="font-weight: bold;">
					<a href="#" onclick="showmenu(3)">系统管理</a>
				</h3>
				<div id="Layer3">
					<ul>
						<li><a href="#" id="user"><strong>用户管理</strong></a></li>
						<li><a href="#" id="role"><strong>角色管理</strong></a></li>
						<li><a href="#" id="userGroup"><strong> 用户组管理</strong></a></li>
						<li><a href="#"><strong>备份管理</strong></a></li>
					</ul>
				</div>
			</div>

			<div class="h11">
				<h3 class="glyphicon glyphicon-th-list" style="font-weight: bold;">
					<a href="#" onclick="showmenu(2)">基础数据</a>
				</h3>
				<div id="Layer2">
					<li><a href="#" id="workshop"><strong>车间管理</strong></a></li>
					<li><a href="#" id="line"><strong>产线管理</strong></a></li>
					<li><a href="#" id="position"><strong>工位管理</strong></a></li>
					<li><a href="#" id="shift"><strong>班次管理</strong></a></li>
					<li><a href="#" id="rest"><strong>休息管理</strong></a></li>
					<li><a href="#" id="vocation"><strong>假期管理</strong></a></li>
					<li><a href="#" id="product"><strong>产品管理</strong></a></li>
					<li><a href="#"><strong>工序管理</strong></a></li>
					<li><a href="#"><strong>生产周期管理</strong></a></li>
					<li><a href="#"><strong>产量报工管理</strong></a></li>
					<li><a href="#" id="baojingleixing"><strong>报警类型管理</strong></a></li>
					<li><a href="#" id="alarmReason"><strong>报警原因管理</strong></a></li>
				</div>
			</div>

			<div class="h11">
				<h3 class="glyphicon glyphicon-list-alt" style="font-weight: bold;">
					<a href="#" onclick="showmenu(1)">报表查询</a>
				</h3>

				<div id="Layer1">
					<li><a href="#"><strong>停机报表</strong></a></li>
					<li><a href="#"><strong>非停机报表</strong></a></li>
					<li><a href="#"><strong>MTBF统计</strong></a></li>
					<li><a href="#"><strong>MTTR统计</strong></a></li>
					<li><a href="#"><strong>OEE统计</strong></a></li>
					<li><a href="#"><strong>报警时间TOP10</strong></a></li>
					<li><a href="#"><strong>报警频次TOP10</strong></a></li>
					<li><a href="#"><strong>每小时产量报表</strong></a></li>
					<li><a href="#"><strong>报警时间比例图</strong></a></li>
					<li><a href="#"><strong>报警频次比例图</strong></a></li>
				</div>
			</div>
		</div>
	</div>
	<!-- 右侧内容 -->
	<!-- <div class="col-md-10 col-md-offset-2" style="margin-top: 9%;" > -->
	<div class="col-md-10 col-md-offset-2"
		style="height: 100px; margin-top: 7%; margin-bottom: -10px;">
		<ul class="nav nav-pills" id="mutagV" style="margin-top: 10px;">
		</ul>
	</div>

	<div class="col-md-10 col-md-offset-2" id="mainpage"
		style="position: fixed; margin-top: 11%;">
		<div
			style="background-image: http://localhost:8080/MES_Three/res/image/background.jpg;">
			<h1>欢迎使用本系统</h1>
		</div>
	</div>
</body>
</html>