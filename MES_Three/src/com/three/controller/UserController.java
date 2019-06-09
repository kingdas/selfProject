package com.three.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.three.model.UserModel;
import com.three.service.UserManageService;

@Controller
@RequestMapping("user")
public class UserController {

	@Autowired
	private UserManageService userManageServcie;

//	@RequestMapping("login")
//	public String login(String userCode, String passWord, HttpServletRequest request) {
//		UserModel userModel = new UserModel();
//		UserModel.setUserCode(userCode);
//		UserModel.setUserPassword(passWord);
//		UserModel us = userManageServcie.findLogin(userModel);
//		if (us != null) {
//			request.getSession().setAttribute("us", us);
//			return "index";
//		} else {
//			return "redirect:/login.jsp";
//
//		}
//	}

	@RequestMapping("list")
	public String findAll(Model m) {
		List<UserModel> ls = userManageServcie.findAll();
		m.addAttribute("ls", ls);
		return "userList";
	}

	@RequestMapping("findByCondition")
	public String findbyCondition(Model m, UserModel u) {
		List<UserModel> ls = userManageServcie.findByCondition(u);
		m.addAttribute("ls", ls);
		return "userList";
	}

	@RequestMapping("add")
	public String add(UserModel u) {
		userManageServcie.add(u);
		return "redirect:/user/list";
	}

	@RequestMapping("delete/{userId}")
	public String del(@PathVariable int userId) {
		userManageServcie.delete(userId);
		return "redirect:/user/list";
	}

	@RequestMapping("update/{userId}")
	public String update(@PathVariable int userId, Model m) {
		UserModel u = userManageServcie.findById(userId);
		m.addAttribute("u", u);
		return "userUpdate";
	}

	@RequestMapping("doUpdate")
	public String update(UserModel u) {
		userManageServcie.update(u);
		return "redirect:/user/list";
	}

}
