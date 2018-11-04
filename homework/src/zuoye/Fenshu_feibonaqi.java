package zuoye;
//有一分数序列：2/1，3/2，5/3，8/5，13/8，21/13...求出这个数列的前20项之和
public class Fenshu_feibonaqi {

	public static void main(String[] args) {
		int a=2,b=1;
		double sum=0,item;
		for(int i=0;i<20;i++)
		{
			item = (a*1.0)/b;
			sum += item;
			int ta = a;
			a=a+b;
			b=ta;
		}
		System.out.println(sum);
	}

}
