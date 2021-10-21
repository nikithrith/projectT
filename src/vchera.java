import java.util.Scanner;
public class vchera {

	public static void main(String[] args) {
		Scanner sc =  new Scanner(System.in);
		double [] grades = new double[5];
		double sum = 0;
		double n = sc.nextDouble();
		for(int i = 0; i < grades.length; i++ ) {
			
			if(n >2 || n <6) {
				grades[i] = n;
				sum += grades[i];
				System.out.println(" The grades are: " + grades [i]);
			}
		}
		System.out.println("Averege grades: " + (sum/5));
	}

}
