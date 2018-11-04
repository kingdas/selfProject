package employee;

public class Employee {
	private String name;
	private int month;
	
	public Employee() {
		
	}
///////////////////////////////
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getMonth() {
		return month;
	}

	public void setMonth(int month) {
		this.month = month;
	}

	/////////////////////
	public double getSalary(int month) {
		return 1;
	}
}
