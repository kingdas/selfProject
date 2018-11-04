package zuoye;

//һ�������100����ȫƽ�������168Ҳ����ȫƽ������������Ƕ���
public class Num100_168 {
	public static void main(String[] args) {
		int i;
		for (i = -100; i < 10000; i++) {
			if (isPingfang(i + 100) && isPingfang(i + 268)) {
				System.out.println(i);
			}
		}
	}

	static boolean isPingfang(int n) {
		for (int j = 0; j <= n; j++) {
			if (j * j == n) {
				return true;
			}
		}
		return false;
	}

}
