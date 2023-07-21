package java101.javaOperators;

import java.util.Scanner;

public class loginregister {
    public static void main(String[] args) {

        Scanner veri = new Scanner(System.in);

        System.out.println("Login İşlemi ");

        System.out.println("Kullanıcı Adınız : ");
        String username = veri.nextLine();

        System.out.println("Şifreniz : ");
        String password = veri.nextLine();

        if (username.equals("Ahmet") && password.equals("java123")){
            System.out.println("Giriş Yaptınız");
        }else {
            System.out.println(" Bilgileriniz yanlış");

        }






    }
}
