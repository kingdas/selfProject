package employee;

public class HourlyEmployee extends Employee {
	private int hours;
	private double salaryPerHour;
	private int birthday;

	public HourlyEmployee(int hours, double salaryPerHour, int birthday ,String name) {
		this.hours = hours;
		this.salaryPerHour = salaryPerHour;
		this.birthday = birthday;
		super.setName(name);
	}

	public double getSalary(int month) {
		if (birthday == month) {
			return 100 + salary();
		} else
			return salary();
	}

	public double salary() {
		if (hours > 160) {
			return 160 * salaryPerHour + (hours - 160) * 1.5 * salaryPerHour;
		} else
			return hours * salaryPerHour;
	}
}
