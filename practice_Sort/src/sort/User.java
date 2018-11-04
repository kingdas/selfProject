package sort;

public class User {// implements Comparable {
	private String name;
	private int age;

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

	public User(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	public User() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "User [name=" + name + ", age=" + age + "]";
	}

//	@Override
//	public int compareTo(Object o) {
////		User u = (User) o;
////		return this.age - u.age;
//
////		User u = (User) o;
////		return this.name.compareTo(u.name);
//
//		User u = (User) o;
//		return this.name.compareTo(u.name) == 0 ? this.age - u.age : this.name.compareTo(u.name);
//	}   

}
