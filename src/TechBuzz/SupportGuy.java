package TechBuzz;
import java.util.ArrayList;
import java.util.Scanner;
public class SupportGuy extends Personal {
 
   static Scanner sc = new Scanner(System.in);
   
   public SupportGuy() {
	   
   }
   public SupportGuy(int id,String firstName,String secondName, String thirdName,String phoneNumber,
           int age, String EGN,String position,int salary,int workHours) {
	   super(id,firstName,secondName,thirdName,phoneNumber,age,EGN,position,salary,workHours);
	   
   }
   public static void addSupportGuy(ArrayList<SupportGuy> spg) {
	    
		 System.out.println("SET ID ");
		 int id = sc.nextInt();
		    
	    System.out.println("ENTER  FIRST NAME");
	    String error1= sc.nextLine();
	    String firstName = sc.nextLine();
	    
	    System.out.println("ENTER SECOND NAME");
	    
	    String secondName = sc.nextLine();
	    
	    System.out.println("ENTER THIRD NAME");
	    String thirdName = sc.nextLine();
	    
	    System.out.println("ENTER PHONE NUMBER");
	    String phoneNumber = sc.nextLine();
	    
	    System.out.println("ENTER AGE");
	      int age = sc.nextInt();
	    
	    System.out.println("ENTER EGN");
	    String error = sc.nextLine();
	    String EGN = sc.nextLine();
	    
	    System.out.println("ENTER POSITION");
	    String position = sc.nextLine();
	    
	    System.out.println("ENTER SALARY");
	    int salary = sc.nextInt();
	    
	    System.out.println("ENTER WORK HOURS");
	    int workHours = sc.nextInt();
	  
	    
	    spg.add(new SupportGuy(id,firstName,secondName,thirdName,phoneNumber,
	    		age,EGN,position,salary,workHours));

	}
   @Override
	public String toString() {
		return   super.toString() ;

  }
}
