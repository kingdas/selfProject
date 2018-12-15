package com.yc.menuSys.utils;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

import org.springframework.stereotype.Component;

import com.yc.menuSys.model.Menu;

/**
 * 购物车
 * 
 * @author Administrator
 * 
 */
public class ShoppingCart {
	private Map<Integer, Menu> sc = new ConcurrentHashMap<Integer, Menu>();

	// 获取顾客所点菜的信息
	public Map<Integer, Menu> getOrderInfo() {
		return sc;
	}

	// 删除点菜
	public void del(Long menuId) {
		sc.remove(menuId);
	}

	// 修改点菜
	public void update(Menu m) {
		sc.put(m.getId(), m);
	}

	// 查询所有点的菜
	public List<Menu> getMenuList() {
		return new ArrayList<Menu>(sc.values());
	}

	// 增加点菜
	public void add(Menu m) {
		if (sc.containsKey(m.getId())) {
			Menu mt = sc.get(m.getId());
			mt.setNum(mt.getNum() + 1);
			sc.put(mt.getId(), mt);
		} else {
			m.setNum(1);
			sc.put(m.getId(), m);
		}
	}

	// 减少点菜
	public void sub(Menu m) {
		if (sc.containsKey(m.getId())) {
			Menu mt = sc.get(m.getId());
			if (mt.getNum() == 1) {
				sc.remove(m.getId());
			} else {
				mt.setNum(mt.getNum() - 1);
				sc.put(mt.getId(), mt);
			}
		}
	}

	// 通过菜的编号在购物车中查找菜
	public Menu findById(int id) {
		return sc.get(id);
	}

	// 控制台输出已点菜的信息
	public void printOrderInof() {
		System.out.println(getMenuList());
	}

	// 计算购物车中菜的总价格
	public double getTotalPrice() {
		double tp = 0;
		for (Menu m : sc.values()) {
			tp += m.getPrice() * m.getNum();
		}
		return tp;
	}

	// 计算购物车中菜的总数量

	public int getTotalNum() {
		int tp = 0;
		for (Menu m : sc.values()) {
			tp += m.getNum();
		}
		return tp;
	}

	public static void main(String[] args) {
		ShoppingCart sc = new ShoppingCart();
		sc.add(new Menu(1, "xx", null, 20, "", 0));
		sc.add(new Menu(1, "xx", null, 20, "", 0));
		sc.add(new Menu(2, "yy", null, 10, "", 0));
		// System.out.println(sc.findAll());
		// System.out.println(sc.findById(1));
		// sc.sub(new Menu(1, "xx", null, 20, "", 0));
		// sc.sub(new Menu(1, "xx", null, 20, "", 0));
		// System.out.println(sc.findAll());

		sc.printOrderInof();
		System.out.println(sc.getTotalPrice());
		System.out.println(sc.getTotalNum());
	}

}
