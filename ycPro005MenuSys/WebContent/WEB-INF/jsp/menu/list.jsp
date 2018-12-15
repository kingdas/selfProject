<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<c:set var="basePath"
	value="${pageContext.request.scheme}://${pageContext.request.serverName}:${pageContext.request.localPort}${pageContext.request.contextPath}/" />

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<script type="text/javascript" src="${basePath }res/js/jquery-1.9.1.js"></script>
<script type="text/javascript">
	$(function() {
		$(".cnt").each(function() {
			//console.log($(this).val());
			if ($(this).val() == 0) {
				//隐藏
				$(this).parent().find(".orderMenuItem").hide();
			} else {
				//设置菜的份数
				$(this).parent().find(".menuItem").text($(this).val());
			}
		});
	});
</script>
<script type="text/javascript">
	function addPersonCount(pc) {
		if (pc > 0 && pc < 30) {
			$.ajax({
				url : '${basePath }menuSys/order/addPersonCount/' + pc,
				method : 'get',
				dataType : 'json',
				success : function(msg) {
					if (msg.success) {
						alert("设置人数成功");
					}
				}
			});
		} else {
			alert("请正确输入用餐人数");
		}
	}
	function addMenu(img,mid)
	{
		$.ajax({
			url : '${basePath }menuSys/order/addMenu/' + mid,
			method : 'post',
			dataType : 'json',
			success : function(msg) {
				//alert(msg.totalNum);
				$("#tn").text(msg.totalNum);
				$("#tp").text(msg.totalPrice);
				$(img).parent().find(".orderMenuItem").show();
				$(img).parent().find(".menuItem").text(msg.orderInfo[mid].num);
			}
		});
	}
	function subMenu(img,mid)
	{
		$.ajax({
			url : '${basePath }menuSys/order/subMenu/' + mid,
			method : 'post',
			dataType : 'json',
			success : function(msg) {
				$("#tn").text(msg.totalNum);
				$("#tp").text(msg.totalPrice);
				//console.log(msg.orderInfo[mid].num);
				if(msg.orderInfo[mid]!=null&&msg.orderInfo[mid].num>0)
				{
					$(img).parent().find(".menuItem").text(msg.orderInfo[mid].num);
				}else
				{
					$(img).parent().find(".orderMenuItem").hide();
				}
				
			}
		});
	}
</script>
</head>
<body>

	<a href="${basePath }menuSys/order/shoppingCart" target="cnt"> 购物车（<font color="red"> <span
			id="tn">${sc.totalNum }</span>
	</font>）<span id="tp">${sc.totalPrice }</span></a>
	<br />
	<input type="text" name="personCount"
		onblur="addPersonCount(this.value)">
	<table width="580">
		<c:forEach items="${ms}" var="m">
			<tr>
				<td>
					<table width="260">
						<tr>

							<td rowspan="3"><img alt="菜"
								src="${basePath }res/img/upload/a.jpg" width="160" height="160" />
							</td>
							<td>${m.name}</td>
						</tr>
						<tr>
							<td>${m.price}</td>
						</tr>
						<tr>
							<td><input type="hidden" class="cnt"
								value="${sc.orderInfo[m.id]==null?0:sc.orderInfo[m.id].num}" />
								<img onclick="subMenu(this,${m.id})" class="orderMenuItem"
								src="${basePath }res/img/sub.png" /><span id="n${m.id}"
								class="orderMenuItem menuItem">0</span><img
								src="${basePath }res/img/add.png"
								onclick="addMenu(this,'${m.id}')" /></td>
						</tr>
					</table>

				</td>
			</tr>
		</c:forEach>
	</table>


</body>
</html>