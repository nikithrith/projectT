package TechBuzz;

import java.util.Scanner;

public class Methods {
    static int choice;
	static Scanner sc = new Scanner(System.in);
	
	
	static void mainMenu() {
		 
	    System.out.println("What do you want to do ? ----------------------------------------------------------------");
	    System.out.println(" Add personal - Press (1) ");
	    System.out.println(" See the current personal - Press (2) ");
	    System.out.println(" Add a product - Press (3) ");
	    System.out.println(" See the products - Press (4) ");
	    
	    choice = sc.nextInt();
	    
	    if(choice == 1) {
	    	 addPersonalMenu();
	    	
	    }else if (choice == 2) {

	       seePersonalMenu();
	    	
	    }else if (choice == 3) {
	    	
	    	
	    }else if (choice == 4) {
	    	
	    	
	    }else {
	    	
	    	System.out.println("Please insert a valid number");
	    	mainMenu();
	    }
	}
  static void addPersonalMenu() {
	  
	  System.out.println(" What do you want to add ? ----------------------------------------------------------------");
	    System.out.println(" Manager - Press (1) ");
	    System.out.println(" Seller - Press (2) ");
	    System.out.println(" Cleaner - Press (3) ");
	    System.out.println(" SupportGuy - Press (4) ");
	    System.out.println(" To go back - Press (5) ");
	      
	    choice = sc.nextInt();
	    
	    if(choice == 1) {
	    	Project.addManager();
	    }else if(choice == 2) {
	    	Project.addSeller();
	    }else if(choice == 3) {
	    	Project.addCleaner();
	    }else if(choice == 4) {
	    	Project.addSupportGuy();
	    }else if(choice == 5){
	    	 mainMenu();
	    }else {
	    	System.out.println("Please insert a valid number");
	    	addPersonalMenu();
	    }
  }
  static void seePersonalMenu() {
	  System.out.println(" Who do you want to see? ----------------------------------------------------------------");
	  System.out.println(" Manager - Press (1) ");
	    System.out.println(" Seller - Press (2) ");
	    System.out.println(" Cleaner - Press (3) ");
	    System.out.println(" SupportGuy - Press (4) ");
	    System.out.println(" To go back - Press (5) ");
	    
        choice = sc.nextInt();
	    
	    if(choice == 1) {
	    	Project.seeManager();
	    }else if(choice == 2) {
	    	Project.seeSeller();
	    	
	    }else if(choice == 3) {
	    	Project.seeCleaner();
	    
	    }else if(choice == 4) {
	    	Project.seeSupportGuy();
	    
	    }else if(choice == 5){
	    	mainMenu();
	    }else {
	    	System.out.println("Please insert a valid number");
	    	addPersonalMenu();
	    }
  }
      static void goBackPersonal() {
	  System.out.println();
	  System.out.println(" To go back - Press (1) ");
	  System.out.println(" To go to Main Menu - Press (2) ");
	  choice = sc.nextInt();
	  if(choice == 2) {
		  mainMenu();
	  }else if(choice == 1) {
		  seePersonalMenu();
	  }else {
		  System.out.println("Please insert a valid number");
		  goBackPersonal();
	  }
  }
  
}