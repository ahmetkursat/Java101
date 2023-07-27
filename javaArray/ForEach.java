package java101.javaArray;

public class ForEach {
    public static void main(String[] args) {

        int [] liste = {1,2,3,4,5};

        for (int i = 0;i<liste.length;i++){
            System.out.println(liste[i]);
        }
        for (int i: liste){
            System.out.println(i);
        }

        String[] araba = {"bmw","mercedes","audi"};

        for (String str:araba){
            System.out.println(str);
        }
        int[][] matris = {
                {1,2,3,4,5},
                {6,7,8,9,0}
        };

        for (int newmatris[]:matris){
            for (int k :newmatris){
                System.out.println(k);
            }
        }

    }
}
