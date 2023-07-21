package java101.javaLoops;

import java.util.Scanner;
public class ucgen {
    public static void main(String[] args) {
        Scanner veri = new Scanner(System.in);
        System.out.println("Bir sayı giriniz");
        int n = veri.nextInt();

        for (int i =1;i<=n;i++){
            for (int k=1;k <=(n-i);k++){

                    System.out.print(" ");
                }


            for(int j = 1; j <=(2*i)-1;j++){
               System.out.print("*");
                }

            System.out.println();
        }




    }
}
