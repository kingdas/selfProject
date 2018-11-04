package zuoye;
//利用递归方法求5!。
public class Jiecheng_5 {
	public static void main(String[] args) {
		int i=1, sum=1;
		for(; i<=5; i++){
			sum*=i;
		}
		System.out.println(sum);
	}

}
