package dom;

public class method {

	public static void main(String[] args) {
		public static void Divide(int []arr,int l ,int r) {

	        if(l < r) {
	            int m = (l + r) / 2;

	            Divide(arr,l,m); // Recursive Left;
	            Divide(arr, m + 1,r); //Recursive Left;

	            CompareAndMergeArr(arr,l,m,r);

	        }
	    }


	    private static void CompareAndMergeArr(int []arr,int l,int m,int r) {

	        int LeftArrLenght = m - l + 1 ;
	        int RightArrLenght = r - m ;

	        int [] L = new int [LeftArrLenght];
	        int [] R = new int [RightArrLenght];

	        for (int i = 0; i < LeftArrLenght ; i++) {
	            L[i] = arr[l + i];
	        }
	        for (int j = 0; j < RightArrLenght; j++) {
	            R[j] = arr[m + 1 + j];
	        }

	        int i = 0; // index for left array
	        int j = 0; // index for right array
	        int k = l;

	        while( i < LeftArrLenght && j < RightArrLenght){

	      if(L[i] <= R[j]){
	          arr[k] = L[i];
	          i++;
	      }
	      else{
	          arr[k] = R[j];
	          j++;
	      }
	       k++;

	        }

	}

}
}