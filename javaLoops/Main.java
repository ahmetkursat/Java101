package java101.javaLoops;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Üssü alınacak sayıyı girin: ");
        int base = scanner.nextInt();

        System.out.println("Üs sayısını girin: ");
        int exponent = scanner.nextInt();

        int result = 1;

        for(int i = 0; i < exponent; i++) {
            result *= base;
        }

        System.out.println("Sonuç: " + result);
    }
}