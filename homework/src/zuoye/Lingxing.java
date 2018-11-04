package zuoye;
/*
 * 打印出如下图案（菱形）         
   *      
  ***    
 *****    
*******     
 *****       
  ***        
   *  

 */
public class Lingxing {
	public static void main(String[] args) {
		int total = 7;
		int max = (total+1)/2;
		for(int i =1; i<=max; i++){
		for(int upspace=1; upspace<=max-i; upspace++){
			System.out.print(" ");
		}
		for(int upstar=1; upstar<=i*2-1; upstar++){
			System.out.print("*");
		}
		System.out.println();
	}
		int decline = total - max;
		for(int j=1; j<=decline; j++){
			for(int downspace =1; downspace<=j; downspace++){
				System.out.print(" ");
			}
			for(int downxin =1; downxin<=(decline-j+1)*2-1; downxin++){
				System.out.print("*");
			}
			System.out.println();
		}

}
}
