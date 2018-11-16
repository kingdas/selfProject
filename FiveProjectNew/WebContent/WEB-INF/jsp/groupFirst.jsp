<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

<!-- 引入bootstrap -->
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<!-- 兼容IE浏览器 -->
<meta name="viewport" content="width=device-width, initial-scale=1">
<!-- 声明使用 -->
<%-- <link rel="stylesheet"
	href="${pageContext.request.contextPath}/res/bootstrap-3.3.5-dist/css/bootstrap.min.css">
<script
	src="${pageContext.request.contextPath}/res/jquery/jquery-1.11.0.js"></script>
<script
	src="${pageContext.request.contextPath}/res/bootstrap-3.3.5-dist/js/bootstrap.min.js"></script> --%>
<link rel="stylesheet"
	href="${pageContext.request.contextPath}/res/bootstrap-3.3.7-dist/css/bootstrap.min.css">
<script src="${pageContext.request.contextPath}/res/js/jquery-1.11.0.js"></script>
<script
	src="${pageContext.request.contextPath}/res/bootstrap-3.3.7-dist/js/bootstrap.min.js"></script>
<title>Insert title here</title>
<style type="text/css">
    body{
    }
    table .table-striped{
    }
    table th{
        text-align: left;
        height: 30px;
        background: #deeeee;
        padding: 5px;
        margin: 0;
        border: 0px;
    }
    table td{
        text-align: left;
        height:30px;
        margin: 0;
        padding: 5px;
        border:0px
    }
    table tr:hover{
        background: #eeeeee;
    }
    .span6{
        /*width:500px;*/
        float:inherit;
        margin:10px;
    }
    #pagiDiv span{
        background:#1e90ff;
        border-radius: .2em;
        padding:5px;
    }
</style>
   <script type="text/javascript" src="${pageContext.request.contextPath}/res/js/page.js"></script>
    <script type="text/javascript">
        //全局变量
        var numCount;       //数据总数量
        var columnsCounts;  //数据列数量
        var pageCount;      //每页显示的数量
        var pageNum;        //总页数
        var currPageNum ;   //当前页数

        //页面标签变量
        var blockTable;
        var preSpan;
        var firstSpan;
        var nextSpan;
        var lastSpan;
        var pageNumSpan;
        var currPageSpan;



        window.onload=function(){
            //页面标签变量
            blockTable = document.getElementById("blocks");
            preSpan = document.getElementById("spanPre");
            firstSpan = document.getElementById("spanFirst");
            nextSpan = document.getElementById("spanNext");
            lastSpan = document.getElementById("spanLast");
            pageNumSpan = document.getElementById("spanTotalPage");
            currPageSpan = document.getElementById("spanPageNum");

            numCount = document.getElementById("blocks").rows.length - 1;       //取table的行数作为数据总数量（减去标题行1）
            alert(numCount)
            columnsCounts = blockTable.rows[0].cells.length;
            pageCount = 5;
            pageNum = parseInt(numCount/pageCount);
            if(0 != numCount%pageCount){
                pageNum += 1;
            }

            firstPage();
        };
    </script>
       
</head>
<body>
<div align="center">
 
<form class="form-inline" action="${pageContext.request.contextPath}/cont/findByConditons"
			method="post">
  <div class="form-group">
    <label for=groupName">组名称：</label>
    <input type="text" class="form-control" id="groupName" name="groupName">
  </div>
  <div class="form-group">
    <label for=describeGroup">组描述：</label>
    <input type="text" class="form-control" id="describeGroup" name="describeGroup">
  </div>
  <button type="submit" class="btn btn-default">查询       <span class="glyphicon glyphicon-search" aria-hidden="true" ></span></button>
</form>

		<hr size="2" color="black" />
		<br />
      
      <!-- 删除的隐藏与显示 -->
       <script type="text/javascript">
        $(document).ready(function(){
        	$(".chu").hide();
        	$("#shan").click(function(){
        		$(".chu").toggle();
        	});
        });
        </script>
        
        <!-- 修改的隐藏与显示 -->
        <script type="text/javascript">
        $(document).ready(function(){
        	$(".gai").hide();
        	$("#xiu").click(function(){
        		$(".gai").toggle();
        	});
        	//导出文件绑定事件
        	$("#Output").click(function(){
        		location.href = "${pageContext.request.contextPath}/cont/outfile";
        	});
        });
        </script>
         
         
         
        <p>
        <!-- 增加 -->
        <a href="${pageContext.request.contextPath}/cont/jumpAdd" class="btn btn-default btn-lg active" role="button">
        <span class="glyphicon glyphicon-plus-sign" aria-hidden="true"></span> 添加</a>
        <!-- 修改 -->
        <button type="button" class="btn btn-default btn-lg active" id="xiu">
        <span class="glyphicon glyphicon-pencil" aria-hidden="true"></span> 修改</button>
        <!-- 删除 -->
        <button type="button" class="btn btn-default btn-lg active" id="shan">
        <span class="glyphicon glyphicon-minus-sign" aria-hidden="true" ></span> 删除</button>
        <!--  导出 -->
        <button type="button" class="btn btn-default btn-lg active" id="Output">
        <span class="glyphicon glyphicon-export" aria-hidden="true" ></span> 导出</button>
        </p>


		<table class="table table-hover table-striped" id="blocks" >

			<thead>
				<tr>
					<th>序号</th>
					<th>组名称</th>
					<th>组描述</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach items="${s }" var="ss">
					<tr>
						<td>${ss.groupId}</td>
						<td>${ss.groupName}</td>
						<td>${ss.describeGroup}</td>
						<td class="chu"><a href="${pageContext.request.contextPath}/cont/del/${ss.groupId}">刪除</a></td>
						<td class="gai"><a href="${pageContext.request.contextPath}/cont/qUpd/${ss.groupId}">修改</a></td>
					</tr>
				</c:forEach>
			</tbody>
		</table>
   <div id="pagiDiv" align="right" style="width:800px">
        <span id="spanFirst">First</span>  
        <span id="spanPre">Pre</span>  
        <span id="spanNext">Next</span>  
        <span id="spanLast">Last</span>  
        The <span id="spanPageNum"></span> Page/Total <span id="spanTotalPage"></span> Page
    </div>

</div>
	
</body>
</html>