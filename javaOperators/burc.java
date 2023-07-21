package java101.javaOperators;

import java.util.Scanner;

public class burc {
    public static void main(String[] args) {

     Scanner veri = new Scanner(System.in);

        System.out.println("Burç Hesaplama");
        int ocak=1,subat=2,mart=3,nisan=4,mayis=5,haziran=6,temmuz=7,agustos=8,eylul=9,ekim=10,kasim=11,aralik=12;
        int onegun = 1;
        int lastgun =30;
        System.out.println("""
                Ocaktan-aralığa kadar 1-12 sayısı arasında ay giriniz \s
                \s
                1+ocak\s
                2+subat\s
                3+mart\s
                4+nisan\s
                5+mayıs\s
                6+haziran\s
                7+temmuz\s
                8+ağustos\s
                9+eylül\s
                10+ekim\s
                11+kasım\s
                12+aralık\s
                """);
        int burcay = veri.nextInt();

        System.out.println("1-30 kadar bir gün giriniz");
        int burctarih = veri.nextInt();


        if(ocak <= burcay && aralik >= burcay){
            if (onegun <= burctarih && lastgun >= burctarih){
                if (burcay == ocak){
                    if (burctarih <= 21){
                        System.out.println("Kova burcusunuz");
                    }else{
                        System.out.println("Oğlak burcusunuz");
                        }
                    }
                if (burcay == subat){
                    if (burctarih <= 21){
                        System.out.println("Kova burcusunuz");
                        }else{
                        System.out.println("Balık burcusunuz");
                        }
                    }
                if (burcay == mart){
                    if (burctarih <= 21){
                        System.out.println("Balık burcusunuz");
                    }else{
                        System.out.println("Koç burcusunuz");
                    }
                }if (burcay == nisan){
                    if (burctarih <= 21){
                        System.out.println("Koç  burcusunuz");
                    }else{
                        System.out.println("Boğa  burcusunuz");
                    }
                }if (burcay == mayis){
                    if (burctarih <= 21){
                        System.out.println("Boğa  burcusunuz");
                    }else{
                        System.out.println("İkizler  burcusunuz");
                    }
                }if (burcay == haziran){
                    if (burctarih <= 21){
                        System.out.println("İkizler  burcusunuz");
                    }else{
                        System.out.println("Yengeç burcusunuz");
                    }
                }if (burcay == temmuz){
                    if (burctarih <= 21){
                        System.out.println("Yengeç burcusunuz");
                    }else{
                        System.out.println("Aslan  burcusunuz");
                    }
                }if (burcay == agustos){
                    if (burctarih <= 21){
                        System.out.println("Aslan burcusunuz");
                    }else{
                        System.out.println("Başak burcusunuz");
                    }
                }if (burcay == eylul){
                    if (burctarih <= 21){
                        System.out.println("Başak burcusunuz");
                    }else{
                        System.out.println("Terazi burcusunuz");
                    }
                }if (burcay == ekim){
                    if (burctarih <= 21){
                        System.out.println("Terazi Burcusunuz");
                    }else{
                        System.out.println("Akrep Burcunusuz");
                    }
                }if (burcay == kasim){
                    if (burctarih <= 21){
                        System.out.println("Akrep Burcusunuz");
                    }else{
                        System.out.println("Yay Burcunusuz");
                    }
                }if (burcay == aralik) {
                    if (burctarih <= 21) {
                        System.out.println("Yay Burcusunuz");
                    } else {
                        System.out.println("Oğlak Burcusunuz");
                    }
                }
                }else {
                System.out.println("Yanlış gün girdiniz");
                  }
        }else{
            System.out.println("Hatalı ay girdiniz Girdiniz");
        }
    }
}
