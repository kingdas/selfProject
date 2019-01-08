<%@page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@page contentType="text/html; charset=UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script type="text/javascript">
	function checkSloganAndMoney() {
		//alert(1);
		s = "";
		slo = document.getElementById("slogan").value;
		mon = document.getElementById("money").value;
		if (slo == null || slo.trim().length < 1) {
			s += "标题";
		}
		if (mon == null || mon.trim().length < 1) {
			s += "密码";
		}
		if (s.length > 0) {
			s += "不能为空";
			alert(s);
			return false;
		}
		return true;
	}

	function checkMoney(money) {
		if (!/^[1-9]\d{0,9}$/.test(money)) {
			alert("金额必须是正整数");
		}
	}
</script>
</head>
<body>
	<div align="center">
		<form action="${pageContext.request.contextPath }/loan/applyAction"
			method="post" onSubmit="retrun checkSloganAndMoney()">
			<table style="border: 0;">
				<tr>
					<td colspan="2" align="center"><h4>申请贷款</h4></td>
				</tr>
				<tr>
					<td>金额</td>
					<td><input type="text" name="amount" id="money"
						onblur="checkMoney(this.value)"></td>
				</tr>
				<tr>
					<td>标题</td>
					<td><input type="text" name="title" id="slogan"></td>
				</tr>
				<tr>
					<td colspan="2" align="center"><input type="submit" value="提交"></td>
				</tr>
			</table>
		</form>
	</div>
</body>
</html>