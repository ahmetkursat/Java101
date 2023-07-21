package java101.javaLoops;
import java.util.Scanner;

public class ciftSayiBulmak {
    public static void main(String[] args) {

        Scanner veri = new Scanner(System.in);
        System.out.println("Sayı girin");
        int sayi = veri.nextInt();
        int toplam;
        for (int i = 1;i<=sayi;i++){
            if(i % 3 ==0 && i % 4 ==0 ){
                System.out.println("3 ve 4 katı sayılar : "+i);
            }
        }
        for (int a=1;a<=sayi;a++){
            if (a % 3 == 0 && a % 5 == 0){
                System.out.println("3 ve 5 katı sayılar : "+a);
            }
        }


    }}

