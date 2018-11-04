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
		w.addr = new Address("�����к������廪԰1��", "100084");
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
 * ��������������дһ�� Worker �࣬��������� Worker ���� 1) Ϊ Worker ������������ԣ�1��String ���͵�
 * name����ʾ���˵�������2��int ���� �� age����ʾ���˵����䣻3��double ���͵� salary����ʾ���˵Ĺ��ʡ� 2) Ϊ Worker
 * ������������췽����1�������޲ι��췽����2���������������Ĺ��췽 �������������ֱ�Ϊ�ַ�����int �� double ���͡� 3) Ϊ Worker
 * ��������� work ������һ���޲Σ���һ����������������ʾ���˹����� ʱ�䣨Ϊ����Сʱ�� �� ��ͼ���£� Worker name : String
 * age : int salary : double Worker() Worker(name : String, age : int, salary :
 * double) work() work(hours : int) 12. ������������������һ�� Address �࣬�������£� 1��
 * �������������ԣ�1��String ���͵� address����ʾ��ַ��2��String ���͵� zipCode�� ��ʾ�ʱࡣ 2��
 * �������������췽����һΪ�޲ι��췽����һΪ�����������ķ����� ��ͼ���£� Address address : String zipCode :
 * String Address() Address(address : String, zipCode : String) 13. *��������������Ϊ��
 * 1 ���е� Worker �����һ������ addr��������Ϊ Address ���͡� ����һ�� Worker ����������Ϊ"zhangsan"������Ϊ
 * 25������Ϊ 2500����ͥסַΪ�������к������廪԰ 1 �š� ����������Ϊ 100084��
 */
