package zuoye;

//有1、2、3、4四个数字，能组成多少个互不相同且一个数字中无重复数字的三位数？并把他们都输出。
public class Threebitnumber {
	public static void main(String[] args) {
		int a, b, c, num = 0;
		for (int i = 1; i <= 4; i++) {
			a = i;
			for (int j = 1; j <= 4; j++) {
				if (j == i) {
					continue;
				} else {
					b = j;
					for (int k = 1; k <= 4; k++) {
						if (k != i && k != j) {
							c = k;
							num++;
							System.out.print(a * 100 + b * 10 + c + " ");
						}
					}
				}
			}
		}
		System.out.println("\n" + num);
	}
}
