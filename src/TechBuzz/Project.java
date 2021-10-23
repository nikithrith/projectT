package TechBuzz;
import java.util.*;

public class Project {
	 static String CompanyName = "TechBuzz";
	 static Scanner sc = new Scanner(System.in);
	 static int choice;
	 static ArrayList<Seller> sellers = new ArrayList<Seller>();
	 static ArrayList<Manager> managers = new ArrayList<Manager>();
	 static ArrayList<Cleaner> cleaners = new ArrayList<Cleaner>();
	 static ArrayList<SupportGuy> supportGuys = new ArrayList<SupportGuy>();
	 
	
	public static void main(String[] args) {
		
		// ADD PRE-SET PERSONAL ---------------------------------------------------------------------------------------------
		
		// SELLERS ---------------------------------------------------------------------------------------------------------
		
		//id, firstName , secondName,thirdName,phoneNumber,age,EGN,position,salary,workHours,sales,shift
		
	    Seller s1 = new Seller(1,"Georgi","Vasilev","Georgiev","0884358884",18,"0451638702","seller",2500,6,12,"vtora");
	    Seller s2 = new Seller(2,"Jhon","Cameron","Jhon","0896427739",43,"9325476692","seller",500,8,1,"purva");
	    Seller s3 = new Seller(3,"Ivan","Spasov","Nikolov","0872348816",24,"0158832383","seller",1000,8,4,"vtora");
	  
	   
	    
	    sellers.add(s1);
	    sellers.add(s2);
	    sellers.add(s3);
	 
	    // -----------------------------------------------------------------------------------------------------------------
	    
	    //MANAGERS ----------------------------------------------------------------------------------------------------------
	    
	     //id, firstName , secondName,thirdName,phoneNumber,age,EGN,position,salary,workHours,sales,leadingGroup
	    
	    
	    Manager georgi = new Manager(18210,"Georgi","Valeriev","Vasilev","0884358884",17,"0451638702","Owner",5000,20,"Everything");
	    Manager nikolaVy = new Manager(1,"Nikola","Vasilev","Vylev","0884358884",18,"0451638702","Owner",5000,4,"Everything");
	    Manager nikolaVa = new Manager(1,"Nikola","Vasilev","Vazonov","0884358884",18,"0451638702","Owner",5000,6,"Everything");
	    Manager viktor = new Manager(18207,"Viktor","Vasilev","Zahariev","0884358884",18,"0451638702","Owner",5000,4,"Everything");
	    Manager simeon = new Manager(1,"Simeon","Vasilev","Georgiev","0884358884",18,"0451638702","Owner",5000,4,"Everything");
	    
	
	    
	    managers.add(georgi);
	    managers.add(nikolaVy);
	    managers.add(nikolaVa);
	    managers.add(viktor);
	    managers.add(simeon);
	    
	    
	   // ---------------------------------------------------------------------------------------------------------------------
	    //CLEANERS -----------------------------------------------------------------------------------------------------------
	      
	      //id, firstName , secondName,thirdName,phoneNumber,age,EGN,position,salary,workHours,sales,sector
	    
	    
	      Cleaner cl1 = new Cleaner(4,"Stanislav","Stanislavov","Kostadinov","0884321684",30,"8753058359","cleaner",650,8,"Everything");
	      Cleaner cl2 = new Cleaner(5,"Daniel","Stanislavov","Kostadinov","0887398182",21,"064920702","cleaner",650,8,"Everything");
	    
	      cleaners.add(cl1);
	      cleaners.add(cl2);
	      
	      
	      // ---------------------------------------------------------------------------------------------------------------------
	    // SUPPORT GUYS ----------------------------------------------------------------------------------------------------------
	     
	      
	      SupportGuy spg1 = new SupportGuy(6,"Iordan","Yonkov","Istatkov","0895788984",19,"0451638702","spg",800,8);
	      SupportGuy spg2 = new SupportGuy(7,"Georgi","Aleksandrev","Ivanov","0881301690",32,"0451638702","spg",800,8);
	      
	      supportGuys.add(spg1);
	      supportGuys.add(spg2);
	      
	      // ---------------------------------------------------------------------------------------------------------------------
	      
	      
	    mainMenu();
	   
	    
	    
		 
	  

	}
	//Main menu -------------------------------------------------------------------------------------------------------
	
	static void mainMenu() {
		 
	    System.out.println("What do you want to do ? ----------------------------------------------------------------");
	    System.out.println(" Add personal - Press (1) ");
	    System.out.println(" See the current personal - Press (2) ");
	    System.out.println(" Add a product - Press (3) ");
	    System.out.println(" See the products - Press (4) ");
	    
	    choice = sc.nextInt();
	    
	    if(choice == 1) {
	    	 Methods.addPersonalMenu();
	    	
	    }else if (choice == 2) {

	       Methods.seePersonalMenu();
	    	
	    }else if (choice == 3) {
	    	
	    	
	    }else if (choice == 4) {
	    	
	    	
	    }else {
	    	
	    	System.out.println("Please insert a valid number");
	    	mainMenu();
	    }
	}// ------------------------------------------------------------------------------------------------------------------
	
	
	// Methods with arrays ------------------------------------------------------------------------------------------------
	// ----------------------------------------------------------------------------------------------------------------------
	
	 static void addSeller() {
		Seller.addSeller(sellers);
		Methods.goBackPersonal();
		
	}
	 static void addManager() {
		 Manager.addManager(managers);
		 Methods.goBackPersonal();
	 }
	 static void addSupportGuy() {
		 SupportGuy.addSupportGuy(supportGuys);
		 Methods.goBackPersonal();
	 }
	 static void addCleaner() {
		 Cleaner.addCleaner(cleaners);
		 Methods.goBackPersonal();
	 }
	 static void seeSeller() {
		 
		 for (Seller seller : sellers) {
				System.out.println(seller);
		  }
		 Methods.goBackPersonal();
	 }
	 static void seeManager() {
		 for (Manager manager : managers) {
				System.out.println(manager);
		  }
		 Methods.goBackPersonal();
	}
	 static void seeCleaner() {
		 for (Cleaner cleaner : cleaners) {
				System.out.println(cleaner);
		  }
		 Methods.goBackPersonal();
	}
	 static void seeSupportGuy() {
		 for (SupportGuy sp : supportGuys) {
				System.out.println(sp);
		  }
		 Methods.goBackPersonal();
		 
	}
	
	
	
	
	
	
}