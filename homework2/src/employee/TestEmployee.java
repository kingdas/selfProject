package employee;

import java.util.Scanner;

public class TestEmployee {
	public static void main(String[] args) {
		Employee salaried = new SalariedEmployee(10000, 12, "jin");
		Employee hourly = new HourlyEmployee(170, 15, 5, "li");
		Employee sales = new SalesEmployee(10000, 0.6, 6, "wang");
		Employee base = new BasePlusSalesEmployee(10000, 0.54, 1200, 9, "cheng");
		Scanner s = new Scanner(System.in);
		System.out.println("input the month :");
		int month = s.nextInt();
		System.out.println("�̶�����Ա��jin��" + month + "�µĹ����ǣ�" + salaried.getSalary(month));
		System.out.println("Сʱ��Ա��li��" + month + "�µĹ����ǣ�" + hourly.getSalary(month));
		System.out.println("����Աwang��" + month + "�µĹ����ǣ�" + sales.getSalary(month));
		System.out.println("���������Աcheng��" + month + "�µĹ����ǣ�" + base.getSalary(month));
	}
}
