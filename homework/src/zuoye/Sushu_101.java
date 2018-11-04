package zuoye;

public class Sushu_101 {
	public static void main(String[] args) {
		int n = 200;
		Sushu_101 getprime = new Sushu_101();
		for(int i = 101; i<=n; i++)
		{
			if(getprime.isprime(i))
			{
				System.out.print(i+" ");
			}
		}
	}
		boolean isprime (int a) {
			for(int i=2; i<a; i++)
			{
				if(a%i==0)
				{
					return false;
				}
			}
			return true;
		}
}


