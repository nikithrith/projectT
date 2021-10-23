package TechBuzz;
import java.util.ArrayList;
import java.util.Scanner;
public class Cleaner extends Personal {
	static Scanner sc = new Scanner(System.in);
    private String sector;
    
    public Cleaner() {
    	
    }
    
    public Cleaner(int id,String firstName,String secondName, String thirdName,String phoneNumber,
            int age, String EGN,String position,int salary,int workHours,String sector) {
    	super(id,firstName,secondName,thirdName,phoneNumber,age,EGN,position,salary,workHours);
    	this.sector = sector;
    }
    public static void addCleaner(ArrayList<Cleaner> cleaners) {
	    
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
	    
	    System.out.println("ENTER SALES");
	    int sales = sc.nextInt();
	    
	    System.out.println("ENTER WORKING SECTOR");
	    String error2 = sc.nextLine();
	    String sector = sc.nextLine();
	    
	    cleaners.add(new Cleaner(id,firstName,secondName,thirdName,phoneNumber,age,EGN,
	    		position,salary,workHours,sector));

	}
    @Override
	public String toString() {
		return   super.toString() + " ; " +" Working Sector - " + sector;
	}

	public String getSector() {
		return sector;
	}

	public void setSector(String sector) {
		this.sector = sector;
	}
}
