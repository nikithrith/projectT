import java.util.Scanner;

public class rows_collums {
	private static int number;
	public static void main(String[] args) {
		Scanner sc =  new Scanner(System.in);
		number = 3;
		int coll = number;
		int row = number;
		System.out.println("Number of solutions : " + recurse(row - 1, coll - 1));
	}

	
	
	private static long recurse(int remRows, int remColls) {
		long[][] STAT = new long [35][35];

		if(remRows == 0 || remColls == 0) {
			return 1;
	}
		if( STAT[remRows][remColls] != -1) {
			return STAT [remRows][remColls];
		}
		
		long answer = 0;
		answer = answer +recurse( remRows - 1, remColls); // движим се надолу
		answer = answer + recurse (remRows,  remColls - 1); // движим се надолу
		
		return answer;
		
}
}