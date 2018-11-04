package zuoye;

//����һ���ַ������ַ���ֵĴ���
import java.util.Scanner;

public class Kidstring {
	public static void main(String[] args) {
		int count = 0;
		Scanner a = new Scanner(System.in);
		System.out.println("please input a string");
		String str = a.nextLine();
		System.out.println("please input a kidstring");
		String kidstr = a.nextLine();
		for (int i = 1; i < str.length(); i++) {
			if (str.indexOf(kidstr) == i) {
				str = str.substring(i + 1);
				count++;
			}
		}
		System.out.println("���ַ���ֵĴ���Ϊ" + count);
	}
}
