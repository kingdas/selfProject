package com.three.controller;

import java.util.List;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.three.model.PositionManage;
import com.three.service.PositionService;

@Controller
@RequestMapping("position")
public class PositionManageController {
	@Autowired
	private PositionService positionService;

	@RequestMapping("list")
	public String list(Model m) {
		List<PositionManage> li = positionService.findAll();
		m.addAttribute("li", li);
		return "positionList";
	}

	@RequestMapping("del/{placeId}")
	public String del(@PathVariable int placeId, Model m) {
		positionService.del(placeId);
		return "redirect:/position/list";

	}

	@RequestMapping(value = "doAdd", method = RequestMethod.POST)
	public String add(PositionManage pm, HttpServletResponse resp) {
		positionService.add(pm);
		resp.setCharacterEncoding("utf-8");
		resp.setContentType("text/html;charset=utf-8");
		return "redirect:/position/list";

	}

	@RequestMapping("findByCondition")
	public String findcondition(PositionManage pm, Model m) {
		List<PositionManage> position = positionService.findByCondition(pm);
		System.out.println(position);
		m.addAttribute("li", position);
		return "positionList";
	}

	@RequestMapping(value = "doUpdate", method = RequestMethod.POST)
	public String doupdate(PositionManage pm) {
		positionService.update(pm);
		return "redirect:/position/list";
	}

	@RequestMapping("update/{placeId}")
	public String doupdate(@PathVariable int placeId, Model m) {
		PositionManage ps = positionService.findById(placeId);
		m.addAttribute("l", ps);
		return "positionUpdate";
	}

}
