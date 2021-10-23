package TechBuzz;

public class Personal {
	   private String firstName;
	   private String secondName;
	   private String thirdName;
	   private String phoneNumber;
	   private int age;
	   private String EGN;
	   private String position;
	   private int salary;
	   private int workingHours;
	   private int id;
	 
	   public Personal() {
		   
	   }
	   
	   
	   public Personal(int id,String firstName,String secondName, String thirdName,String phoneNumber,
	            int age, String EGN,String position,int salary,int workHours) {
	 	   this.id = id;
		   this.firstName = firstName;
		   this.secondName = secondName;
		   this.thirdName = thirdName;
		   this.phoneNumber = phoneNumber;
		   this.position = position;
		   this.age = age;
		   this.EGN = EGN;
		   this.salary = salary;
		   this.workingHours = workHours;
	   }

	   
	   // CODE BY STACK - OVERFLOW -------------------------------------------------------------------
	   //Prints array 
	   
	@Override
	public String toString() {
		return  "\n"+ "-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------" + "\n"
	           +  "ID - " + id +" ; " + firstName + " " + secondName + " " + thirdName + " ; " + age + " years old " +
	           " ; " +" Phone Number - " + phoneNumber + " ; " +" EGN - " +EGN +
	           " ; " +" Position - " + position +  " ; "+" Salary - " + salary + " lv. " + " ; "
	           + workingHours + " work hours";
	}
	// ----------------------------------------------------------------------------------------------
	
	
	
	
	
	
	
	
	
	
	
	public  String getFirstName() {
		return  firstName;
	}
	 
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	 
	public String getSecondName() {
		return secondName;
	}
	 
	public void setSecondName(String secondName) {
		this.secondName = secondName;
	}
	 
	public String getThirdName() {
		return thirdName;
	}
	 
	public void setThirdName(String thirdName) {
		this.thirdName = thirdName;
	}
	 
	public String getPhoneNumber() {
		return phoneNumber;
	}
	 
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	 
	public int getAge() {
		return age;
	}
	 
	public void setAge(int age) {
		this.age = age;
	}
	 
	public  String getEGN() {
		return EGN;
	}
	 
	public void setEGN(String eGN) {
		EGN = eGN;
	}
	 
	public String getPosition() {
		return position;
	}
	 
	public void setPosition(String position) {
		this.position = position;
	}
	 
	public int getSalary() {
		return salary;
	}
	 
	public void setSalary(int salary) {
		this.salary = salary;
	}
	 
	public int getWorkingHours() {
		return workingHours;
	}
	 
	public void setWorkingHours(int workingHours) {
		this.workingHours = workingHours;
	}
}

