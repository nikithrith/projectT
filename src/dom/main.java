package dom;

import java.util.Arrays;
import java.util.Scanner;

public class main {

	
		public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        System.out.println("Input number of elements : ");

	        int N = sc.nextInt();
	        int [] ARR = new int[N];

	        for (int i = 0; i < N ; i++) {

	            System.out.println("Input element [" + i + "] : ");
	            ARR[i] =sc.nextInt();

	        }
	        System.out.println("BEFORE SORTING : " + Arrays.toString(ARR));

	       Divide(ARR,0,N-1);
	       
	       
	      System.out.println("AFTER SORTING : " + Arrays.toString(ARR));


	    }

		private static void Divide(int[] aRR, int i, int j) {
			
			
		}



	}
	


