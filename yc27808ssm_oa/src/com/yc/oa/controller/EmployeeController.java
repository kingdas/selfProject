package com.yc.oa.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.yc.oa.model.Employee;
import com.yc.oa.service.EmployeeService;

@Controller
@RequestMapping("emp")
public class EmployeeController {
	@Autowired
	private EmployeeService employeeService;

	@RequestMapping("login")
	public String login(String loginName, String password, HttpSession sess) {
		Employee et = new Employee(loginName, password);
		Employee e = employeeService.login(et);
		if (e != null) {
			sess.setAttribute("emp", e);
			return "index";
		}
		return "redirect:/login.jsp";
	}

}
