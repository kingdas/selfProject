package zuoye;
//计算由数字0~7所组成的奇数个数
public class Oddnumber {
	public static void main(String[] args) {
		int sum = 0;
		for(int i =0; i<=6; i++) {
			sum+=28*(Math.pow(8, i));
		}
		System.out.println(sum+4);
	}

}
