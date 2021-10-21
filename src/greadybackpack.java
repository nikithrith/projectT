import java.util.Arrays;
import java.util.Scanner;

public class greadybackpack {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int[] ArrToSort = {25,8,13,55,49,36,98,2};
	int currMinIDX = 0;
	int buff = 0;
	int n = ArrToSort.length;
	System.out.println("Before Sorting :" + Arrays.toString(ArrToSort));
	
	for (int i = 0 ; i< n; i++ ) {
		for(int j = i; j<n; j++) {
			if (ArrToSort[j]< ArrToSort[currMinIDX]) {
				currMinIDX=j;
			}
		
		
		}//end of int for
		buff = ArrToSort[i];
		ArrToSort[i] = ArrToSort[currMinIDX];
		ArrToSort[currMinIDX] = buff;
		
		currMinIDX = i;
		
	}//end of ext for
	System.out.println("Before After :" + Arrays.toString(ArrToSort));
	}

}
