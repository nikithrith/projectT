package quivksort;

import java.util.Arrays;
import java.util.Scanner;
import public static void QuickSort(int[]ARR, int low, int high);
public class main {

	public static void main(String[] args) {
		Scanner Input =  new Scanner(System.in);
		
		
		int N = Input.nextInt();
		
		int[] ARR = new int[N];
		
		//For cucle to fill up the array
		for(int i = 0; i < N; i++) {
			System.out.printf("Please, input the [%d] element : " + i);
			ARR[i] = Input.nextInt();
		}
		//Before sorting
		System.out.println("BEfore Sorting :" + Arrays.toString(ARR));
		//call quicksort
		QuickSort(ARR,0, N - 1);
		
		//after sorting
		System.out.println("After sorting : "+  Arrays.toString(ARR));
		
	}

	private static void QuickSort(int[] aRR, int i, int j) {
		
		
	}

}
