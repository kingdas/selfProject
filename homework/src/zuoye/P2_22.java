package zuoye;
/*
 * ��s=a+aa+aaa+aaaa+aa...a��ֵ������a��һ�����֡�
 * ����2+22+222+2222+22222(��ʱ����5�������)������������м��̿���
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
