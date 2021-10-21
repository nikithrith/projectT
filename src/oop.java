import java.util.Arrays;
import java.util.Scanner;
public class oop {
	   public static void fillMatrix(int[][] matrix){
	        Scanner sc = new Scanner(System.in);
	        for (int row = 0; row < matrix.length; row++) {
	            for (int col = 0; col < matrix.length; col++) {
	                System.out.printf("Enter number for [%d] row and [%d] col: ",row ,col);
	                matrix[row][col] = sc.nextInt();
	            }
	        }
	    }
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		  System.out.print("How many rows and cols will  the matrix have ? :");

	        int RowAndColLength = sc.nextInt();
	        int[][] matrix = new int[RowAndColLength][RowAndColLength];

	        fillMatrix(matrix);

	        System.out.println();
	        for (int row = 0; row < matrix.length; row++) {
	            for (int col = 0; col < matrix.length; col++) {
	                System.out.print(matrix[row][col] + " ");
	            }
	            System.out.println();
	        }
	        System.out.println();

	        for (int row = 0; row < matrix.length; row++) {

	            for (int col = 0; col < matrix.length; col++) {
	                int sum = 0;

	                if(col + 1 < matrix.length){
	                    sum = sum + matrix[row][col] + matrix[row][col+1];
	                    System.out.printf("Sum in row[%d]: col[%d] plus col[%d] is: %d",row,col,col+1,sum);
	                    System.out.println();
	                }else{
	                    System.out.println("End of row");
	                }

	            }

	        }
	    }

    }
	


