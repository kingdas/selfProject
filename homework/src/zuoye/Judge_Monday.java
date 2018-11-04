package zuoye;

import java.util.Scanner;

//请输入星期几的第一个字母来判断一下是星期几，如果第一个字母一样，则继续   判断第二个字母。
public class Judge_Monday {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("please input the initial: ");
		String one = sc.next();
		if (one.charAt(0) == 102) {
			System.out.println("this is Friday");
		}
		if (one.charAt(0) == 109) {
			System.out.println("please input the second character");
			String two = sc.next();
			if (two.charAt(0) == 97) {
				System.out.println("this is March");
			} else {
				System.out.println("this is Monday");
			}
		}
		if (one.charAt(0) == 116) {
			System.out.println("please input the second character");
			String two = sc.next();
			if (two.charAt(0) == 117) {
				System.out.println("this is Tuesday");
			} else {
				System.out.println("this is Thursday");
			}
		}
		if (one.charAt(0) == 115) {
			System.out.println("please input the second character");
			String two = sc.next();
			if (two.charAt(0) == 117) {
				System.out.println("this is Sunday");
			} else {
				System.out.println("this is Saturday");
			}
		}
	}

}
