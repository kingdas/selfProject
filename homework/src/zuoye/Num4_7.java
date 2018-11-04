package zuoye;

import java.util.Scanner;

//取一个整数a从右端开始的4～7位。 
public class Num4_7 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("please input a up 7 bit number");
		int n = sc.nextInt();
		String num = Integer.toString(n);
		String kidnum = num.substring(num.length()-7, num.length()-3);
		System.out.println(kidnum);
	}
}
