package java101.javaOperators;

import java.util.Scanner;

public class switch_case {

    public static void main(String[] args) {
        System.out.println("Bugun günlerden ne");
        Scanner veri = new Scanner(System.in);

        int day = veri.nextInt();

        switch (day){
            case 1:
              System.out.println("Bügün Pazartesi");
                    break;
            case 2:
                System.out.println("bugun salı ");
                    break;
            case 3:
                System.out.println("bugun carşamba");
                break;
            case 4:
                System.out.println("BUGUN persembe");
                break;
            case 5:
                System.out.println("bugun cuma ");
                break;
            default:
                System.out.println("Hatalı Giriş Yaptınız");
                break;
    }
}}
