

import java.util.Scanner;

public class ma {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int i = scan.nextInt();
        int faktoriel = 1;

        do {
            faktoriel = faktoriel * i;
            i--;
        } while (i > 1);
        System.out.println("n!= " + faktoriel*i);
    }
}