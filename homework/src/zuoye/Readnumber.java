package zuoye;

import java.util.Random;

//��ȡ7����1��50��������ֵ��ÿ��ȡһ��ֵ�������ӡ���ֵ�����*
public class Readnumber {
	public static void main(String[] args) {
		for (int i = 1; i < 7; i++) {
			Random r = new Random();
			int j = r.nextInt(50);
			for (int k = 0; k < j; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
