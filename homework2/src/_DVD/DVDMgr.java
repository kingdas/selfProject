package _DVD;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
import java.util.TreeMap;

public class DVDMgr {
	static SimpleDateFormat simple = new SimpleDateFormat("yyyy-MM-dd");
	static List<DVDList> list = new ArrayList<DVDList>();
	static Scanner sc = new Scanner(System.in);

	// 初始化
	public static void initial() throws ParseException {
//		simple.setLenient(false);
		DVDList luo = new DVDList("罗马假日", 0, simple.parse("2010-07-01"));
		DVDList feng = new DVDList("风声鹤唳", 1, null);
		DVDList lang = new DVDList("浪漫满屋", 1, null);
		list.add(luo);
		list.add(feng);
		list.add(lang);
	}

//增加
	public static void add() {

		System.out.println("---> 新增DVD");
		System.out.println();
		System.out.print("请输入DVD的名称： ");
		String name = sc.next();
		DVDList ao = new DVDList(name, 1, null);
		list.add(ao);
		System.out.println("新增《" + name + "》成功!");
		System.out.println("***********************");
	}

//查看
	public static void search() {
		System.out.println("---> 查看DVD ");
		System.out.println();
		System.out.println("序号\t状态\t名称\t借出日期");
		for (int i = 0; i < list.size(); i++) {
			System.out.print(i + 1 + "\t");
			System.out.print(list.get(i).getState() + "\t");
			System.out.print(list.get(i).getName() + "\t");
			System.out.print(simple.format(list.get(i).getDate()) + "\n");
		}
		System.out.println("***********************");
	}

//删除
	public static void delete() {
		System.out.println("---> 删除DVD ");
		System.out.println();
		System.out.print("请输入DVD的名称：");
		String s = sc.next();
		int i;
		for (i = 0; i < list.size(); i++) {
			if (s.equals(list.get(i).getName())) {
				if (list.get(i).getState() == 1) {
					list.remove(list.get(i));
				} else
					System.out.println("该DVD为借出状态，不可删除");
			}
		}
		System.out.println("***********************");
	}

//借出
	public static void lend() {
		System.out.println("---> 借出DVD ");
		System.out.println();
		System.out.println("请输入DVD的名称：");
		String s = sc.next();
		int i;
		for (i = 0; i < list.size(); i++) {
			if (s.equals(list.get(i).getName())) {
				if (list.get(i).getState() == 1) {
					list.get(i).setState(0);
				} else
					System.out.println("该DVD已借出");
			}
		}
		System.out.println("请输入借出日期（年-月-日）：");
		String lenddate = sc.next();
		simple.setLenient(false);
		try {
			list.get(i).setDate(simple.parse(lenddate));
		} catch (ParseException e) {
			e.printStackTrace();
		}
		System.out.println("借出《" + list.get(i).getName() + "》成功！");
		list.get(i).setCount(list.get(i).getCount() + 1);
	}

//归还
	public static void back() {
		System.out.println("---> 归还DVD");
		System.out.println();
		System.out.println("请输入DVD的名称：");
		String s = sc.next();
		int i;
		simple.setLenient(false);
		for (i = 0; i < list.size(); i++) {
			if (s.equals(list.get(i).getName())) {
				if (list.get(i).getState() == 0) {
					list.get(i).setState(1);
				} else
					System.out.println("该DVD未借出");
			}
		}
		System.out.println("请输入归还日期（年-月-日）：");
		String backdate = sc.next();
		System.out.println();
		System.out.println("归还《" + list.get(i).getName() + "》成功！");
		System.out.println("借出日期为：" + simple.format(list.get(i).getDate()));
		try {
			System.out.println("归还日期为：" + simple.format(simple.parse(backdate)));
		} catch (ParseException e1) {
			e1.printStackTrace();
		}
		long days = 0;
		try {
			days = (simple.parse(backdate).getTime() - list.get(i).getDate().getTime()) / (1000 * 60 * 60 * 24);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		System.out.println("应付租金为（元）:   " + days);
	}

//排行榜
	public static void rank() {
		TreeMap<Integer, String> tree = new TreeMap<Integer, String>();
		for (int i = 0; i < list.size(); i++) {
			tree.put(list.get(i).getCount(), list.get(i).getName());
		}
		tree.descendingMap();
		Iterator<Integer> c = tree.keySet().iterator();
		Iterator<String> n = tree.values().iterator();
		System.out.println("次数\t名称");
		while (c.hasNext()) {
			int count = c.next();
			while (n.hasNext()) {
				String name = n.next();
				System.out.println(count + "\t" + "《" + name + "》");
			}

		}
	}
}
