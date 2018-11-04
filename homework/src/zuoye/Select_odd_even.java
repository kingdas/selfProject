package zuoye;

//编写一个函数，输入n为偶数时，调用函数求1/2+1/4+...+1/n,当输入n为奇数时，调用函数1/1+1/3+...+1/n(利用指针函数) 
public class Select_odd_even {
	public static void main(String[] args) {
		double sum;
		int n = 4;
		if (n % 2 == 0) {
			sum = EvenTotal(n);
		} else {
			sum = OddTotal(n);
		}
		System.out.println(sum);
	}

	static double OddTotal(int n) {
		double sum = 0;
		for (int i = 1; i <= n;) {
			sum += 1.0 / i;
			i += 2;
		}
		return sum;
	}

	static double EvenTotal(int n) {
		double sum = 0;
		for (int i = 2; i <= n;) {
			sum += 1.0 / i;
			i += 2;
		}
		return sum;
	}
}
