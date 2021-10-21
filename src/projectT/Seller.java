package projectT;

public class Seller extends Personal  {
	
	private int sales;
	private String shift;
	//firstName , secondName,thirdName,phoneNumber,age,EGN,position,salary,workHours,sales,shift
 
	 public Seller(String firstName,String secondName, String thirdName,String phoneNumber,
	            int age, String EGN, String position,int salary,int workHours, int sales, String shift) {
	   super(firstName,secondName,thirdName,phoneNumber,age,EGN,position,salary,workHours);
	   this.sales = sales;
	   this.shift = shift;
 
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
	
}
