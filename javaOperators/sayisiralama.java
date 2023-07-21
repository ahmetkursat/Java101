package java101.javaOperators;

import java.util.Scanner;

public class sayisiralama {
    public static void main(String[] args) {
        Scanner veri = new Scanner(System.in);

        System.out.println("3 sayıyı sıralayan program");
        System.out.println("1 sayıyı giriniz");
        int sayi1 = veri.nextInt();
        System.out.println("2 sayıyı giriniz");
        int sayi2 = veri.nextInt();
        System.out.println("3 sayıyı giriniz");
        int sayi3 = veri.nextInt();

        if (sayi1 < sayi2 && sayi1 < sayi3)
        {
            System.out.println("Küçükten büyüğe sıralama "+sayi1+"<");
            if (sayi1 <sayi2 && sayi1 >sayi3)
            {
                System.out.println("sıralama "+sayi3+"<"+sayi1+"<"+sayi2);
            }if (sayi1>sayi2 && sayi1 >sayi3 && sayi2>sayi3){
            System.out.println("Sıralama "+sayi3+"<"+sayi2+"<"+sayi1);
            }if (sayi1>sayi2 && sayi1 >sayi3 && sayi3>sayi2){
            System.out.println("Sıralama "+sayi2+"<"+sayi3+"<"+sayi1);
            };

        }else if (sayi2 <sayi1 && sayi2 < sayi3)
        {
            System.out.println("kÜÇÜKTEN büyüğe sıralama "+sayi2);

        }else if (sayi3 <sayi1 && sayi3 <sayi2){
            System.out.println("Küçükten büyüğe sıralama "+sayi3);
        }


    }

}
