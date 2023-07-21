package java101.javaFunctions;

import java.util.Scanner;

public class hesapmakmetot {
    public class toplama {
        static int ToplamaMethodu(int number1,int number2){
            int topla = number1+number2;
            System.out.println("Toplama İşlemi");
            return number1+number2;
        }
    }
     public class çıkarma {
        static Scanner scan = new Scanner(System.in);
        static int çıkarmaMethodu(int number1,int number2){
            int sayi;
            System.out.println("Çıkarma İşlemi" +"2 sayi önde olsun diyosan 2 bas" +
                    "\nHayırsa rasgele tuşa bas");
            sayi = scan.nextInt();
                    if(sayi == 2){
                        int cikar = number2-number1;
                        return cikar;
                    }else{
                        int cikar = number1-number2;
                        return number1-number2;
                    }
        }
    }public class carpma{

        static public int carpmaMethodu(int number1,int number2){
            int toplam = number1*number2;
            System.out.println("Çarpma İşlemi");
            return number1*number2;
        }
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Boolean yes =true;
        String menu = "1- Toplama İşlemi \n"+
                "2 Çıkarma İşlemi \n"+
                "3 Çarpma İşlemi \n"+
                "4 Bölme İşlemi \n"+
                "5 Üslü Sayı Hesaplama \n"+
                "6 Mod Alma \n"+
                "7 Dikdörtgen Alan ve Çevre Hesabı \n"+
                "8 Çıkış Yap";
        System.out.println(menu);
        int select = scan.nextInt();
        System.out.println("Birinci sayıyı giriniz");
        int number1 = scan.nextInt();
        System.out.println("İkinci sayıyı giriniz");
        int number2 = scan.nextInt();
        while (yes){
            if (select == 1){
                System.out.println(toplama.ToplamaMethodu(number1,number2));
                yes = false;
            }else if (select == 2) {
                System.out.println(çıkarma.çıkarmaMethodu(number1,number2));
                yes = false;
            }else if (select == 3) {
                System.out.println(carpma.carpmaMethodu(number1,number2));
                yes = false;
            }else if(select == 4 ){
                System.out.println();
                yes = false;
            }else if (select == 5) {
                System.out.println();
                yes = false;
            }else if (select == 6) {
                System.out.println();
                yes = false;
            }else if (select == 7) {
                System.out.println();
                yes = false;
            }else if (select == 8){
                System.out.println();
                yes = false;
            }else{
                System.out.println("Hatalı Değer Veya Sayı Girdiniz");
            }
        }
    }
}
