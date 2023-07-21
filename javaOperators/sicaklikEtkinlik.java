package java101.javaOperators;

import java.util.Scanner;

public class sicaklikEtkinlik {
    public static void main(String[] args) {
        Scanner veri = new Scanner(System.in);
        System.out.println("Hava Sıcağılığına Göre Etkinlik Önerme");
        System.out.println("Hava Sıcaklığını Giriniz : ");
        int heat = veri.nextInt();

        if ( heat < 5){
            System.out.println("Kayak Yapabilirsiniz");
        }else if (heat >= 5 && heat <= 25 ){
            if ( heat <= 15){
                System.out.println("Sinema git");
            }
            if  (heat > 15 ){
                System.out.println("pikniğe git");
            }
        }else{
            System.out.println("Yüzmeye gidebilirsin");
        }
    }
}
