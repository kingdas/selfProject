package zuoye;

//将一个数组逆序输出
public class Nixvshuchu {
	public static void main(String[] args) {
		int[] array = {23,354,64,1,56,97,17};
		Nixvshuchu sorter = new Nixvshuchu();
		sorter.sort(array);

	}
	public void sort(int[] array){
		for(int i = 1; i<array.length; i++){
			for(int j=0; j<array.length-i; j++){
				if(array[j]<array[j+1]){
					int temp = array[j];
					array[j]=array[j+1];
					array[j+1]=temp;
				}
			}
		}
		for(int i:array){
		System.out.print(i+" ");
	}
	}
}
