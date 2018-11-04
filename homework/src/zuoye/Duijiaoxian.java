package zuoye;

//import java.util.Scanner;

//求一个3*3矩阵对角线元素之和
public class Duijiaoxian {
	public static void main(String[] args) {

		int total;
		int arr[][] = new int[3][3];
		arr[0] = new int[] { 1, 1, 1 };
		arr[1] = new int[] { 2, 2, 2 };
		arr[2] = new int[] { 4, 7, 3 };
		total = ArrTotal(arr);
		System.out.println(total);
	}

	static int ArrTotal(int a[][]) {
		int sum = 0;
		for (int i = 0; i < a.length; i++) {
			if (i != 1) {
				sum += a[i][i] + a[i][a.length - 1 - i];
			} else
				sum += a[i][i];
		}
		return sum;
	}

}
