package com.yc.menuSys.controller;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.yc.menuSys.model.Menu;
import com.yc.menuSys.service.MenuService;
import com.yc.menuSys.utils.ShoppingCart;

@Controller
@RequestMapping("/test")
public class TestController {


	@RequestMapping("/list")
	public String findAll(Model m) {
		List<Menu> ms=new ArrayList<Menu>();
		ms.add(new Menu(1, "xx",null, 11, null, 0));
		ms.add(new Menu(2, "dd",null, 11, null, 0));
		ms.add(new Menu(3, "cc",null, 11, null, 0));
		ms.add(new Menu(4, "ee",null, 11, null, 0));
		ms.add(new Menu(5, "vv",null, 11, null, 0));
		ms.add(new Menu(6, "aa",null, 11, null, 0));
		ms.add(new Menu(1, "xx",null, 11, null, 0));
		ms.add(new Menu(2, "dd",null, 11, null, 0));
		ms.add(new Menu(3, "cc",null, 11, null, 0));
		ms.add(new Menu(4, "ee",null, 11, null, 0));
		ms.add(new Menu(5, "vv",null, 11, null, 0));
		ms.add(new Menu(6, "aa",null, 11, null, 0));
		m.addAttribute("ms", ms);
 
		return "list";
	}

}
