 var head="http://localhost:8080/FiveProject/";
 $(document).ready(function() { 
		// 用户组管理 
     $("#yonghuzu").click(function(){
	 $("#mainpage").html("<iframe src='"+head+"cont/findAll' width='100%' height='650px' style='border:0px;' ></iframe>"); });
	
	//产线管理 
	 $("#chanxian").click(function(){ 
	 $("#mainpage").html("<iframe src='"+head+"liner/findAll' width='100%' height='650px' style='border:0px;' ></iframe>"); }); //班次管理
	 
	 $("#banci").click(function(){ 
	 $("#mainpage").html("<iframe src='"+head+"/bcl/list' width='100%' height='650px' style='border:0px;' ></iframe>");	 });
	 $("#chanpingmanger").click(function(){ 
		 $("#mainpage").html("<iframe src='"+head+"/cont2/findAll' width='100%' height='650px' style='border:0px;' ></iframe>");
	  });
	 });
	 
function showmenu(a) {
				if (document.getElementById("Layer" + a).style.display == "block") {
					document.getElementById("Layer" + a).style.display = "none";
	} else {
		document.getElementById("Layer" + a).style.display = "block";
	}
}