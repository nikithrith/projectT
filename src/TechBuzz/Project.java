package TechBuzz;
import java.util.*;

public class Project {
	 String CompanyName = "TechBuzz";
	 static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		//firstName , secondName,thirdName,phoneNumber,age,EGN,position,salary,workHours,sales,shift
	    Seller s1 = new Seller("Georgi","Vasilev","Georgiev","0884358884",18,"0451638702","seller",2500,6,12,"vtora");
	    Seller s2 = new Seller("Jhon","Cameron","Jhon","0896427739",43,"9325476692","seller",500,8,1,"purva");
	    Seller s3 = new Seller("Ivan","Spasov","Nikolov","0872348816",24,"0158832383","seller",1000,8,4,"vtora");
	  
	    ArrayList<Seller> sellers = new ArrayList<Seller>();
	    
	    sellers.add(s1);
	    sellers.add(s2);
	    sellers.add(s3);
	 
	 System.out.println("Do you want to add seller? (Y(1)/N(2))");
	 
	  int changeSeller = sc.nextInt();
	  
	  if(changeSeller == 1) {
		Seller.addSeller(sellers);
		
	  }else if(changeSeller == 2){
		  System.out.println(" OK ");
	  }
	 
        for (Seller seller : sellers) {
			System.out.println(seller);
	  }

	}
}