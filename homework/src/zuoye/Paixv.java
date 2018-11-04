package zuoye;
//输入三个整数x,y,z，请把这三个数由小到大输出。
public class Paixv {
	public static void main(String[] args) {
		int[] xyz = {8,3,5};
		Paixv sorter = new Paixv();
		sorter.sort(xyz);
}
	public void sort(int[] xyz){
		for(int i = 1; i<xyz.length; i++){
			for(int j=0; j<xyz.length-i; j++){
				if(xyz[j]>xyz[j+1]){
					int temp = xyz[j];
					xyz[j] = xyz[j+1];
					xyz[j+1] = temp;
				}
			}
		}
		showArray(xyz);
}

public void showArray(int[] xyz){
	for(int i:xyz){
		System.out.print(" "+ i);
	}
	System.out.println();
}
	
}

