package zuoye;

import java.util.Scanner;

//有n位整数，使其前面各数顺序向后移m个位置，最后m个数变成最前面的m个数
public class Move_m_number {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("please input a number");
		int n = sc.nextInt();
		System.out.println("please input the number of bit");
		int m = sc.nextInt();
		String str = Integer.toString(n);
		StringBuffer str2 = new StringBuffer(str);
		String str3 = str2.substring(str2.length() - m);
		str2 = str2.delete(str2.length() - m, str2.length());
		str3 = str3 + str2;
		System.out.println(str3);
	}
}