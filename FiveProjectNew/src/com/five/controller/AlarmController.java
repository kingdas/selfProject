package com.five.controller;

import java.util.ArrayList;
import java.util.List;

import javax.el.ArrayELResolver;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.validation.constraints.Null;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.five.dao.AlarmDao;
import com.five.model.AlarmModel;
import com.five.model.AlarmQuary;
import com.five.service.AlarmService;

@Controller
@RequestMapping("userbj")
public class AlarmController {
	@Autowired
	private AlarmService alarmSerivce;

	@RequestMapping("add")
	public String add() {
		return "alarmAdd";
	}

	@RequestMapping(value = "add", method = RequestMethod.POST) // 增加车间信息
	public String add(AlarmModel am, HttpServletResponse res) {
		res.setCharacterEncoding("utf-8");
		res.setContentType("text/html;charset=utf-8");
		alarmSerivce.add(am);
		return "redirect:/userbj/alarm"; // 重定�?
	}

	@RequestMapping(value = "del") // 删除车间信息
	public String del(int[] reasonId) {
		System.out.println(reasonId.length);
		// String[] array = reasonId.split(",");
		for (int i = 0; i < reasonId.length; i++) {
			// int j = Integer.parseInt(array[i]);
			int j = reasonId[i];
			alarmSerivce.del(j);
		}
		return "redirect:/userbj/alarm";
	}

	@RequestMapping(value = "up/{reasonId}")
	public String up(@PathVariable Integer reasonId, Model t) {
		AlarmModel li = alarmSerivce.findById(reasonId);
		t.addAttribute("m", li);
		return "alarmUpdate";
	}

	@RequestMapping(value = "update", method = RequestMethod.POST) // 修改
	public String update(AlarmModel am) {
		alarmSerivce.update(am);
		return "redirect:/userbj/alarm";
	}

	@RequestMapping("alarm") // 从数据库获取车间列表并分页处�?
	public String List(Model t, Integer n) {
		double i = alarmSerivce.findReasonId().size(); // 总记录数 从数据库查询
		int j = 6; // 每页显示页数
		int x = (int) Math.ceil(i / j); // 总页�? 计算出来
		List li = new ArrayList();
		int y;
		for (y = 1; y <= x; y++) {
			li.add(y); // 获得每一�?
		}
		t.addAttribute("li", li);
		t.addAttribute("x", x);
		t.addAttribute("n", n);
		List<AlarmModel> lc = null;
		if (null == n || n == 0) {
			n = 1;
			lc = alarmSerivce.findAll(0, j); // 首页
		} else if (n <= x) {
			lc = alarmSerivce.findAll(j * n - j, j); // 任意�?��
		} else {
			n = x;
			lc = alarmSerivce.findAll(j * x - j, j); // �?���?��
		}

		List<Integer> tt = new ArrayList<Integer>();// 表前序号获取
		for (int a = 1; a <= j; a++) {
			tt.add(a + (j * n - j));
		}
		t.addAttribute("ti", tt);
		Integer currentPage = n; // 当前�?
		t.addAttribute("currentPage", currentPage);
		t.addAttribute("us", lc);
		return "alarmList";

	}

	@RequestMapping("select") // 根据条件查找信息
	public String select(String typeId, String description, Model t, HttpServletResponse res, Integer n) {
		AlarmQuary aq = new AlarmQuary();
		res.setCharacterEncoding("utf-8");
		res.setContentType("text/html;charset=utf-8");
		aq.setTypeId(typeId);
		;// 根据车间姓名和车间主管查�?
		aq.setDescription(description);
		;
		List<AlarmModel> us = alarmSerivce.findByReAndDe(aq);// 将查询到的数据装入list
		int i = alarmSerivce.findByReAndDe(aq).size(); // 总记录数 从数据库查询
		int w = (int) i;
		int j = 8; // 每页显示3�?
		int x = 1; // 总页�? 计算出来
		List li = new ArrayList();
		int y;
		for (y = 1; y <= x; y++) {
			li.add(y); // 获得每一�?
		}
		t.addAttribute("li", li);
		t.addAttribute("x", x);
		List<Integer> tt = new ArrayList<Integer>();// 序号
		for (int a = 1; a <= i; a++) {
			tt.add(a);
		}
		n = 1;
		Integer currentPage = n; // 当前�?
		t.addAttribute("currentPage", currentPage);
		t.addAttribute("ti", tt);
		t.addAttribute("us", us);
		return "alarmList";

	}

}
