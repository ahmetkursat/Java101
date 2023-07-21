package java101.javaLoops;
import java.util.Scanner;
public class harmoniksayi {
    public static void main(String[] args) {
        Scanner veri = new Scanner(System.in);

        System.out.println("Bir sayı giriniz");
        int n = veri.nextInt();
        double result = 0;
        for (double i = 1;i<=n;i++){
            result += (1.0/i);
        }
        System.out.println(result);

        //double bir sayıyı int bölünce int varir virgülden sonrasını atar int

    }
}
