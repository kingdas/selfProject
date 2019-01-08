package com.yc.menuSys.utils;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

import org.springframework.stereotype.Component;

import com.yc.menuSys.model.Menu;

/**
 * ���ﳵ
 * 
 * @author Administrator
 * 
 */
public class ShoppingCart {
	private Map<Integer, Menu> sc = new ConcurrentHashMap<Integer, Menu>();

	// ��ȡ�˿�����˵���Ϣ
	public Map<Integer, Menu> getOrderInfo() {
		return sc;
	}

	// ɾ�����
	public void del(Long menuId) {
		sc.remove(menuId);
	}

	// �޸ĵ��
	public void update(Menu m) {
		sc.put(m.getId(), m);
	}

	// ��ѯ���е�Ĳ�
	public List<Menu> getMenuList() {
		return new ArrayList<Menu>(sc.values());
	}

	// ���ӵ��
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

	// ���ٵ��
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

	// ͨ���˵ı���ڹ��ﳵ�в��Ҳ�
	public Menu findById(int id) {
		return sc.get(id);
	}

	// ����̨����ѵ�˵���Ϣ
	public void printOrderInof() {
		System.out.println(getMenuList());
	}

	// ���㹺�ﳵ�в˵��ܼ۸�
	public double getTotalPrice() {
		double tp = 0;
		for (Menu m : sc.values()) {
			tp += m.getPrice() * m.getNum();
		}
		return tp;
	}

	// ���㹺�ﳵ�в˵�������

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
