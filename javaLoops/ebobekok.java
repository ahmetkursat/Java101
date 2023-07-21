package java101.javaLoops;
import java.util.Scanner;
public class ebobekok {
    public static void main(String[] args) {
        Scanner veri = new Scanner(System.in);
        int sayi1,sayi2;
        System.out.println("Birinci Sayıyı Giriniz");
        sayi1 = veri.nextInt();
        System.out.println("İkinci Sayıyı Giriniz");
        sayi2 = veri.nextInt();
        int ebob;
        for(int i=1;i<=sayi1;i++){
            if (sayi1 % i == 0 && sayi2 % i == 0){
                System.out.println("sayılar "+i);
                ebob = i;
            }
        }
        for (int k=sayi1; k>=1;k--){
            if (sayi1 % k == 0 && sayi2 % k == 0){
                System.out.println("sayılar "+k);
                ebob = k;
                break;
            }
        }

        for (int i = 1; i<= (sayi1*sayi2);i++){
            if (i % sayi1 == 0 && i % sayi2 == 0){
                System.out.println(i);
                break;
            }
        }
        System.out.println();
    }
}
