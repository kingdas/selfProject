package work_compare;

public class Work_compare implements Comparable<Work_compare> {
	String name;
	int age;
	double salary;

	public Work_compare() {

	}

	public Work_compare(String name, int age, double salary) {
		this.name = name;
		this.age = age;
		this.salary = salary;
	}

	@Override
	public int compareTo(Work_compare o) {
		if (this.age > o.age) {
			return 1;
		} else if (this.age == o.age) {
			if (this.salary > o.salary) {
				return 1;
			} else if (this.salary == o.salary) {
				return this.name.compareTo(o.name);
			} else
				return -1;
		} else
			return -1;

	}

	@Override
	public String toString() {
		return "Work_compare [name=" + name + ", age=" + age + ", salary=" + salary + "]";
	}

}
