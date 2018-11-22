package com.three.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.three.model.WorkshopManageModel;
import com.three.service.WorkshopManageService;

@Controller
@RequestMapping("workshop")
public class WorkshopManageController {
	@Autowired
	private WorkshopManageService wManagerService;

	@RequestMapping("list")
	public String list(Model m, HttpSession session) {
		session.invalidate();
		List<WorkshopManageModel> wms = wManagerService.findAll();

		m.addAttribute("wms", wms);
		return "workshopManageList";
	}

	@RequestMapping("add")
	public String add() {
		return "workshopManageAdd";
	}

	@RequestMapping(value = "doAdd", method = RequestMethod.POST)
	public String doAdd(WorkshopManageModel w, HttpServletResponse response) {
		wManagerService.add(w);
		try {
			response.setCharacterEncoding("utf-8");
			response.setContentType("text/html;charset=utf-8");
			response.getWriter()
					.print("<script>alert('添加成功');close();opener.location.href='/andon/workshop/list';</script>");
		} catch (IOException e) {
			e.printStackTrace();
		}
		return "redirect:/workshop/list";
	}

	@RequestMapping("update/{shopId}")
	public String update(@PathVariable int shopId, Model m) {
		WorkshopManageModel wModel = wManagerService.findById(shopId);
		m.addAttribute("wModel", wModel);
		return "workshopManageUpdate";
	}

	@RequestMapping(value = "doUpdate", method = RequestMethod.POST)
	public String doUpdate(WorkshopManageModel w) {
		wManagerService.update(w);
		return "redirect:/workshop/list";
	}

	@RequestMapping("del/{shopId}")
	public String del(@PathVariable int shopId) {
		wManagerService.del(shopId);
		return "redirect:/workshop/list";
	}

	@RequestMapping("findByCondition")
	public String findByCondition(WorkshopManageModel w, Model m, HttpSession session) {
		System.out.println(w);
		List<WorkshopManageModel> wms = wManagerService.findByCondition(w);

		m.addAttribute("wms", wms);
		session.setAttribute("wms", wms);

		return "workshopManageList";
	}

}
