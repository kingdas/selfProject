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

	// ��ʼ��
	public static void initial() throws ParseException {
//		simple.setLenient(false);
		DVDList luo = new DVDList("�������", 0, simple.parse("2010-07-01"));
		DVDList feng = new DVDList("�������", 1, null);
		DVDList lang = new DVDList("��������", 1, null);
		list.add(luo);
		list.add(feng);
		list.add(lang);
	}

//����
	public static void add() {

		System.out.println("---> ����DVD");
		System.out.println();
		System.out.print("������DVD�����ƣ� ");
		String name = sc.next();
		DVDList ao = new DVDList(name, 1, null);
		list.add(ao);
		System.out.println("������" + name + "���ɹ�!");
		System.out.println("***********************");
	}

//�鿴
	public static void search() {
		System.out.println("---> �鿴DVD ");
		System.out.println();
		System.out.println("���\t״̬\t����\t�������");
		for (int i = 0; i < list.size(); i++) {
			System.out.print(i + 1 + "\t");
			System.out.print(list.get(i).getState() + "\t");
			System.out.print(list.get(i).getName() + "\t");
			System.out.print(simple.format(list.get(i).getDate()) + "\n");
		}
		System.out.println("***********************");
	}

//ɾ��
	public static void delete() {
		System.out.println("---> ɾ��DVD ");
		System.out.println();
		System.out.print("������DVD�����ƣ�");
		String s = sc.next();
		int i;
		for (i = 0; i < list.size(); i++) {
			if (s.equals(list.get(i).getName())) {
				if (list.get(i).getState() == 1) {
					list.remove(list.get(i));
				} else
					System.out.println("��DVDΪ���״̬������ɾ��");
			}
		}
		System.out.println("***********************");
	}

//���
	public static void lend() {
		System.out.println("---> ���DVD ");
		System.out.println();
		System.out.println("������DVD�����ƣ�");
		String s = sc.next();
		int i;
		for (i = 0; i < list.size(); i++) {
			if (s.equals(list.get(i).getName())) {
				if (list.get(i).getState() == 1) {
					list.get(i).setState(0);
				} else
					System.out.println("��DVD�ѽ��");
			}
		}
		System.out.println("�����������ڣ���-��-�գ���");
		String lenddate = sc.next();
		simple.setLenient(false);
		try {
			list.get(i).setDate(simple.parse(lenddate));
		} catch (ParseException e) {
			e.printStackTrace();
		}
		System.out.println("�����" + list.get(i).getName() + "���ɹ���");
		list.get(i).setCount(list.get(i).getCount() + 1);
	}

//�黹
	public static void back() {
		System.out.println("---> �黹DVD");
		System.out.println();
		System.out.println("������DVD�����ƣ�");
		String s = sc.next();
		int i;
		simple.setLenient(false);
		for (i = 0; i < list.size(); i++) {
			if (s.equals(list.get(i).getName())) {
				if (list.get(i).getState() == 0) {
					list.get(i).setState(1);
				} else
					System.out.println("��DVDδ���");
			}
		}
		System.out.println("������黹���ڣ���-��-�գ���");
		String backdate = sc.next();
		System.out.println();
		System.out.println("�黹��" + list.get(i).getName() + "���ɹ���");
		System.out.println("�������Ϊ��" + simple.format(list.get(i).getDate()));
		try {
			System.out.println("�黹����Ϊ��" + simple.format(simple.parse(backdate)));
		} catch (ParseException e1) {
			e1.printStackTrace();
		}
		long days = 0;
		try {
			days = (simple.parse(backdate).getTime() - list.get(i).getDate().getTime()) / (1000 * 60 * 60 * 24);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		System.out.println("Ӧ�����Ϊ��Ԫ��:   " + days);
	}

//���а�
	public static void rank() {
		TreeMap<Integer, String> tree = new TreeMap<Integer, String>();
		for (int i = 0; i < list.size(); i++) {
			tree.put(list.get(i).getCount(), list.get(i).getName());
		}
		tree.descendingMap();
		Iterator<Integer> c = tree.keySet().iterator();
		Iterator<String> n = tree.values().iterator();
		System.out.println("����\t����");
		while (c.hasNext()) {
			int count = c.next();
			while (n.hasNext()) {
				String name = n.next();
				System.out.println(count + "\t" + "��" + name + "��");
			}

		}
	}
}
