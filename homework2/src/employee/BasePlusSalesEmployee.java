package employee;

public class BasePlusSalesEmployee extends SalesEmployee {
	private double basesalary;
	private int birthday;

	public BasePlusSalesEmployee(double sales, double rate, double basesalary, int birthday, String name) {
		super.setSales(sales);
		super.setRate(rate);
		this.basesalary = basesalary;
		this.birthday = birthday;
		super.setName(name);
	}

	@Override
	public double getSalary(int month) {
		if (month == birthday) {
			return super.getRate() * super.getSales() + basesalary + 100;
		} else
			return super.getRate() * super.getSales() + basesalary;
	}
}
