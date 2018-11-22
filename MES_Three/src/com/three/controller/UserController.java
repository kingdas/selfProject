package com.three.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.three.dao.UserDao;
import com.three.model.UserModle;

@Controller
@RequestMapping("user")
public class UserController {
	@Autowired
	UserDao udao;

	@RequestMapping("login")
	public String login(String userCode, String passWord, HttpServletRequest request) {
		UserModle userModle = new UserModle();
		userModle.setUserCode(userCode);
		userModle.setUserPassword(passWord);
		UserModle us = udao.findLogin(userModle);
		if (us != null) {
			request.getSession().setAttribute("us", us);
			return "index";
		} else {
			return "redirect:/login.jsp";

		}
	}

	@RequestMapping("findbyCondition")
	public String findbyCondition(Model m, UserModle u) {

		List<UserModle> ls = udao.findbyCondition(u);
		m.addAttribute("ls", ls);

		return "usermanage";
	}

	@RequestMapping("findAll")
	public String findAll(Model m) {
		List<UserModle> ls = udao.findAll();
		m.addAttribute("ls", ls);

		return "usermanage";
	}

	@RequestMapping("add")
	public String add(UserModle u) {
		udao.add(u);
		return "redirect:/user/findAll";

	}

	@RequestMapping("del/{userId}")
	public String del(@PathVariable int userId) {
		udao.delete(userId);
		return "redirect:/user/findAll";

	}

	@RequestMapping("update/{userId}")
	public String update(@PathVariable int userId, Model m) {
		UserModle u = udao.findId(userId);
		m.addAttribute("u", u);
		return "update";

	}

	@RequestMapping("doupdate")
	public String update(UserModle u) {
		udao.update(u);
		return "redirect:/user/findAll";

	}

}
