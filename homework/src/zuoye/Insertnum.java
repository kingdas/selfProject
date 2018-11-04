package zuoye;
//有一个已经排好序的数组。现输入一个数，要求按原来的规律将它插入数组中。
public class Insertnum {
	public static void main(String[] args) {
		int[] arr ={1,2,4,5};
		int num = 3;
		int index = 0;
		for(int i=0;i<arr.length;i++){
			if(arr[i]<num){
				index++;	
			}
		}
		int[] arr2 = new int[arr.length+1];
		
		arr2[index] = num;
		for(int i=0;i<arr2.length;i++){
			
			if(i<index){
				
				arr2[i]=arr[i];
			}else if(index==i)
			{
				arr2[i]=num;
				
			}else{
			arr2[i]=arr[i-1];
			}
		}
		for (int i=0;i<arr2.length;i++) {
			System.out.print(arr2[i]);
		}
		
	}
}
	

