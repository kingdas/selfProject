package zuoye;

import java.util.Scanner;

//输入一行字符，分别统计出其中英文字母、空格、数字和其它字符的个数。

public class Tongji {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("please input a string ");
		String goalstr = sc.nextLine();
		int digit = 0;
		int character = 0;
		int space = 0;
		int other = 0;
		for (int i = 0; i < goalstr.length(); i++) {
			if ((goalstr.charAt(i) >= 65 && goalstr.charAt(i) <= 90)
					|| (goalstr.charAt(i) >= 97 && goalstr.charAt(i) <= 122)) {
				character++;
			} else if (goalstr.charAt(i) >= 48 && goalstr.charAt(i) <= 57) {
				digit++;
			} else if (goalstr.charAt(i) == 32) {
				space++;
			} else
				other++;
		}
		System.out.println("字母有" + character + "个");
		System.out.println("数字有" + digit + "个");
		System.out.println("空格有" + space + "个");
		System.out.println("其他字符有" + other + "个");
	}

}
