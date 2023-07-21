package java101.javaLoops;
import java.util.Scanner;
public class faktoriyel {
    public static void main(String[] args) {
        Scanner veri = new Scanner(System.in);
        System.out.println("Faktöriyel Hesaplama");
        int verial = veri.nextInt();
        int sayi1=1;
        for (int i =1;i<=verial;i++){
           sayi1= sayi1*i;
        }
        System.out.println("Faktöriyel "+verial+" Sonucu : "+sayi1);
    }
}
