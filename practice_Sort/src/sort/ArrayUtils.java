package sort;

import java.util.Random;

public class ArrayUtils {
	public static void main(String[] args) {
		Random r = new Random();
		int[] arr = new int[10];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = r.nextInt(100);
		}
		for (int e : arr) {
			System.out.print(e + " ");
		}
		// 选择排序
//		先排小的
//		for (int i = 0; i < arr.length; i++) {
//			int index = i;
//			for (int j = i; j < arr.length; j++) {
//				if (arr[index] > arr[j]) {
//					index = j;
//				}
//			}
//			int tmp = arr[i];
//			arr[i] = arr[index];
//			arr[index] = tmp;
//		}
//      先排大的
//		for (int i = 1; i < arr.length; i++) {
//			int index = 0;
//			for (int j = 0; j <= arr.length - i; j++) {
//				if (arr[j] > arr[index]) {
//					index = j;
//				}
//				int tmp = arr[arr.length - i];
//				arr[arr.length - i] = arr[index];
//				arr[index] = tmp;
//			}
//		}
////////////////////////////////////
		// 冒泡排序
		for (int i = 1; i < arr.length; i++) {
			for (int j = 0; j < arr.length - i; j++) {
				if (arr[j] > arr[j + 1]) {
					arr[j] = arr[j] ^ arr[j + 1];
					arr[j + 1] = arr[j] ^ arr[j + 1];
					arr[j] = arr[j] ^ arr[j + 1];
				}
			}
		}

		System.out.println();
		for (int e : arr) {
			System.out.print(e + " ");
		}
	}
}
