package projectT;

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
	 
	   public Personal(String firstName,String secondName, String thirdName,String phoneNumber,
			            int age, String EGN, String position,int salary,int workHours) {
	 
		   
		   ///sssssssssssssssssssssssssss
		   ////ssssssssssssssssss
		   this.firstName = firstName;
		   this.secondName = secondName;
		   this.thirdName = thirdName;
		   this.phoneNumber = phoneNumber;
		   this.age = age;
		   this.EGN = EGN;
		   this.position = position;
		   this.salary = salary;
		   this.workingHours = workHours;
	   }

	public String getFirstName() {
		return firstName;
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
	 
	public String getEGN() {
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

