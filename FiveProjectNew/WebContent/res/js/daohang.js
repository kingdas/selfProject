var head = "http://localhost:8080/FiveProject/";
//var isclose = false;
/*
 * $(document).ready(function() { // 用户组管理 $("#yonghuzu").click(function(){
 * $("#mainpage").html("<iframe src='"+head+"cont/findAll' width='100%'
 * height='650px' style='border:0px;' ></iframe>"); });
 * 
 * //产线管理 $("#chanxian").click(function(){ $("#mainpage").html("<iframe
 * src='"+head+"liner/findAll' width='100%' height='650px' style='border:0px;' ></iframe>");
 * }); //班次管理
 * 
 * $("#banci").click(function(){ $("#mainpage").html("<iframe
 * src='"+head+"/bcl/list' width='100%' height='650px' style='border:0px;' ></iframe>");
 * 
 * }); $("#chanpingmanger").click(function(){ $("#mainpage").html("<iframe
 * src='"+head+"/cont2/findAll' width='100%' height='650px' style='border:0px;' ></iframe>");
 * addtag(showname,idname,url) }); });
 */
$(document).ready(function() {
					$("#mainpage").html("<iframe src='http://localhost:8080/FiveProject/welcome.jsp' width='100%' height='650px' style='border:0px;' ></iframe>");
					$("#yonghuzu").click(function() {
						change(head + "cont/findAll");
						addtag("用户组管理", "yonghuzu", head + "cont/findAll");
						//changeLast("http://localhost:8080/FiveProject/welcome.jsp");
					});
					$("#chanxian").click(function() {
						change(head + "liner/findAll");
						addtag("产线管理", "chanxian", head + "liner/findAll");
						//changeLast("http://localhost:8080/FiveProject/welcome.jsp");
					});
					$("#banci").click(function() {
						change(head + "/bcl/list");
						addtag("班次管理", "banci", head + "/bcl/list");
						//changeLast("http://localhost:8080/FiveProject/welcome.jsp");
					});
					$("#chanpingmanger").click(function() {
								change(head + "/cont2/findAll");
								addtag("产品管理", "chanpingmanger", head+ "/cont2/findAll");
								//changeLast("http://localhost:8080/FiveProject/welcome.jsp");
							});
					$("#chejian").click(function() {
						change(head + "/user/find");
						addtag("车间管理", "chejian", head+ "/user/find");
						//changeLast("http://localhost:8080/FiveProject/welcome.jsp");
					});
					$("#role").click(function() {
						change(head + "/test/findall");
						addtag("角色管理", "role", head+ "/test/findall");
						baojingleixing				//changeLast("http://localhost:8080/FiveProject/welcome.jsp");
					});
					$("#baojingleixing").click(function() {
						change(head + "/userbj/alarm");
						addtag("报警类型管理", "baojingleixing", head+ "/userbj/alarm");
										//changeLast("http://localhost:8080/FiveProject/welcome.jsp");
					});
				});

function change(url) {
	/*
	 * var a=document.getElementsByName("myLabel"); //var flag=0; for(var i=0;i<a.length;i++){
	 * if(a[i].id==idname){
	 */
	$("#mainpage").html("<iframe src='"+ url
							+ "' width='100%' height='650px' style='border:0px;' ></iframe>");
//alert("zhixing "+url);
}
/*
 * function changelab(idname){ var a=document.getElementsByClassName("myLabel");
 * for(var i=0;i<a.length;i++){ if(a[i].name==idname){ $("#mainpage").html("<iframe
 * src='"+url+"' width='100%' height='650px' style='border:0px;' ></iframe>"); } } }
 */
function changeLast(url) {//当标签只剩最后一个时，可以将显示首页 
	
	var a = document.getElementsByClassName("myLabel");
	//alert(a.length);
	if(a.length>1){
		var end = a[a.length-1];
		change(""+end.name+"");
		//alert(end.name);
	}else if(a.length==0){
		change(url);
	}
}
function removeit(showname) {
	$("#" + showname + "").remove();
	changeLast("http://localhost:8080/FiveProject/welcome.jsp");
}

function addtag(showname, idname, url) {
	var a = document.getElementsByClassName("myLabel");
	var flag = 0;
	for ( var i = 0; i < a.length; i++) {
		if (a[i].id == showname) {
			flag = 1;// 此时选卡里有标签存在 无需再次添加
		}
	}
	if (flag == 0 || a.length == 0) {
		var v1 = "<button type='button' class='btn btn-default myLabel' style='font-size:20px;'";
		var end = "<span class='glyphicon glyphicon-remove'></span></a></button>";
		$("#mutagV").append(
				v1 + "onclick='change(\"" + url + "\")'" + "name='" + url + "'"
						+ "id='" + showname + "'>" + showname
						+ "<a onclick='removeit(\"" + showname + "\")'>" + end);
	}
}
function showmenu(a) {

	if (document.getElementById("Layer" + a).style.display == "block") {
		document.getElementById("Layer" + a).style.display = "none";
	} else {
		document.getElementById("Layer" + a).style.display = "block";
	}
}