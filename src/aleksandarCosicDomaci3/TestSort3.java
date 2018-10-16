package aleksandarCosicDomaci3;

import java.util.Arrays;
import java.util.Random;

public class TestSort3 {
	
	public static int min(int[] a, int start) {
		int min = start;
		int minIndex = start;
		for (int i = start; i < a.length; i++) {
			System.out.println(a[i]);
			if(a[i] < min) {
				min = a[i];
				minIndex = i;
			}
		}
		return minIndex;
	}
	
	public static int randomInt() {
		Random rand = new Random();
		return rand.nextInt((100 - 1) + 1) + 1;
	}
	
	public static int[] arrayFiller(int size) {
		int[] a = new int[size];
		for (int i = 0; i < size; i++) {
			a[i] = randomInt();
		}
		return a;
	}
	
	public static int[] bubbleSort(int[] a) {
		int n = a.length - 1;
		for (int i = 0; i < n + 1; i++) {
			for(int j = n; j > i; j--) {
				if(a[j] < a[j - 1]) {
					int t = a[j];
					a[j] = a[j - 1];
					a[j - 1] = t;
				}
			}
		}
		return a;
	}
	
	public static int[] insertSort(int[] a) {
		for (int i = 0; i < a.length; i++) {
			int j = i;
			while(i > 0 && a[j] < a[j - 1]) {
				int t = a[j];
				a[j] = a[j - 1];
				a[j - 1] = t;
				j--;
			}
		}
		return a;
	}
	
	public static int[] selectSort(int[] a) {
		for (int i = 0; i < a.length - 1; i++) {
			int j = min(a, i);
			int t = a[i];
			a[i] = a[j];
			a[j] = t;
		}
		return a;
	}
	
	public static void main(String[] args) {
		int[] a = arrayFiller(10);
		int[] A = arrayFiller(10000);
		
		
//		System.out.println(Arrays.toString(bubbleSort(A)));
//		System.out.println(Arrays.toString(insertSort(A)));
		System.out.println(Arrays.toString(selectSort(a)));
	}

}
