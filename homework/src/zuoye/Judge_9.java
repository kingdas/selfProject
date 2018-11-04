package zuoye;

//输入一个数判断可以被几个9整除
import java.util.Scanner;

public class Judge_9 {
	public static void main(String[] args) {
		int count = 0;
		Scanner s = new Scanner(System.in);
		System.out.println("please input a integer");
		int z = s.nextInt();
		while (z % 9 == 0) {
			count++;
			z /= 9;
		}
		System.out.println(count);
	}
}
