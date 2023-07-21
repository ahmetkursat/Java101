package java101.javaLoops;

import java.util.Scanner;

public class kombinasyonlar {
    public static void main(String[] args) {
        Scanner veri = new Scanner(System.in);
        System.out.println("Eleman Sayısını Giriniz");
        int as= veri.nextInt();
        System.out.println("Seçim Sayısını Giriniz");
        int sa= veri.nextInt();
        int toplam = 1;
        int fak2 = 1;
        int fark = 1;

        for (int i=1;i<=as;i++){
          toplam= i*toplam;
        }for (int a=1;a<=sa;a++){
           fak2 =a*fak2;
        }
        int eksi = as-sa;
        for (int b =1;b <=eksi;b++){
            fark = b*fark;
        }
        int a = toplam/(fak2*fark);
        System.out.println("Kombinasyon Formüllü : "+a);
    }
}
