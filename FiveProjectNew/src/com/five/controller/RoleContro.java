package com.five.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.five.dao.RoleDao;
import com.five.model.RoleModel;

@Controller
@RequestMapping("test")
public class RoleContro {

	@Autowired
	RoleDao d;

	@RequestMapping("add")
	public String add() {
		return "Roleadd";
	}

	@RequestMapping("update/{id}")
	public String update(@PathVariable String id,
			org.springframework.ui.Model mod, HttpSession ses) {
		int ids = Integer.parseInt(id);
		RoleModel mo = d.findbyid(ids);
		mod.addAttribute("mo", mo);
		ses.setAttribute("ids", ids);
		return "Roleupdate";
	}

	@RequestMapping("findall")
	public String findall(org.springframework.ui.Model m, Integer n) {
		double i = d.findid().size();// 数据长度
		int j = 5;// 每页显示行数
		int z = (int) Math.ceil(i / j);// 总页数
		List<Integer> li = new ArrayList<Integer>();
		for (int y = 1; y <= z; y++) {
			li.add(y);
		}
		m.addAttribute("li", li);
		m.addAttribute("z", z);// 返回页数
		List<RoleModel> l = null;
		m.addAttribute("n", n);
		if (null == n || n == 0) {
			n = 1;
			l = d.findall(0, j);
		} else if (n <= z) {
			l = d.findall(j * n - j, j);
		} else {
			n = z;
			l = d.findall(j * z - j, j);
		}

		Integer currentPage = n + 1;
		m.addAttribute("currentPage", currentPage);
		m.addAttribute("l", l);
		int h = 0;
		List<Integer> lk = new ArrayList<Integer>();
		for (int k = 1; k <= j; k++) {
			lk.add(k + (j * n - j));
		}
		m.addAttribute("lk", lk);
		m.addAttribute("h", h);
		return "RoleList";
	}

	@RequestMapping(value = "doadd", method = RequestMethod.POST)
	public String doadd(String name, String miaosu, HttpServletResponse response) {
		response.setCharacterEncoding("utf-8");
		response.setContentType("text/html;charset=utf-8");
		RoleModel m = new RoleModel(name, miaosu);
		d.add(m);
		return "redirect:/test/findall";
	}

	@RequestMapping(value = "doupdate", method = RequestMethod.POST)
	public String doupdate(String name, String miaosu, HttpSession ses) {
		RoleModel m = new RoleModel((Integer) ses.getAttribute("ids"), name,
				miaosu);
		d.update(m);
		return "redirect:/test/findall";
	}

	@RequestMapping("del/{id}")
	public String del(@PathVariable String id) {
		String[] array = id.split(",");
		for (int i = 0; i < array.length; i++) {
			int j = Integer.parseInt(array[i]);
			d.del(j);
		}
		return "redirect:/test/findall";
	}

	//xiugai
	@RequestMapping("findByCondition")
	public String findByCondition(String name, String miaosu,
			org.springframework.ui.Model m, HttpServletResponse response,
			HttpSession ses, Integer w) {
		response.setCharacterEncoding("utf-8");
		response.setContentType("text/html;charset=utf-8");
		//System.out.println(miaosu);
		if ("".equals(name) && "".equals(miaosu)) {
			return "redirect:/test/findall";
		} else {
			List<RoleModel> le = d.findByCondition(new RoleModel(name, miaosu));
			double e = (int) le.size();
			int i = (int) e;
			ses.setAttribute("le", le);
			int j = 5;// 每页显示行数
			int z = (int) Math.ceil(e / j);// 总页数
System.out.println(z);
			List<Integer> li = new ArrayList<Integer>();
			for (int y = 1; y <= z; y++) {
				li.add(y);
			}
			m.addAttribute("li", li);
			m.addAttribute("z", z);// 返回页数
			List<RoleModel> l = null;
			m.addAttribute("w", w);
			if (null == w || w == 0) {
				w = 1;
				if (i < j) {
					l = le.subList(0, i);
				} else {
					l = le.subList(0, j);
				}

			} else if (w <z) {
				l = le.subList(j * w - j,w*j);
			} else if(w==z){
				l = le.subList(j * z - j, i);
			}else if(w>z){
				w=z;
				l = le.subList(j * z - j, i);
			}

			Integer currentPage = w + 1;
			m.addAttribute("currentPage", currentPage);
			m.addAttribute("l", l);
			int h = 0;
			List<Integer> lk = new ArrayList<Integer>();
			for (int k = 1; k <= j; k++) {
				lk.add(k + (j * w - j));
			}
			m.addAttribute("lk", lk);
			m.addAttribute("h", h);
			m.addAttribute("name", name);
			m.addAttribute("miaosu", miaosu);
			System.out.println(lk);
			System.out.println(l);
			return "Rolechaxun";
		}
	}

}
