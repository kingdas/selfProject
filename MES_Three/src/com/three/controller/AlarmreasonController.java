package com.three.controller;

import java.util.List;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.three.dao.AlarmreasonDao;
import com.three.model.AlarmreasonModel;

@Controller
@RequestMapping("alarmreason")
public class AlarmreasonController {

	@Autowired
	private AlarmreasonDao alarmreasonDao;

	@RequestMapping("list")
	public String list(Model m) {
		List<AlarmreasonModel> al = alarmreasonDao.findAll();
		m.addAttribute("al", al);
		return "alarmreasonList";
	}

	@RequestMapping(value = "add", method = RequestMethod.GET)
	public String add() {
		return "alarmreasonAdd";
	}

	@RequestMapping(value = "add", method = RequestMethod.POST)
	public String add(AlarmreasonModel a, HttpServletResponse response) {
		alarmreasonDao.add(a);
		response.setCharacterEncoding("utf-8");
		response.setContentType("text/html;charset=utf-8");
		return "redirect:/alarmreason/list";
	}

	@RequestMapping("del/{reasonId}")
	public String del(@PathVariable int reasonId, Model m) {
		alarmreasonDao.del(reasonId);
		return "redirect:/alarmreason/list";
	}

	@RequestMapping(value = "doUpdate", method = RequestMethod.POST)
	public String doUpdate(AlarmreasonModel a) {
		alarmreasonDao.update(a);
		return "redirect:/alarmreason/list";
	}

	@RequestMapping("update/{reasonId}")
	public String update(@PathVariable int reasonId, Model m) {
		AlarmreasonModel a = alarmreasonDao.findById(reasonId);
		m.addAttribute("a", a);
		return "alarmreasonUpdate";
	}

	@RequestMapping(value = "findcondition", method = RequestMethod.POST)
	public String findcondition(AlarmreasonModel am, Model m) {
		List<AlarmreasonModel> a = alarmreasonDao.findByCondition(am);
		m.addAttribute("al", a);
		return "alarmreasonList";
	}
}
