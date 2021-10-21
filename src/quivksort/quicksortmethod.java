package quivksort;

public class quicksortmethod {

	public static void QuickSort(int[]ARR, int low, int high) {
		if(low < high) {
			int PivotIndex = Partition(ARR, low, high);
			QuickSort(ARR,low, PivotIndex-1);
			QuickSort(ARR, PivotIndex+1, high);

		}

	}

	private static int Partition(int[] arr, int low, int high) {
		
		
		int i = (low - 1);
		int pivot = arr[high]; 
		for (int j = 0; j < high; j++) {
			if (arr[j]< pivot) {
				i++;
				int TEMP = 0;
				//Swap if the current elemnt if element is smaller
				TEMP = arr[i];
				arr[i] = arr[j];
				arr[j] = TEMP;
			}
		}
		int TEMP;
		TEMP = arr[i+1];
		arr[i+1] = arr[high];
		arr[high] = TEMP;
		
		return i + 1;
	}

}
