package com.five.jin.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.five.jin.model.SysWorkLiner;
import com.five.jin.service.LinerService;

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
	@RequestMapping("delete/{linerId}")
	public String delete(@PathVariable int linerId) {
		linerService.delete(linerId);
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
	public String findByCondition(SysWorkLiner swl, Model m, HttpSession sion) {
		List<SysWorkLiner> swls = linerService.findByCondition(swl);
		m.addAttribute("swls", swls);
		sion.setAttribute("sionSwls", swls);
		return "linerList";
	}

	@RequestMapping("findAll")
	public String findAll(Model m, HttpSession sion) {
		sion.invalidate();
		List<SysWorkLiner> swls = linerService.findAll();
		m.addAttribute("swls", swls);
		return "linerList";
	}
}
