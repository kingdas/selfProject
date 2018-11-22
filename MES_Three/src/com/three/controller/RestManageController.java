package com.three.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.three.model.SysWorkRest;
import com.three.service.RestManageService;

@Controller
@RequestMapping("rest")
public class RestManageController {
	@Autowired
	RestManageService rmService;

	@RequestMapping("list")
	public String list(HttpServletRequest req) {
		List<SysWorkRest> rs = rmService.findAll();
		req.setAttribute("rs", rs);
		return "restList";
	}

	@RequestMapping("add")
	public String add() {
		return "restAdd";
	}

	@RequestMapping("doAdd")
	public String doAdd(SysWorkRest swr, HttpServletRequest req) {
		rmService.add(swr);
		return "redirect:/rest/list";
	}

	@RequestMapping("detail/{restId}")
	public String detail(@PathVariable int restId, HttpServletRequest req) {
		SysWorkRest swr = rmService.findById(restId);
		req.setAttribute("swr", swr);
		return "restUpdate";
	}

	@RequestMapping(value = "doUpdate", method = RequestMethod.POST)
	public String doUpdate(SysWorkRest swr) {
		rmService.update(swr);
		return "redirect:/rest/list";
	}

	@RequestMapping("del/{restId}")
	public String del(@PathVariable int restId) {
		rmService.del(restId);
		return "redirect:/rest/list";
	}

	@RequestMapping("search")
	public String search(SysWorkRest swr, HttpServletRequest req) {
		System.out.println(swr);
		List<SysWorkRest> rs = rmService.findByCondition(swr);
		req.setAttribute("rs", rs);
		return "restList";
	}
}
