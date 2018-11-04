<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script type="text/javascript">
	function checkName(){
		var name = form1.realName.value
		if(name==null){
			alert("请输入真实姓名")
			form1.name.focus()
			return
		}else{
			var objExp = /[\u4E00-\u9FA5]{2,}/;
			if(objExp.test(name)==true){
				alert("输入的姓名有效")
			}else{
				alert("请输入真实姓名")
			}
		}
	}
</script>
</head>
<body>
	<form action="" method="post" name="form1">
		请输入真实姓名： <input name="realName" type="text" id="realName" /> <input
			name="Button" type="button" onclick="checkName()" value="检测" />
	</form>

</body>
</html>