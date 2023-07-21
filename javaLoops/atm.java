package java101.javaLoops;
import java.util.Scanner;
public class atm {
    public static void main(String[] args) {
        Scanner veri = new Scanner(System.in);
        String userName, password;

        int right =3;
        int balance =1500;
        int select;


        while (right >0){


            System.out.println("Kullanıcı Adınız : ");
            userName = veri.nextLine();
            System.out.println("Şifreniz : ");
            password = veri.nextLine();
            if (userName.equals("patika") && password.equals("dev123")){
                System.out.println("Merhaba X bankasına hoş geldiniz");
                do {
                    System.out.println("Lütfen Yapmak İstedidğiniz işlemi seçin");
                    System.out.println("1-Para Yatırma\n" +
                            "2-Para Çekme \n"+
                            "3-Bakiye Sorgulama \n"+
                            "4-Çıkış Yap");
                    select = veri.nextInt();
                    if (select== 1){
                        System.out.println("Para Miktarı Girin");
                        int price = veri.nextInt();
                        balance += price;
                    } else if (select == 2) {
                        System.out.println("Para Miktarı Giriniz");
                        int price = veri.nextInt();
                        if (price > balance){
                            System.out.println("Bakiye Yetersiz");
                        }else{
                            balance -= price;
                        }

                    } else if (select==3) {
                        System.out.println("Bakiyeniz : "+balance);

                    }
                }while (select != 4);
                System.out.println("Tekrar görüşmek üzere");
                break;
            }
            else{
                right--;
                System.out.println("Hatalı Kullanıcı Adı veya Şifre");
                if (right == 0){
                    System.out.println("Hesabınız Bloke Olmusştur Lütfen Banka İle İletişime Geçin");
                }else{
                    System.out.println("Kalan Hakkınız : "+ right);
                }
            }


        }





    }
}
