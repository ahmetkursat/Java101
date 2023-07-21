package java101.javaOperators;

import java.util.Scanner;

public class sinifgecme {
    public static void main(String[] args) {

        Scanner veri = new Scanner(System.in);
        System.out.println("Sınıf Geçme Durumu\n\n");
        System.out.println("Matematik Notunuz");
        int matnot = veri.nextInt();
        System.out.println("Fizik Notunuz");
        int fiznot = veri.nextInt();
        System.out.println("Türkçe Notunuz");
        int turnot = veri.nextInt();
        System.out.println("Kimya notunuz");
        int kimnot = veri.nextInt();
        System.out.println("Müzik Notunuz");
        int muznot = veri.nextInt();

        int notort = matnot+fiznot+turnot+kimnot+muznot;
        int bölme =5;
        int bölme2 = 4;
        int gecmenotu = 55;
        int max = 100;
        int min = 0;
        int derssayısı=0;
        int toplam_ders_notu = 0;

        if(max>=matnot && min <= matnot ){
            toplam_ders_notu += matnot;
            derssayısı++;
            System.out.println("Matematik notunuz girilmiştir");
        }else{
            System.out.println("Matematik Notunuz Dahil Edilmedi 0-100 arasında değer girin");
        }

        if (max>=fiznot && min <= fiznot){
            toplam_ders_notu += fiznot;
            derssayısı++;
            System.out.println("Fizik Notunuz Girilmiştir");
        }else{
            System.out.println("Fizik Notunuz Dahil Edilmedi 0-100 arasında bir değer giriniz");
        }

        if (max>=turnot && min <= turnot){
            toplam_ders_notu += turnot;
            derssayısı++;
        }else{
            System.out.println("Türkçe notunuz eklenmedi 0-100 arasında bir değer ekleyin");
        }
        if (max >= kimnot && min <= kimnot ){
            derssayısı++;
            toplam_ders_notu += kimnot;
        }else{
            System.out.println("Kimya Notunuz Eklenemedi 0-100 arasında bir değer ekleyin");
        }
        if (max >= muznot && min <= muznot ){
            derssayısı++;
            toplam_ders_notu +=kimnot;
        }else{
            System.out.println("Müzik Notunuz Eklenemedi 0-100 arasında bir değer ekleyin");
        }
        int fullderstoplam = toplam_ders_notu/derssayısı;

        if (fullderstoplam >= gecmenotu){
            System.out.println("Dersi Geçtiniz : " +fullderstoplam + "ortalama ile");
        }else{
            System.out.println("Dersten Kaldınız : "+fullderstoplam + "ortalama ile ");
        }






    }
}
