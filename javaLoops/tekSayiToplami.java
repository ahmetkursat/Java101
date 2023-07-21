package java101.javaLoops;
import java.util.Scanner;


public class tekSayiToplami {
    public static void main(String[] args) {
        Scanner veri = new Scanner(System.in);
        int toplam = 0;
        do {
            System.out.println("Bir sayı giriniz : ");
            int a;
            a = veri.nextInt();
            if (a % 2 != 0){
                toplam += a;
            }
        }while (toplam % 2 == 0 && toplam % 4 == 0);

        System.out.println("Toplam" +toplam);
    }
}
