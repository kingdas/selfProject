var bp="http://localhost:8080/FiveProject/";//鍒犻櫎寮规
function Del(shopId,shopAdmin)
	{
		if(window.confirm("确认删除吗？"+shopAdmin))
			{
		location.href = bp+'/user/del/'+shopId;
			}
	}