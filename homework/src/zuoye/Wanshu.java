package zuoye;
//一个数如果恰好等于它的因子之和，这个数就称为 "完数 "。例如6=1＋2＋3.编程     找出1000以内的所有完数。
public class Wanshu {
	public static void main(String[] args) {
		int i;
		System.out.println("1000以内完数有:");
		for(i=2; i<=1000; i++)
		{
			int sum = 0;
			for(int j=1; j<i; j++)
			{
				if(i%j==0)
				{
					sum+=j;
				}
			}
			if(i==sum)
			{
				System.out.println(i);
			}
		}
	}

}
