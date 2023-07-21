package java101.javaFunctions;

import java.util.Scanner;
public class palidromsayi {
        static boolean isPalidrom(int number){
        Scanner veri = new Scanner(System.in);

        int temp = number,reverseNumber = 0,lastNumber;
        while (temp != 0){
            System.out.println("===========");
            System.out.println("Sayı => "+temp);

            lastNumber = temp % 10;
            System.out.println("Son basamak => " +lastNumber);

            reverseNumber = (reverseNumber * 10) + lastNumber;

            System.out.println("Yenisayi => "+reverseNumber);

            System.out.println("Yeni Temp => "+temp);

            temp /= 10;
            System.out.println("Yeni Temp => " +temp);

        }
        return true;
    }

    public static void main(String[] args) {
        isPalidrom(2476);
    }
}
