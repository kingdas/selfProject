package ssmwork.ssm_controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import ssmwork.ssm_dao.GroupDao;
import ssmwork.ssm_dao.Userdao;
import ssmwork.ssm_model.Group;
import ssmwork.ssm_model.User;

@Controller
@RequestMapping("user")
public class UserController {

	@Autowired
	Userdao userDao;
	@Autowired
	GroupDao groupDao;

	@RequestMapping("add")
	public String add(Model m) {
		List<Group> gs = groupDao.findAll();
		m.addAttribute("gs", gs);
		return "userAdd";
	}

	@RequestMapping(value = "doAdd", method = RequestMethod.POST)
	public String doAdd(User u) {
		userDao.add(u);
		return "redirect:/user/list";
	}

	@RequestMapping("delete")
	public String delete(int id) {
		userDao.delete(id);
		return "redirect:/user/list";
	}

	@RequestMapping("update")
	public String update(int id, Model m) {
		User u = userDao.findById(id);
		m.addAttribute("u", u);
		List<Group> gs = groupDao.findAll();
		m.addAttribute("gs", gs);
		return "userUpdate";
	}

	@RequestMapping(value = "doUpdate", method = RequestMethod.POST)
	public String doUpdate(User u) {
		userDao.update(u);
		return "redirect:/user/list";
	}

	@RequestMapping("list")
	public String list(Model m) {
		List<User> us = userDao.findAll();
		m.addAttribute("us", us);
		return "userList";
	}
}
