package zuoye;
/*
 * 求s=a+aa+aaa+aaaa+aa...a的值，其中a是一个数字。
 * 例如2+22+222+2222+22222(此时共有5个数相加)，几个数相加有键盘控制
 */
public class P2_22 {

	public static void main(String[] args) {
		int a = 2 , sum = 0 , item= 0;
		for(int i = 0 ; i<5 ; i++)
		{
			item = item*10 + a;
			sum += item;
		}
		System.out.println(sum);
	}

}
