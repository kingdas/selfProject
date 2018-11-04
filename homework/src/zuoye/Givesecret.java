package zuoye;

//ĳ��˾���ù��õ绰������ݣ��������λ�������ڴ��ݹ�����Ǽ��ܵģ����ܹ������£�
//ÿλ���ֶ�����5,Ȼ���úͳ���10�������������֣��ٽ���һλ�͵���λ�������ڶ�λ�͵���λ������
import java.util.Scanner;

public class Givesecret {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("please input a fourbit number");
		int n = s.nextInt();
		int a = n/1000;
		int b = (n-a*1000)/100;
		int c = (n-a*1000-b*100)/10;
		int d = n-a*1000-b*100-c*10;
		n = a+b+c+d+20;
		n%=10;
		int a1 = n/1000;
		int b1 = (n-a1*1000)/100;
		int c1 = (n-a1*1000-b1*100)/10;
		int d1 = n-a1*1000-b1*100-c1*10;
		int tmp = a1;
		a1=d1;
		d1=tmp;
		tmp=b1;
		b1=c1;
		c1=tmp;
		String m = ""+a1+b1+c1+d1;
		System.out.println(m);
	}
}
