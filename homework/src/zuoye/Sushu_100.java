package zuoye;
//求100以內的素數
public class Sushu_100 {
	public static void main(String[] args) {
		int n = 100;
		for(int i=1;i<=n;i++)
		{
		Sushu_100 getprime = new Sushu_100();
		if(getprime.isprime(i))
		{
			System.out.print(i+" ");
		}
		}
	}
	boolean isprime(int n){
		for(int i=2; i<n; i++)
		{
			if(n%i==0){
				return false;
			}
		}
		return true;
	}

}
