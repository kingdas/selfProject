package com.three.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.three.model.WorkLinerModel;
import com.three.service.WorkLinerService;

@Controller
@RequestMapping("liner")
public class WorkLinerController {
	@Autowired
	private WorkLinerService wService;

	@RequestMapping("list")
	public String list(Model m) {
		List<WorkLinerModel> sys = wService.findAll();
		m.addAttribute("wList", sys);
		return "workLinerList";
	}

	@RequestMapping(value = "findByCondition", method = RequestMethod.POST)
	public String findByCondition(WorkLinerModel sys, Model m) {
		List<WorkLinerModel> wList = wService.findByCondition(sys);
		m.addAttribute("wList", wList);
		return "redirect:/liner/list";
	}

	@RequestMapping("delete/{linerId}")
	public String del(@PathVariable int linerId) {
		wService.del(linerId);
		return "redirect:/liner/list";
	}

	@RequestMapping(value = "doAdd", method = RequestMethod.POST)
	public String add(WorkLinerModel wModel, int shopId) {
		wService.add(wModel);
		return "redirect:/liner/list";
	}

	@RequestMapping("update/{linerId}")
	public String upd(@PathVariable int linerId, Model m) {
		WorkLinerModel wModel = wService.findById(linerId);
		m.addAttribute("wModel", wModel);
		return "workLinerUpdate";
	}

	@RequestMapping(value = "doUpdate", method = RequestMethod.POST)
	public String doUpdate(WorkLinerModel wModel) {
		wService.upd(wModel);
		return "redirect:/liner/list";
	}

}
