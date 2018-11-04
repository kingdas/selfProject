package employee;

public class SalariedEmployee extends Employee {
	private double monthsalary;
	private int birthday;

	public SalariedEmployee(double monthsalary, int birthday, String name) {
		this.monthsalary = monthsalary;
		this.birthday = birthday;
		super.setName(name);
	}

	public double getSalary(int month) {
		if (birthday == month) {
			return monthsalary + 100;
		} else
			return monthsalary;

	}
}
