package ssm.controller;

import java.io.IOException;

import java.util.List;
import javax.servlet.http.HttpServletResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import ssm.service.UserService;
import ssm.user.User;
import ssm.user.UserQuery;

@Controller
@RequestMapping("user")
public class UserController {
	@Autowired
	UserService userService;

	@RequestMapping("statusName")
	public String statusName(String name, int status, Model m) {
		UserQuery uq = new UserQuery();
		uq.setName(name);
		uq.setStatus(status);
		List<User> us = userService.findStatusName(uq);
		m.addAttribute("us", us);
		return "userList";
	}

	@RequestMapping("findName")
	public String findName(String name, HttpServletResponse resp) {
		String t = "";
		if (userService.findName(name)) {
			t = "1";
		} else {
			t = "0";
		}
		try {
			resp.getWriter().print(t);
		} catch (IOException e) {
			e.printStackTrace();
		}
		return null;
	}

	@RequestMapping(value = "add", method = RequestMethod.GET)
	public String add() {
		return "userAdd";
	}

	@RequestMapping(value = "add", method = RequestMethod.POST)
	public String add(User u, HttpServletResponse resp) {
		userService.add(u);
		try {
			resp.setCharacterEncoding("utf-8");
			resp.setContentType("text/html;charset=utf-8");
			resp.getWriter().print("<script>alert('恭喜你，添加用户成功');close();opener.location.href='/user/list';</script>");
		} catch (IOException e) {
			e.printStackTrace();
		}
		return null;
	}

	@RequestMapping("delete")
	public String delete(int operator_id) {
		userService.delete(operator_id);
		return "redirect:/user/list";
	}

	@RequestMapping("update")
	public String update(int operator_id, Model m) {
		User u = userService.findById(operator_id);
		m.addAttribute("u", u);
		return "userUpdate";
	}

	@RequestMapping(value = "doUpdate", method = RequestMethod.POST)
	public String doUpdate(User u) {
		userService.update(u);
		return "redirect:/user/list";
	}

	@RequestMapping("list")
	public String list(Model m) {
		List<User> us = userService.findAll();
		m.addAttribute("us", us);
		return "userList";
	}
}