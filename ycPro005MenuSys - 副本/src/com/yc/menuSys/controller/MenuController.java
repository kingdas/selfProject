package com.yc.menuSys.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.yc.menuSys.service.MenuService;
import com.yc.menuSys.utils.ShoppingCart;

@Controller
@RequestMapping("/menuSys/menu")
public class MenuController {

	@Autowired
	private MenuService menuService;

	@RequestMapping("/list")
	public String findAll(Model m, HttpSession s) {

		if (s.getAttribute("sc") == null) {
			s.setAttribute("sc", new ShoppingCart());// sessionScope中加入sc属性
		}
		// sc.add(menuService.findById(1));
		// sc.add(menuService.findById(2));
		//

		m.addAttribute("ms", menuService.findAll());// requsetScope中加入ms属性
		return "menu/list";
	}

}
