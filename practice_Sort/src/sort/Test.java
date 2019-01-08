package sort;

import java.util.Arrays;
import java.util.Comparator;

public class Test {
	public static void main(String[] args) {
		User[] arru = { new User("jins", 22), new User("wang", 21), new User("li", 23) };
		for (User u : arru) {
			System.out.println(u);
		}
		System.out.println("....................");
//		Arrays.sort(arru);

		Arrays.sort(arru, new Comparator<User>() {// Arrays.sort方法如果加上比较器之后，那么User就不需要实现Comparable接口了
			@Override
			public int compare(User o1, User o2) {
//				return o1.getAge() - o2.getAge();
//				return o1.getName().compareTo(o2.getName());
				return o1.getName().compareTo(o2.getName()) == 0 ? o1.getAge() - o2.getAge()
						: o1.getName().compareTo(o2.getName());
			}
		});

		for (User u : arru) {
			System.out.println(u);
		}
	}
}
