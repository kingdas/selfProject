package com.five.controller;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


import com.five.model.SysItemModel;
import com.five.model.SysItemQueryModel;

import com.five.service.SysItemService;

@Controller
@RequestMapping("cont2")
public class Control2 {
	@Autowired
	private SysItemService sysItemService;

	//��ת������ҳ
	@RequestMapping("jumpAdd")
	public String jumpAdd(){
		return "sysItemAdd";
	}
	
	//��ԃ��������
	@RequestMapping("findAll")
	public String findAll(Model m){
		List<SysItemModel> l=sysItemService.findAll();
		m.addAttribute("l", l);
		return "sysItemFirst";
	}
	
	//ģ����ԃ
	@RequestMapping(value="findByConditons",method=RequestMethod.POST)
	public String findByConditons(SysItemQueryModel sq,Model m){
		List<SysItemModel> l=sysItemService.findByConditons(sq);
		m.addAttribute("l", l);
		
		return "sysItemFirst";
	}
	
	//����
	@RequestMapping(value="add",method=RequestMethod.POST)
	public String add(SysItemModel s){
		sysItemService.add(s);
		
		return "redirect:/cont2/findAll";
	}
	
	//�h��
	@RequestMapping("del/{ids}")
	public String del(@PathVariable String ids){
		String [] y=ids.split(",");
		for(int i=0;i<y.length;i++){
			int itemId=Integer.parseInt(y[i]);
			sysItemService.del(itemId);
		}
		
		return "redirect:/cont2/findAll";
	}
	
	//���޸�ǰ�Ĳ�ԃ
	@RequestMapping("qUpd/{itemId}")
	public String qUpd(@PathVariable int itemId,Model m,SysItemModel s){
		s=sysItemService.findById(itemId);
		System.out.println(s);
		m.addAttribute("s", s);
		return "sysItemUpdate";
	}
	
	//�������޸�
	@RequestMapping(value="upd",method=RequestMethod.POST)
	public String upd(SysItemModel g){
		System.out.println(g);
		sysItemService.upd(g);
		return "redirect:/cont2/findAll";
	}
	
}
