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
	// ��banciListҳ����ת��banciAddҳ�棬ȥ������
	public String add() {
		return "banciAdd";
	}

	@RequestMapping(value = "add", method = RequestMethod.POST)
	// ������ӵ�bancimodel������listȥ��ʾ
	public String add(BanciModel bm) {
	System.out.println("BBB"+bm);
		bs.add(bm);
//		System.out.println(bm);
		return "redirect:/bcl/list";
	}

	@RequestMapping(value = "lis", method = RequestMethod.GET)
	// ����banciList�е���޸�ɾ��ʱ��ת��lis����ת�� list������ɾ
	//totalPage����ҳ����currentPage����һҳ
	public String lis(Model m,Integer startPage) {
		if(null==startPage){//��ֱ����jsp����������ʽ�Ե�һҳ��������
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
		// �Ѿ�ʵ��,�޸��Ժ�ת��listȥ��ʾ 
		bs.update(bm);
		return "redirect:/bcl/list";
	}

	@RequestMapping("update/{shiftid}")
	public String update(@PathVariable int shiftid, Model m) {
		// �Ѿ�ʵ��,��banciUAndDlist����ָ���ѯ��Ϣ��ת��banciUpdate
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
	// �Ѿ�ʵ��,��banciUAndDlist����ָ�del��ת��list
	//��������
	public String del(@PathVariable String sids,HttpServletRequest request) {
		String[] list=sids.split(",");
		for(int i=0;i<list.length;i++){
			int shiftid=Integer.valueOf(list[i]);
			bs.del(shiftid);
		}
		return "redirect:/bcl/list";
	}

	@RequestMapping(value = "list", method = RequestMethod.GET)
	// ��findall�õ������ݴ���banciList����ʾ
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
	// ͨ��������ѯ������ʾ��ҳ���·���list��
	public String FindByCondition(Model m, BanciModel bm) {
		m.addAttribute("us", bs.FindByCondition(bm));
		return "banciList";
	}
}
