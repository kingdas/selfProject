package zuoye;

import java.util.Scanner;

//一个偶数总能表示为两个素数之和。  
//由于用除sqrt(n)的方法求出的素数不包括2和3， 
//因此在判断是否是素数程序中人为添加了一个3。
public class Prime_addthree {
	public static void main(String[] args) {
		System.out.println("please input the even number : ");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for (int i = 2; i <= n / 2; i++) {
			if (isprime(i) && isprime(n - i)) {
				System.out.println(n + "可有这两个素数组成 ：" + i + " " + (n - i));
			}
		}
	}

	static boolean isprime(int n) {
		if (n == 3) {
			return true;
		}
		for (int i = 2; i < n; i++) {
			if (n % i == 0) {
				return false;
			}
		}
		return true;
	}
}
