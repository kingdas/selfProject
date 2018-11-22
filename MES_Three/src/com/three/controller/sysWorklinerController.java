package com.three.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.three.model.sysWorkLinerModel;
import com.three.service.sysWorklinerService;

@Controller
@RequestMapping("all")
public class sysWorklinerController {
	@Autowired
	private sysWorklinerService sysWorklinerServic;

	@RequestMapping("list")
	public String list(sysWorkLinerModel sysw, Model m) {
		List<sysWorkLinerModel> sys = sysWorklinerServic.findAll();
		m.addAttribute("sys", sys);
		return "sysWorkLinerline";
	}

	@RequestMapping("del/{linerId}")
	public String del(@PathVariable int linerId) {
		sysWorklinerServic.del(linerId);
		return "redirect:/all/list";
	}

	@RequestMapping(value = "add", method = RequestMethod.GET)
	public String add() {
		return "sysWorkLineradd";
	}

	@RequestMapping(value = "doadd", method = RequestMethod.POST)
	public String add(String linerName, String linerAdmin, int shopId) {
		sysWorkLinerModel sys = new sysWorkLinerModel();
		sys.setLinerName(linerName);
		sys.setLinerAdmin(linerAdmin);
		sys.setShopId(shopId);
		sysWorklinerServic.add(sys);
		return "redirect:/all/list";
	}

	@RequestMapping("upd")
	public String upd(sysWorkLinerModel sys) {
		sysWorklinerServic.upd(sys);
		return "redirect:/all/list";
	}

	@RequestMapping(value = "findByCondition", method = RequestMethod.POST)
	public String findByCondition(sysWorkLinerModel sys, Model m) {
		List<sysWorkLinerModel> sy = sysWorklinerServic.findByCondition(sys);
		return "sysWorkLinerline";
	}

	@RequestMapping("qqq")
	public String show() {
		return "showResult";
	}
}
