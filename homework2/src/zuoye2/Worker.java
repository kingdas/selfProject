package zuoye2;

public class Worker {
	private String name;
	private int age;
	private double salary;
	private Address addr = null;

	public Worker() {

	}

	public Worker(String name, int age, double salary) {
		this.name = name;
		this.age = age;
		this.salary = salary;
	}

	void work() {

	}

	void work(int hours) {

	}

	public static void main(String[] args) {
		Worker w = new Worker("zhangsan", 25, 2500);
		w.addr = new Address("北京市海淀区清华园1号", "100084");
		System.out.println(w);
	}

	@Override
	public String toString() {
		return name + "  " + Integer.toString(age) + "  " + Double.toString(salary) + "  " + addr.address + "  "
				+ addr.zipcode;
	}
}

class Address {
	String address;
	String zipcode;

	public Address() {

	}

	public Address(String address, String zipcode) {
		this.address = address;
		this.zipcode = zipcode;
	}
}
/*
 * （面向对象基础）写一个 Worker 类，并创建多个 Worker 对象。 1) 为 Worker 类添加三个属性，1）String 类型的
 * name，表示工人的姓名；2）int 类型 的 age，表示工人的年龄；3）double 类型的 salary，表示工人的工资。 2) 为 Worker
 * 类添加两个构造方法，1）公开无参构造方法；2）接受三个参数的构造方 法，三个参数分别为字符串、int 和 double 类型。 3) 为 Worker
 * 类添加两个 work 方法，一个无参，另一个带整数参数，表示工人工作的 时间（为多少小时） 。 类图如下： Worker name : String
 * age : int salary : double Worker() Worker(name : String, age : int, salary :
 * double) work() work(hours : int) 12. （面向对象基础）创建一个 Address 类，描述如下： 1）
 * 该类有两个属性，1）String 类型的 address，表示地址；2）String 类型的 zipCode， 表示邮编。 2）
 * 该类有两个构造方法，一为无参构造方法，一为带三个参数的方法。 类图如下： Address address : String zipCode :
 * String Address() Address(address : String, zipCode : String) 13. *（面向对象基础）为第
 * 1 题中的 Worker 类添加一个属性 addr，该属性为 Address 类型。 创建一个 Worker 对象，其姓名为"zhangsan"，年龄为
 * 25，工资为 2500，家庭住址为“北京市海淀区清华园 1 号” ，邮政编码为 100084。
 */
