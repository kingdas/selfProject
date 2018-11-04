package zuoye;

import java.util.Scanner;

//给一个不多于5位的正整数，要求：一、求它是几位数，二、逆序打印出各位数字。
public class FiveBitNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("please input a number");
		int n = sc.nextInt();
		String num = Integer.toString(n);
		System.out.println("this is a " + num.length() + " bit number");
		System.out.print("reverse sort is: ");
		for (int i = num.length() - 1; i > -1; i--) {
			System.out.print(num.charAt(i));
		}
	}

}
