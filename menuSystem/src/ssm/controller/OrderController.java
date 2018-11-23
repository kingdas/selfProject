package ssm.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import ssm.dao.ColdDao;
import ssm.dao.HotDao;
import ssm.dao.OrderDao;
import ssm.model.ColdModel;
import ssm.model.HotModel;
import ssm.model.OrderModel;

@Controller
@RequestMapping("order")
public class OrderController {

	@Autowired
	OrderDao orderDao;
	@Autowired
	HotDao hotDao;
	@Autowired
	ColdDao coldDao;

	@RequestMapping("menu")
	public String menu() {
		return "menu";
	}

	@RequestMapping("hot")
	public String hotMenu(Model m) {
		List<HotModel> hs = hotDao.findAll();
		m.addAttribute("hs", hs);
		return "hotMenu";
	}

	@RequestMapping("cold")
	public String coldMenu(Model m) {
		List<ColdModel> cs = coldDao.findAll();
		m.addAttribute("cs", cs);
		return "coldMenu";
	}

	@RequestMapping("orderList")
	public String orderlist(Model m, HttpServletRequest req) {
		for (int i = 0; i < 3; i++) {
			Object o = req.getSession().getAttribute("hot" + i);
			if (o != null) {
				OrderModel om = (OrderModel) o;
				orderDao.add(om);
			}
		}
		for (int i = 0; i < 2; i++) {
			Object o2 = req.getSession().getAttribute("cold" + i);
			if (o2 != null) {
				OrderModel om2 = (OrderModel) o2;
				orderDao.add(om2);
			}
		}
		List<OrderModel> os = orderDao.findAll();
		m.addAttribute("os", os);
		return "orderList";
	}
}
