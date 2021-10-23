package TechBuzz;

import java.util.ArrayList;
import java.util.Scanner;

public class Seller extends Personal  {
	static Scanner sc = new Scanner(System.in);
	private int sales;
	private String shift;
	
	//firstName , secondName,thirdName,phoneNumber,age,EGN,position,salary,workHours,sales,shift
 
	public Seller() {
		
	}
	 public Seller(int id,String firstName,String secondName, String thirdName,String phoneNumber,
	            int age, String EGN,String position,int salary,int workHours, int sales,
	            String shift) {
	   super(id,firstName,secondName,thirdName,phoneNumber,age,EGN,position,salary,workHours);
       this.sales = sales;
       this.shift = shift;
 
 }
	public ArrayList<Seller> sellers = new ArrayList<Seller>();
	
	
	// Mетод който позволява на User да вкара в системата нов продавач
	
	public static void addSeller(ArrayList<Seller> sellers) {
	    
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
	    
	    System.out.println("ENTER SHIFT");
	    String error2 = sc.nextLine();
	    String shift = sc.nextLine();
	    
	    sellers.add(new Seller(id,firstName,secondName,thirdName,phoneNumber,
	    		age,EGN,position,salary,workHours,sales,shift));

	}
	
	public int getSales() {
		return sales;
	}
 
	public void setSales(int sales) {
		this.sales = sales;
	}
 
	public String getShift() {
		return shift;
	}
 
	public void setShift(String shift) {
		this.shift = shift;
	}
	@Override
	public String toString() {
		return   super.toString() + " ; " +" Sales - " + sales + " ; " +" Shift - "  + shift;
	}

	
	

  
}
