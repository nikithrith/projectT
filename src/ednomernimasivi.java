import java.util.Scanner;
public class ednomernimasivi {

    public static void sortWeights(int[] tejesti){
        for(int i = 1; i < tejesti.length;i++){
            int getedEl = tejesti[i];
            int poslednoSortiran = i - 1;
            while(poslednoSortiran >= 0 && tejesti[poslednoSortiran] < getedEl){
                tejesti[poslednoSortiran + 1] = tejesti[poslednoSortiran];
                poslednoSortiran --;
            }
            tejesti[poslednoSortiran + 1] = getedEl;

        }

    }
    public static void bagPackageCounterCheck(int kapacitet, int[] tejesti1){
        int counter = 0;
        int index = 0;
        while(kapacitet > 0){
            if(index < tejesti1.length){
                if(kapacitet / tejesti1[index] > 0){
                    kapacitet -= tejesti1[index];
                    counter++;
                    System.out.println("Capacity is " + kapacitet + " weights: " + tejesti1[index] + " counter: " + counter );
                }else{
                    index++;
                }
            }else{
                System.out.print("The backpack cannot be filled with these packages!Rest is :" + kapacitet);
                break;
            }
        }
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter backpack capacity: ");
        int bagCapacity = scanner.nextInt(); //Point  1.1)
        System.out.print("How many items you have for backpack (2-5): ");
        int items = scanner.nextInt();
        int[] tejestNaPredmeta = new int[items];
        while(items < 2 || items > 5 ){
            System.out.print("Enter valid number: ");
            items = scanner.nextInt();
        }
        for(int i = 0; i < items;i++){
            System.out.printf("How many kilograms do the items weight? [%d] : ",i);
            tejestNaPredmeta[i] = scanner.nextInt();
        }
        sortWeights(tejestNaPredmeta);
        bagPackageCounterCheck(bagCapacity , tejestNaPredmeta);
    }
}