package employee;

public class SalesEmployee extends Employee {
	private double sales;
	private double rate;
	private int birthday;

	public SalesEmployee() {
		
	}

	public SalesEmployee(double sales, double rate, int birthday, String name) {
		this.sales = sales;
		this.rate = rate;
		this.birthday = birthday;
		super.setName(name);
	}

	@Override
	public double getSalary(int month) {
		if (birthday == month) {
			return sales * rate + 100;
		} else
			return sales * rate;
	}

	public double getSales() {
		return sales;
	}

	public void setSales(double sales) {
		this.sales = sales;
	}

	public double getRate() {
		return rate;
	}

	public void setRate(double rate) {
		this.rate = rate;
	}
	
}
