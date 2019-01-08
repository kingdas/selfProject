package com.yc.menuSys.controller;

import java.util.Date;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.yc.menuSys.model.Menu;
import com.yc.menuSys.model.Order;
import com.yc.menuSys.model.OrderItem;
import com.yc.menuSys.service.MenuService;
import com.yc.menuSys.service.OrderItemService;
import com.yc.menuSys.service.OrderService;
import com.yc.menuSys.utils.ShoppingCart;

@Controller
@RequestMapping("/menuSys/order")
public class OrderController {

	@Autowired
	private OrderService orderService;
	@Autowired
	private MenuService menuService;
	@Autowired
	private OrderItemService orderItemService;

	@RequestMapping("/addPersonCount/{pc}")
	@ResponseBody
	public String addPersonCount(@PathVariable int pc, HttpSession s) {
		System.out.println(pc);
		s.setAttribute("personCount", pc);
		return "{\"success\":true}";
	}

	@RequestMapping("/addTableNum/{tn}")
	public String addTableNum(@PathVariable String tn, HttpSession s) {
		s.setAttribute("tableNum", tn);
		return "redirect:/index.jsp";
	}

	@RequestMapping("/addMenu/{mid}")
	@ResponseBody
	public ShoppingCart addMenu(@PathVariable int mid, HttpSession s) {
		Menu m = menuService.findById(mid);
		ShoppingCart sc = (ShoppingCart) s.getAttribute("sc");
		sc.add(m);
		s.setAttribute("sc", sc);
		// sc.getTotalNum();// 所点菜总份数
		// sc.getTotalPrice();// 所点菜总价
		return sc;
	}

	@RequestMapping("/subMenu/{mid}")
	@ResponseBody
	public ShoppingCart subMenu(@PathVariable int mid, HttpSession s) {
		Menu m = menuService.findById(mid);
		ShoppingCart sc = (ShoppingCart) s.getAttribute("sc");
		sc.sub(m);
		s.setAttribute("sc", sc);
		// sc.getTotalNum();// 所点菜总份数
		// sc.getTotalPrice();// 所点菜总价
		return sc;
	}

	@RequestMapping("/shoppingCart")
	public String shoppingCart() {
		return "menu/shoppingCart";
	}

	@RequestMapping("/addOrder")
	public String addOrder(HttpSession s) {

		ShoppingCart sc = (ShoppingCart) s.getAttribute("sc");
		Integer pc = (Integer) s.getAttribute("personCount");
		String tn = (String) s.getAttribute("tableNum");

		Order o = new Order();
		o.setCreateTime(new Date());
		o.setPayment(false);
		o.setPersonCount(pc==null?1:pc);
		o.setTableNum(tn == null ? "1" : tn);
		o.setTotalPrice(sc.getTotalPrice());
		orderService.add(o);
		OrderItem oi;
		for (Menu m : sc.getMenuList()) {
			oi = new OrderItem();
			oi.setMenuId(m.getId());
			oi.setNum(m.getNum());
			oi.setOrderId(o.getId());
			orderItemService.add(oi);
		}
		return "menu/list";
	}

}
