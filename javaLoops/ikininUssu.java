package java101.javaLoops;
import java.util.Scanner;
public class ikininUssu {
    public static void main(String[] args) {
        System.out.println("Kuvvetleri bul");
        System.out.println("Bir sayı giriniz");
        Scanner veri = new Scanner(System.in);
        int verial = veri.nextInt();
        for(int sayi = 1;sayi<=verial;sayi*=5){
            System.out.println("5 kuvvetleri :"+sayi);
        }
        for (int sayi=1;sayi<=verial;sayi*=4){
            System.out.println("4 kuvvetleri :"+sayi);
        }
    }
}
