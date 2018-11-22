package com.three.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.three.model.VocationModel;
import com.three.service.VocationService;

@Controller
@RequestMapping("vocation")
public class VocationController {
	@Autowired
	private VocationService vocationService;

	@RequestMapping(value = "findByShopOrName", method = RequestMethod.POST)
	public String findByShopOrName(VocationModel u, Model m) {
		List<VocationModel> us = vocationService.findByCondition(u);
		m.addAttribute("us", us);
		return "vocationlist";
	}

	@RequestMapping(value = "doUpdate", method = RequestMethod.POST)
	public String doUpdate(VocationModel u) {

		vocationService.update(u);
		return "redirect:/vocation/list";
	}

	@RequestMapping("update/{holidayId}")
	public String updata(@PathVariable int holidayId, Model m) {
		VocationModel u = vocationService.findById(holidayId);
		m.addAttribute("u", u);
		return "vocationUpdate";
	}

	@RequestMapping("del/{holidayId}")
	public String del(@PathVariable int holidayId) {
		vocationService.del(holidayId);
		return "redirect:/vocation/list";
	}

	@RequestMapping(value = "add", method = RequestMethod.GET)
	public String add() {
		return "vocationAdd";
	}

	@RequestMapping(value = "doAdd", method = RequestMethod.POST)
	public String doAdd(VocationModel u) {
		vocationService.add(u);
		return "redirect:/vocation/list";
	}

	@RequestMapping("list")
	public String list(Model m) {
		List<VocationModel> us = vocationService.findAll();
		m.addAttribute("us", us);
		return "vocationlist";
	}
}
