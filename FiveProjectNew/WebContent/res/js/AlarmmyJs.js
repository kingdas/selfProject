var bp="http://localhost:8080/FiveProject/";//删除弹框

function checkDescription() {//判断非空
	var s = "";
	var description = document.getElementById("description").value;
	if (!(description != null && description.trim().length > 0)) {
		s += "描述";
	} 
	if (s.length > 0) {
		s += "必填";
		alert(s);
		return false;
	}
	
	return true;
}

function Del() {  //多选删除确认
	var reasonId = new Array();
	var idd = document.getElementsByName("del");
	for ( var i = 0; i < idd.length; i++) {
		if (idd[i].checked)
			reasonId.push(idd[i].value);
	}
	if (confirm("确认删除吗！") ) {

		location.href = bp+"/userbj/del?reasonId="+reasonId;
	}
}

function xiugai() {//单选修改
	var reasonId = new Array();
	var idd = document.getElementsByName("update");
	for ( var i = 0; i < idd.length; i++) {
		if (idd[i].checked)
			reasonId.push(idd[i].value);

	}
	location.href = bp+'/userbj/up/'+reasonId;
}
