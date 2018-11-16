package com.five.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.five.model.BanciModel;
import com.five.service.BanciService;



@Controller
@RequestMapping("bcl")
public class BanciController {
	@Autowired
	private BanciService bs;

	@RequestMapping("add")
	// 从banciList页面跳转到banciAdd页面，去填数据
	public String add() {
		return "banciAdd";
	}

	@RequestMapping(value = "add", method = RequestMethod.POST)
	// 接收添加的bancimodel，传给list去显示
	public String add(BanciModel bm) {
	System.out.println("BBB"+bm);
		bs.add(bm);
//		System.out.println(bm);
		return "redirect:/bcl/list";
	}

	@RequestMapping(value = "lis", method = RequestMethod.GET)
	// 当在banciList中点击修改删除时，转到lis，跳转新 list进行修删
	//totalPage是总页数，currentPage是下一页
	public String lis(Model m,Integer startPage) {
		if(null==startPage){//可直接在jsp中用三相表达式对第一页进行限制
			startPage=0;
		}
		int currentPage=startPage+1;
		int num=bs.FindAllNum();
		int totalPage=num/5;
		m.addAttribute("totalPage", totalPage);
		m.addAttribute("currentPage", currentPage);
		m.addAttribute("us", bs.FindAll(startPage*5,5));
//		System.out.println(num);
//		System.out.println(totalPage);
		return "banciUAndDlist";
	}

	@RequestMapping(value = "doupdate", method = RequestMethod.POST)
	public String doupdate(BanciModel bm) {
		// 已经实现,修改以后转到list去显示 
		bs.update(bm);
		return "redirect:/bcl/list";
	}

	@RequestMapping("update/{shiftid}")
	public String update(@PathVariable int shiftid, Model m) {
		// 已经实现,从banciUAndDlist接收指令，查询信息后转到banciUpdate
//		System.out.println(shiftid);
//		BanciModel bm = new BanciModel();
//		bm.setShiftid(shiftid);
//		System.out.println(bm);
//		m.addAttribute("u", bs.FindByCondition(bm));
//		System.out.println('u');
		m.addAttribute("u", bs.FindById(shiftid));
		return "banciUpdate";
	}

	@RequestMapping("del/{sids}")
	// 已经实现,从banciUAndDlist接收指令，del后转到list
	//批量操作
	public String del(@PathVariable String sids,HttpServletRequest request) {
		String[] list=sids.split(",");
		for(int i=0;i<list.length;i++){
			int shiftid=Integer.valueOf(list[i]);
			bs.del(shiftid);
		}
		return "redirect:/bcl/list";
	}

	@RequestMapping(value = "list", method = RequestMethod.GET)
	// 将findall得到的数据传给banciList并显示
	public String list(Model m,Integer startPage) {
		if(null==startPage){
			startPage=0;
		}
		int currentPage=startPage+1;
		int num=bs.FindAllNum();
		int totalPage=num/5;
		m.addAttribute("totalPage", totalPage);
		m.addAttribute("currentPage", currentPage);
		List<BanciModel> us=bs.FindAll(startPage*5,5);
		m.addAttribute("us", us);
		return "banciList";
	}

	@RequestMapping("findbycondition")
	// 通过条件查询，并显示在页面下方的list中
	public String FindByCondition(Model m, BanciModel bm) {
		m.addAttribute("us", bs.FindByCondition(bm));
		return "banciList";
	}
}
