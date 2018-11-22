package com.three.controller;

import java.util.List;

import javax.servlet.http.HttpServlet;
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
@RequestMapping("positionManage")
public class PositionManageController extends HttpServlet {
	@Autowired
	PositionService positionService;

	@RequestMapping("list")
	public String list(Model m) {
		List<PositionManage> li = positionService.findAll();
		m.addAttribute("li", li);
		return "PositionManageList";

	}

	@RequestMapping("find")
	public String find(int placeId, Model m) {
		PositionManage ps = positionService.findById(placeId);
		m.addAttribute("ps", ps);
		return "ps";

	}

	@RequestMapping("del/{placeId}")
	public String del(@PathVariable int placeId, Model m) {

		// int id = Integer.parseInt(placeId);
		positionService.del(placeId);
		System.out.println("aaaaaaaaaaaaa");
		return "redirect:/positionManage/list";

	}

	@RequestMapping(value = "add", method = RequestMethod.GET)
	public String add() {
		return "PositionManageadd";
	}

	@RequestMapping("doadd")
	public String add(PositionManage pm, HttpServletResponse resp) {
		positionService.add(pm);
		resp.setCharacterEncoding("utf-8");
		resp.setContentType("text/html;charset=utf-8");
		return "redirect:/positionManage/list";

	}

	@RequestMapping("findcondition")
	public String findcondition(PositionManage pm, Model m) {
//		PositionManage pm = new PositionManage();
//		pm.setShopId(shopId);
//		pm.setLinerId(linerId);
//		pm.setPlaceName(placeName);
//		pm.setPlaceAdmin(placeAdmin);
		System.out.println(pm);
		List<PositionManage> position = positionService.findByCondition(pm);
		System.out.println(position);
		m.addAttribute("li", position);

		System.out.println("##");
		return "PositionManageList";
	}

	@RequestMapping(value = "doupdate", method = RequestMethod.POST)
	public String doupdate(PositionManage pm) {
		positionService.update(pm);
		System.out.println("****");
		return "redirect:/positionManage/list";
	}

	@RequestMapping("update/{placeId}")
	public String doupdate(@PathVariable int placeId, Model m) {
		PositionManage ps = positionService.findById(placeId);
		m.addAttribute("l", ps);
		System.out.println("l");
		return "PositionManageUpDate";
	}

}
