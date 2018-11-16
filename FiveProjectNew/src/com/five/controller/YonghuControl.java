package com.five.controller;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.five.model.GroupModel;
import com.five.model.GroupQueryModel;
import com.five.service.GroupService;

@Controller
@RequestMapping("cont")
public class YonghuControl {
	@Autowired
	private GroupService groupService;

	//跳轉到增加頁
	@RequestMapping("jumpAdd")
	public String jumpAdd(){
		return "groupAdd";
	}
	//导出数据
	@RequestMapping("outfile")
	public String outfile(Model mo){
		List<GroupModel> s=groupService.findAll();
		mo.addAttribute("s", s);
		return "excel";
	}
	//查詢所有數據
	@RequestMapping("findAll")
	public String findAll(Model m){
		List<GroupModel> s=groupService.findAll();
		m.addAttribute("s", s);
		return "groupFirst";
	}
	
	//模糊查詢
	@RequestMapping(value="findByConditons",method=RequestMethod.POST)
	public String findByConditons(GroupQueryModel gq,Model m){
		List<GroupModel> s=groupService.findByConditons(gq);
		m.addAttribute("s", s);
		
		return "groupFirst";
	}
	
	//增加
	@RequestMapping(value="add",method=RequestMethod.POST)
	public String add(GroupModel g){
		groupService.add(g);
		
		return "redirect:/cont/findAll";
	}
	
	//刪除
	@RequestMapping("del/{groupId}")
	public String del(@PathVariable int groupId){
		groupService.del(groupId);
		return "redirect:/cont/findAll";
	}
	
	//做修改前的查詢
	@RequestMapping("qUpd/{groupId}")
	public String qUpd(@PathVariable int groupId,Model m,GroupModel g){
		g=groupService.findById(groupId);
		m.addAttribute("g", g);
		return "groupUpdate";
	}
	
	//真正的修改
	@RequestMapping(value="upd",method=RequestMethod.POST)
	public String upd(GroupModel l){
		System.out.println(l);
		groupService.upd(l);
		return "redirect:/cont/findAll";
	}
	
}
