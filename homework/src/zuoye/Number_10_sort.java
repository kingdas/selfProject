package zuoye;
//对10个数进行排序 
public class Number_10_sort {
	public static void main(String[] args) {
		int[] number = {132,55,1,32,852,32,3,46,2,34};
		Number_10_sort sorter = new Number_10_sort();
		sorter.sort(number);
	}
	public void sort(int[] number){
		int index;
		for(int i=1; i<number.length; i++){
			index = 0;
			for(int j=1; j<=number.length-i; j++){
				if(number[j]>number[index]){
					index = j;
				}
			}
			int temp = number[number.length-i];
			number[number.length-i]=number[index];
			number[index]=temp;
		}
		showArray(number);
	}
	public void showArray(int[] number){
		for(int i:number){
			System.out.print(i+" ");
		}
	}

}
