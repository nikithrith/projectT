import java.text.DecimalFormat;
import java.util.Scanner;

public class razstoqnie {

	public static void main(String[] args) {
		DecimalFormat df = new DecimalFormat("#.##");
		Scanner sc = new Scanner(System.in);
		int is = 0;
		int ft = 0;
		int st = 0;
		int tt = 0;
		double fth = 0;
		double sth = 0;
		double tth = 0;
		double tk = 0;
		
		System.out.println("Pls input is :");
		is =sc.nextInt();
		System.out.println("Pls input ft :");
		ft =sc.nextInt();
		fth = ft/60.00;
		System.out.println("Pls input st :");
		st =sc.nextInt();
		sth = st/60.00;
		System.out.println("Pls input tt :");
		tt =sc.nextInt();
		tth = tt/60.00;
		tk = (double) ((is * fth) + (is * 1.1 * sth) + (is * 1.1 * 0.95 * tth));
		String resoult = df.format(tk);
		System.out.printf("tk %s" , resoult); 
	}

}
