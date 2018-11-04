package zuoye;

//�����Լ�����С������
public class Yueshu_beishu {
	public static void main(String[] args) {
		int num1 = 24, num2 = 18;
		int yue, bei, a = num2, b = num1 % num2;
		do {
			int tmp = a;
			a = b;
			b = tmp % b;

		} while (b != 0);
		yue = a;
		System.out.println(yue);
		bei = num1 * num2 / yue;
		System.out.println(bei);
	}

}
