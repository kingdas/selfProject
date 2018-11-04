package zuoye;
//求1+2!+3!+...+20!的和
public class Jiecheng {
	public static void main(String[] args) {
		int sum1 = 0;
		int sum2 = 1;
		int i;
		for(i=1; i<=20; i++){
			sum2 = sum2*i;
			sum1 += sum2;
		}
		System.out.println(sum1);
	}

}
