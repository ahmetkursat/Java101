package java101.javaArray;
import java.util.Arrays;

public class arrayMethods {
    public static void main(String[] args) {

        int [] list ={1,2,3,4,5,6,7};
        int [] list2 = {5,6,7,8};
        int [] list3 = new int[10];


        Arrays.fill(list,10);
        System.out.println(Arrays.toString(list));
        Arrays.fill(list,0,5,20); //array fill iki şekilde kullanabiliyoruz 1 bütün dizideki değerleri değiştirmede 2 cisi aralıktaki değerleri değiştirmede

        arraymetfunk Dizi = new arraymetfunk();
        Dizi.print(list);

        arraymetfunk.fills(list,5);
        Arrays.sort(list); //Dizinin İçindeki Değerleri Küçülten büyüğe sıralama

        Arrays.binarySearch(list,5); //bir dizinin içindeki indis değerini bulmak için arama yapar dizi sıralı olması lazım sıralı ise hep ortancayı bulup diğer tarafını atar

        int [] copylist = Arrays.copyOf(list2,5);
        System.out.println(Arrays.toString(copylist));
        int [] copylist2 = Arrays.copyOfRange(list2,2,5);
        System.out.println(Arrays.toString(copylist2));

        Arrays.equals(list,list2);
        System.out.println();

    }
}
