package zuoye2;

import java.util.Scanner;

//求两点之间距离
public class Twopointdistance {
	public static void main(String[] args) {
		System.out.println("input the first point :");
		Scanner s = new Scanner(System.in);
		int x1 = s.nextInt();
		int y1 = s.nextInt();
		System.out.println("input the second point :");
		int x2 = s.nextInt();
		int y2 = s.nextInt();
		double dis = 0;
		dis = Math.sqrt(Math.pow(Math.abs(x1 - x2), 2)
				+ Math.pow(Math.abs(y1 - y2), 2));
		System.out.println(dis);
	}
}
