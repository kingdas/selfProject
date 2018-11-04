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
		System.out.println("固定工资员工jin在" + month + "月的工资是：" + salaried.getSalary(month));
		System.out.println("小时工员工li在" + month + "月的工资是：" + hourly.getSalary(month));
		System.out.println("销售员wang在" + month + "月的工资是：" + sales.getSalary(month));
		System.out.println("有提成销售员cheng在" + month + "月的工资是：" + base.getSalary(month));
	}
}
