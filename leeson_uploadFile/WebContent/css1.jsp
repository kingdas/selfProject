<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link href="css/main.css" rel="stylesheet">
<style type="text/css">
strong {
	color: red;
}

li {
	color: gray;
}

li strong {
	color: blue;
}

#sidebar p {
	font-style: inherit;
	text-align: right;
	margin-top: 0.5em;
}

#err {
	
}

.err {
	
}

[title] {
	color: orange;
}

[title=yy] {
	color: silver;
}
</style>
</head>
<body>
	<h1>用户列表</h1>
	<p>
		<strong>我是粗体，不是斜体</strong>
	</p>
	<ul>
		<li><strong>我是斜体</strong>我不是li Strong</li>
		<li>我是正常的字体</li>
	</ul>
	<hr>
	<div id="sidebar">
		<span>xx</span><br>
		<p>中</p>
	</div>
	<hr>
	<span id="err" class="err" style="">xx</span>
	<br>
	<span id="error" class="err" style="">xxx</span>
	<form action="" name=""></form>
	<input name="" />

	<div title="xx">xx</div>
	<div title="yy">yy</div>
</body>
</html>