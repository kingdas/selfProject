package zuoyeObject;

//（封装）已知一个类 Student 代码如下：
//class Student{
//String name;
//int age;
//String address;
//String zipCode;
//String mobile;
//}
//a) 把 Student 的属性都作为私有，并提供 get/set 方法以及适当的构造方法。
//b) 为 Student 类添加一个 getPostAddress 方法，要求返回 Student 对象的地址和邮编。

public class Student {
	private String name;
	private int age;
	private String adddress;
	private String zipCode;
	private String mobile;

	public Student(String name, int age, String adddress, String zipCode,
			String mobile) {
		this.name = name;
		this.age = age;
		this.adddress = adddress;
		this.zipCode = zipCode;
		this.mobile = mobile;
	}

	public Student() {

	}

	public static void main(String[] args) {
		String add_zip = new Student().getPostAddress(new Student("jin", 22,
				"henan", "465350", "123456"));
		System.out.println(add_zip);

	}

	public String getPostAddress(Student s) {
		return s.adddress + " " + s.zipCode;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getAdddress() {
		return adddress;
	}

	public void setAdddress(String adddress) {
		this.adddress = adddress;
	}
	public String getZipCode() {
		return zipCode;
	}

	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

}
