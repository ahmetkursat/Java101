package java101.javaOperators;

import java.util.Scanner;

public class hesapmakinesi {
    public static void main(String[] args) {
        Scanner veri = new Scanner(System.in);
        System.out.println( "HESAP MAKİNESİ ");
        System.out.println("****************");
        System.out.println("1 sayıyı giriniz : ");
        int sayi1 = veri.nextInt();
        System.out.println("2 sayıyı giriniz : ");
        int sayi2 = veri.nextInt();
        System.out.println("Yapacağınız İşlemi Seçiniz :\n" +
                            "Toplama işlemi için :1\n"+
                            ("Çıkarma İşlemi için :2\n")+
                             ("Çarpma  İşlemi için :3\n")+
                                ("Bölme işlemi için :4\n"));
        int islemno = veri.nextInt();
        switch (islemno) {
            case 1:
                int topla = sayi1 + sayi2;
                System.out.println("Toplama İşlemi Sonucu : "+ topla);
                break;
            case 2:
                System.out.println("Sayı1 sayı 2 cıkartılsın diyosan :1 \n"+  "Sayı 2 Sayı 1 cıkarılsın istiyosan 2 bas");
                int cikarops = veri.nextInt();
                switch (cikarops)
                    {
                    case 1:
                        int çıkar = sayi1-sayi2;
                        System.out.println("Çıkarma İşlemi Sonucu : "+ çıkar);
                        break;

                    case 2:
                        int çıkar2 = sayi2-sayi1;
                        System.out.println("Çıkarma işlemi Sonucu : "+çıkar2);
                        break;
                    default:
                        System.out.println("Hatalı Sayı Girdiniz");
                        break;
                     }
                break;
            case 3:
                int çarp = sayi1*sayi2;
                System.out.println("Çarpma İşlemi Sonucu : "+çarp);
                break;
            case 4:
                System.out.println("Birinci Sayıyı İkinci Sayıya bölmek için 1 \n"+"ikinci sayıyı 1 sayıya bölmek için 2 bas");
                int bölops = veri.nextInt();
                switch (bölops){

                    case 1:
                        int böl = sayi1/sayi2;
                        System.out.println("Bölme İşlemi Sonucu : "+böl);
                        break;
                    case 2:
                        int böl2 = sayi2/sayi1;
                        System.out.println("Bölme İşlemi Sonucu : "+böl2);
                        break;

                    default:
                        System.out.println("Hatalı işlem Yaptınız veya Yanlış tuşa bastınız");
                         }
                         break;

                         default:
                System.out.println("Hatalı veya Yanlış Tuşa bastınız Tekrar Deneyiniz");
                break;

        }
    }




}
