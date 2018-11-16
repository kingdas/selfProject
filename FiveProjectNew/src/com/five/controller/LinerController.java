package com.five.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.five.dao.LinerDao;
import com.five.model.SysWorkLiner;
import com.five.service.LinerService;

@Controller
@RequestMapping("liner")
public class LinerController {

	@Autowired
	LinerService linerService;

//增加信息
	@RequestMapping("add")
	public String add() {
		return "linerAdd";
	}

	@RequestMapping(value = "doAdd", method = RequestMethod.POST)
	public String doAdd(SysWorkLiner swl) {
		linerService.add(swl);
		return "redirect:/liner/findAll";
	}

//删除信息
	@RequestMapping("delete/{delSwls}")
	public String delete(@PathVariable String delSwls) {
		String[] lis = delSwls.split(",");
		for (int i = 0; i < lis.length; i++) {
			int linerId = Integer.valueOf(lis[i]);
			linerService.delete(linerId);
		}
		return "redirect:/liner/findAll";
	}

//修改信息
	@RequestMapping("update/{linerId}")
	public String update(@PathVariable int linerId, Model m) {
		SysWorkLiner swl = linerService.findById(linerId);
		m.addAttribute("swls", swl);
		return "linerUpdate";
	}

	@RequestMapping(value = "doUpdate", method = RequestMethod.POST)
	public String doUpdate(SysWorkLiner swl) {
		linerService.update(swl);
		return "redirect:/liner/findAll";
	}

//查询功能
	@RequestMapping("findByCondition")
	public String findByCondition(SysWorkLiner swl, Model m) {
		List<SysWorkLiner> li = linerService.findByCondition(swl);
		m.addAttribute("swls", li);
		return "linerList";
	}

//查询所有
	@RequestMapping("findAll")
	public String findAll(Model m, Integer currentPage) {
		if (currentPage == null) {
			currentPage = 1;
		}
		int rowsCount = linerService.findRowsCount();
		int yenum=6;
		int totalPage = (int) Math.ceil(rowsCount /(double)yenum);
		List<SysWorkLiner> swls = linerService.findAll((currentPage - 1) * yenum, yenum);
		m.addAttribute("totalPage", totalPage);
		m.addAttribute("currentPage", currentPage);
		m.addAttribute("swls", swls);
		return "linerList";
	}
}
