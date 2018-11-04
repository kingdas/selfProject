package zuoye;

//把a,b,c三个数按大小顺序输出
public class Sortabc {
	public static void main(String[] args) {
		int a = 8, b = 5, c = 9;
		if (a > b) {
			if (a > c) {
				System.out.println(a);
				if (b > c) {
					System.out.println(b);
					System.out.println(c);
				} else {
					System.out.println(c);
					System.out.println(b);
				}
			} else {
				System.out.println(c);
				System.out.println(a);
				System.out.println(b);
			}
		} else {
			if (b > c) {
				System.out.println(b);
				if (a > c) {
					System.out.println(a);
					System.out.println(c);
				} else {
					System.out.println(c);
					System.out.println(a);
				}
			} else {
				System.out.println(c);
				System.out.println(b);
				System.out.println(a);
			}
		}
	}

}
