package osmiyuli;

import java.util.Scanner;
import java.util.Arrays;
import java.util.Arrays;
import java.util.Scanner;

public class main {
    public static char[] CurrBinaryStr;
    public static char[] PreviousBinaryStr;


    public static void xOR() {
        for (int i = 0; i < PreviousBinaryStr.length; i++) {
            char CurrCh = CurrBinaryStr[i];
            char PrevCh = PreviousBinaryStr[i];

            if(CurrCh == PrevCh){
                CurrBinaryStr[i] = '0';
            }else{
                CurrBinaryStr[i]  = '1';
            }
        }
    }

    public static void rotation(int n){
        char[] rotate = CurrBinaryStr;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < 7; j++) {
                char Buff = rotate[j+1];
                rotate[j+1] = rotate[0];
                rotate[0] = Buff;
            }
        }
        CurrBinaryStr = rotate;
    }
    public static void shift(int n){
        char[] Shifts = CurrBinaryStr;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < 7; j++) {
                char Buff = Shifts[j+1];
                Shifts[j+1] = Shifts[0];
                if(j == 6){
                    Buff = '0';
                }
                Shifts[0] = Buff;
            }
        }
        CurrBinaryStr = Shifts;
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Input string: ");
        String Name = scanner.nextLine();

        char[] NameToCharArr = Name.toCharArray();

        for (int i = 0; i < NameToCharArr.length; i++) {
            int aSCII = NameToCharArr[i];

            CurrBinaryStr = new char[8];
            PreviousBinaryStr = new char[8];

            CurrBinaryStr = Integer.toBinaryString(aSCII).toCharArray();

            if(CurrBinaryStr.length == 7){
                char[] EightBit = new char[8];
                EightBit[0] = '0';
                for (int j = 0; j < 7; j++) {
                    EightBit[j+1] = CurrBinaryStr[j];
                }
                CurrBinaryStr = EightBit;
            }

            PreviousBinaryStr = Arrays.copyOf(CurrBinaryStr, 8);
            rotation(8);
            xOR();
            PreviousBinaryStr = Arrays.copyOf(CurrBinaryStr, 8);
            rotation(12);
            xOR();
            PreviousBinaryStr = Arrays.copyOf(CurrBinaryStr, 8);
            shift(1);

            int stepen = 1;
            int sum = 0;
            int l = CurrBinaryStr.length;

            for (int j = 0; j < 8; j++) {
                if(CurrBinaryStr[l-j-1] == '1'){
                    sum += stepen;
                }
                stepen = stepen*2;
            }
        }
        System.out.println(CurrBinaryStr);

    }
}