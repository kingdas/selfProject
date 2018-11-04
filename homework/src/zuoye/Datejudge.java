package zuoye;
//输入某这一年的年某月某日，判断这一天是第几天？ 

public class Datejudge {
	public static void main(String[] args) {
		int[] mon1 = {31,28,31,30,31,30,31,31,30,31,30,31};
		int[] mon2 = {31,29,31,30,31,30,31,31,30,31,30,31};
		int year = 2018;
		int month = 07;
		int day = 24;
		if((year%400==0)||(year%4==0&&year%100!=0))
		{
			int sum = 0;
			for(int i =0; i<mon2.length; i++)
			{
				if(month>i&&month<=i+1)
				{
					int mark = i;
					for(int j = 0; j<mark; j++)
					{
						sum = sum + mon2[j];
					}
				}
			}
			System.out.println("今天是"+year+"年第"+(sum+day)+"天");
		}
		else
		{
			int sum = 0;
			for(int i =0; i<mon1.length; i++)
			{
				if(month>i&&month<=i+1)
				{
					int mark = i;
					for(int j = 0; j<mark; j++)
					{
						sum = sum + mon1[j];
					}
				}
			}
			System.out.println("今天是"+year+"年第"+(sum+day)+"天");
		}
	}

}
