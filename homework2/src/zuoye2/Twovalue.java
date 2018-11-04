package zuoye2;

import java.util.Scanner;

//判断并输出一元二次方程的两个根
public class Twovalue {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("input a , b , c");
		int a = s.nextInt();
		int b = s.nextInt();
		int c = s.nextInt();
		double value1, value2;
		double p = Math.pow(b, 2) - 4 * a * c;
		if (p > 0) {
			value1 = (b + Math.sqrt(b * b - 4 * a * c)) / (-2.0 * a);
			value2 = (b - Math.sqrt(b * b - 4 * a * c)) / (-2.0 * a);
			System.out.println(a + "x+" + b + "y+" + c + " have two value :"
					+ value1 + "  " + value2);

		} else if (p == 0) {
			value1 = (b + Math.sqrt(b * b - 4 * a * c)) / (-2.0 * a);
			System.out.println(a + "x+" + b + "y+" + c + " have one value :"
					+ value1);
		} else
			System.out.println(a + "x+" + b + "y+" + c + " have no value !");
	}
}
