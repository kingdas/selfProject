package zuoye2;

import java.util.Scanner;

//（循环）**已知：faibonacci （费波那契）数列的前几个数分别为 0， 1， 1， 2， 3， 5， ……。
public class Faibonacci {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("input a number ");
		int n = s.nextInt();
		int a = 0;
		int b = 1;
		if (n >= 3) {
			System.out.print(a);
			System.out.print(" ");
			System.out.print(b + " ");
			for (int i = 0; i < n - 2; i++) {
				int tmp = a;
				a = b;
				b = b + tmp;
				System.out.print(b + " ");
			}
		} else if (n == 2) {
			System.out.println(a + " " + b);
		} else
			System.out.println(a);
	}

}
