package zuoye;
//输入数组，最大的与第一个元素交换，最小的与最后一个元素交换，输出数组
public class Jiaohuanyuansu {
	public static void main(String[] args) {
		int[] shuzu = new int[]{1,2,3,4,5};
		Jiaohuanyuansu sorter = new Jiaohuanyuansu();
		sorter.sort(shuzu);
	}
	public void sort(int[] shuzu){
		int leng = shuzu.length;
		int tmp;
		for(int i=0; i<leng/2; i++){
			tmp=shuzu[i];
			shuzu[i]=shuzu[leng-1-i];
			shuzu[leng-1-i]=tmp;
		}
		System.out.println("反转后数组为");
		for(int i:shuzu){
			System.out.print(i+" ");
		}
	}

}
