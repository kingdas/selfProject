package zuoye2;

import java.util.Scanner;

//5. *写一个函数，接受一个整数，输出这个整数是几位数 
public class Judgebitnumber {
	public static void main(String[] args) {
		Scanner n = new Scanner(System.in);
		System.out.println(" input ");
		int m = n.nextInt();
		String str = Integer.toString(m);
		System.out.println(str.length());
	}
}
