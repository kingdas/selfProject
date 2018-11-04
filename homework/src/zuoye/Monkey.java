package zuoye;

public class Monkey {
	public static void main(String[] args) {
		int num = 6;
     a:for(;true;num += 5){
         int temp = num;
         for(int monkey = 1; monkey <= 5; monkey++)
         {
             if(temp >= 6 && temp % 5 ==1)
             {
                 temp = temp / 5 * 4;
                 if(monkey == 5)
                 {
                     break a;
                 }
             }
             else
              break;
         }
     }
     System.out.println("海滩上原来最少有" + num + "个桃子");
}
}

