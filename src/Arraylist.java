import java.util.ArrayList;

public class Arraylist {
   
    public static void main(String[] args) {
        ArrayList<Integer> arrList = new ArrayList<Integer>();//First - create array list!
         arrList.add(1);
         arrList.add(2);
         arrList.add(3);
         arrList.add(4);
         arrList.add(5);
        System.out.println("We added 5 numbers in the array list"); 
        
        results(arrList);
        System.out.println("Added a new nuber - 7");
        
        arrList.add(7);
        results(arrList);
        
        System.out.println("Added a new number - 6, in the array list, at index 5");
        
        
        arrList.add(5, 6);
        
        results(arrList);
        
        arrList.remove(5);       
        
        System.out.println("Removed the number 6 in the array list, at index 5");
        
        results(arrList);
        
        System.out.println("Removed the number 5 in the array list by value");
        
        arrList.remove(Integer.valueOf(5));
        
        results(arrList);
    }
    
    
    
    public static void results(ArrayList<Integer> arr){   
    	System.out.print("Current ArrayList: ");
        for (int i = 0; i < arr.size(); i++) {
            System.out.print(arr.get(i) + " ");
        }
        System.out.println(" \n ======================================================");
    }
}