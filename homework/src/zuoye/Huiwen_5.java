package zuoye;
//一个5位数，判断它是不是回文数。即12321是回文数，个位与万位相同，十位与千位相同。 
public class Huiwen_5 {
	public static void main(String[] args) {
		int num = 12321;
		int a = num/10000;
		int b = (num-a*10000)/1000;
		int c = (num-a*10000-b*1000)/100;
		int d = (num-a*10000-b*1000-c*100)/10;
		int e = num-a*10000-b*1000-c*100-d*10;
		if(a==e&&b==d){
			System.out.println(num+"是一个回文数");
		}
		else
		System.out.println(num+"不是一个回文数");
		
	}

}
