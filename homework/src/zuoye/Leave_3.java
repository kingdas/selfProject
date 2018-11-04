package zuoye;

import java.util.Scanner;

//有n个人围成一圈，顺序排号。从第一个人开始报数（从1到3报数），凡报到3的人退出圈子，
//问最后留下的是原来第几号的那位。
public class Leave_3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("please input the number of n : ");
		int n = sc.nextInt();
		String str = "";
		for (int i = 1; i <= n; i++) {
			if (i % 3 == 0) {
				continue;
			} else {
				str = str + Integer.toString(i) + " ";
			}
		}
		System.out.println(str);
	}
}
