package opp;
import java.util.Scanner;
public class AppStarter {
	public static void main(String[]args) {
		/*System.out.printf("Sequence[0..2]:%d,%d,%d,%n",
				Sequence.nextValue(), Sequence.nextValue(),
				Sequence.nextValue());*/
		Scanner sc =new Scanner(System.in);
		
		String answer ="y";
		while(answer.equals("y")) {
			Sequence mySeq = new Sequence();
			Sequence.currentValue++;
				System.out.println("Would you like to continue");
				answer=sc.next();
			
		}
		System.out.println("The number of objects you have created : " + Sequence.currentValue);
	}
}
