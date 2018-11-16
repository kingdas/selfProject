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

	//���D�������
	@RequestMapping("jumpAdd")
	public String jumpAdd(){
		return "groupAdd";
	}
	//��������
	@RequestMapping("outfile")
	public String outfile(Model mo){
		List<GroupModel> s=groupService.findAll();
		mo.addAttribute("s", s);
		return "excel";
	}
	//��ԃ���Д���
	@RequestMapping("findAll")
	public String findAll(Model m){
		List<GroupModel> s=groupService.findAll();
		m.addAttribute("s", s);
		return "groupFirst";
	}
	
	//ģ����ԃ
	@RequestMapping(value="findByConditons",method=RequestMethod.POST)
	public String findByConditons(GroupQueryModel gq,Model m){
		List<GroupModel> s=groupService.findByConditons(gq);
		m.addAttribute("s", s);
		
		return "groupFirst";
	}
	
	//����
	@RequestMapping(value="add",method=RequestMethod.POST)
	public String add(GroupModel g){
		groupService.add(g);
		
		return "redirect:/cont/findAll";
	}
	
	//�h��
	@RequestMapping("del/{groupId}")
	public String del(@PathVariable int groupId){
		groupService.del(groupId);
		return "redirect:/cont/findAll";
	}
	
	//���޸�ǰ�Ĳ�ԃ
	@RequestMapping("qUpd/{groupId}")
	public String qUpd(@PathVariable int groupId,Model m,GroupModel g){
		g=groupService.findById(groupId);
		m.addAttribute("g", g);
		return "groupUpdate";
	}
	
	//�������޸�
	@RequestMapping(value="upd",method=RequestMethod.POST)
	public String upd(GroupModel l){
		System.out.println(l);
		groupService.upd(l);
		return "redirect:/cont/findAll";
	}
	
}
