package zuoye;

//��һ��������ֽ����������磺����90,��ӡ��90=2*3*3*5����������n���зֽ�������Ӧ���ҵ�һ����С������k��Ȼ����������ɣ�
//(1)����������ǡ����n����˵��ֽ�������Ĺ���Ѿ������ӡ��ɡ�????
//(2)���n>k����n�ܱ�k�����Ӧ��ӡ��k��ֵ������n����k����,��Ϊ�µ���������n,�ظ�ִ�е�һ����
//(3)���n���ܱ�k�������k+1��Ϊk��ֵ,�ظ�ִ�е�һ����
public class Separate_factor {
	public static void main(String[] args) {
		int n = 24;
		System.out.print(n + "=");

		for (int j = 2; j <= n;) {
			if (isprime(n)) {
				System.out.print(n);
				break;
			} else {
				if (n % j == 0 && isprime(j)) {
					System.out.print(j + "*");
					n = n / j;
					j = 2;

				} else
					
				{
					j = j + 1;
				}
			}
		}
	}

	static boolean isprime(int n) {
		for (int i = 2; i < n; i++) {
			if (n % i == 0) {
				return false;
			}
		}
		return true;
	}

}
