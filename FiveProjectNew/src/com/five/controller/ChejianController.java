package com.five.controller;

import java.util.ArrayList;
import java.util.List;

import javax.el.ArrayELResolver;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.validation.constraints.Null;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.five.dao.ChejianDao;
import com.five.model.ChejianModel;
import com.five.model.ChejianQuary;
import com.five.service.ChejianService;




@Controller
@RequestMapping("user")
public class ChejianController {
	@Autowired
	private ChejianService chejianSerivce;
    
	@RequestMapping("add")
    public String add() {
		return "chejianadd";
	}
	@RequestMapping(value="add",method= RequestMethod.POST  ) //增加车间信息
    public String add(ChejianModel cm,HttpServletResponse res) {
		res.setCharacterEncoding("utf-8");
		res.setContentType("text/html;charset=utf-8");
		chejianSerivce.add(cm);
		return "redirect:/user/find"; //重定�?
	}
	@RequestMapping(value="del/{shopId}") //删除车间信息
    public String del(@PathVariable Integer shopId) {
		chejianSerivce.del(shopId);
		return "redirect:/user/find";
	}
	@RequestMapping(value="up/{shopId}")
    public String up(@PathVariable Integer shopId,Model t){
		ChejianModel li=chejianSerivce.findById(shopId);
		t.addAttribute("m", li);
		return "chejianupdate";
	}
	@RequestMapping(value="update",method= RequestMethod.POST  ) //修改
    public String update(ChejianModel cm){
		chejianSerivce.update(cm);
		return "redirect:/user/find";
	}
	
	@RequestMapping("find") //从数据库获取车间列表并分页处�?
    public String List(Model t,Integer n){
		double i=chejianSerivce.findShopId().size(); //总记录数   从数据库查询
		int j=8; //每页显示3�?
		int x=(int) Math.ceil(i/j); //总页�?   计算出来
		List li =new ArrayList();
		int y;
		for( y=1;y<=x;y++){
			li.add(y); //获得每一�?
		}
		t.addAttribute("li",li);	
		t.addAttribute("x", x);
		t.addAttribute("n", n);
		List<ChejianModel> lc=null;
		if(null==n||n==0){
			n=1;
			 lc=	chejianSerivce.findAll(0, j); //首页
		}else if(n<=x){
			 lc=chejianSerivce.findAll(j*n-j,j); //任意�?��
		}else{
			n=x;
			lc=chejianSerivce.findAll(j*x-j, j); //�?���?��
		}
		
		List<Integer > tt=new ArrayList<Integer>();//表前序号获取
		for(int a=1;a<=j;a++) {
			tt.add(a+(j*n-j));
		}
		t.addAttribute("ti", tt);
		 Integer currentPage=n; //当前�?
				 t.addAttribute("currentPage", currentPage);
				 t.addAttribute("us", lc);
		return "chejianlist";
		
	}
	@RequestMapping("select") //根据条件查找信息
	public String select(String shopName, String shopAdmin, Model t,HttpServletResponse res,Integer n) {
		ChejianQuary cq = new ChejianQuary();
		res.setCharacterEncoding("utf-8");
		res.setContentType("text/html;charset=utf-8");
		cq.setShopName(shopName);//根据车间姓名和车间主管查�?
		cq.setShopAdmin(shopAdmin);
		List<ChejianModel>us=chejianSerivce.findByNaAndAdmin(cq);//将查询到的数据装入list
		int i=chejianSerivce.findByNaAndAdmin(cq).size(); //总记录数   从数据库查询
		int w=(int)i;
		int j=3; //每页显示3�?
		int x=1; //总页�?   计算出来
		List li =new ArrayList();
		int y;
		for( y=1;y<=x;y++){
			li.add(y); //获得每一�?
		}		
		t.addAttribute("li",li);	
		t.addAttribute("x", x);
		List<Integer > tt=new ArrayList<Integer>();//序号
		for(int a=1;a<=i;a++) {
			tt.add(a);
		}
		 n=1;
		 Integer currentPage=n; //当前�?
		 t.addAttribute("currentPage", currentPage);
		t.addAttribute("ti", tt);
		t.addAttribute("us", us);
		
		return "chejianlist";
	
	}	
	
	
}
