package java101.javaArray;
import java.util.Arrays;

public class arrayMethods {
    public static void main(String[] args) {

        int [] list ={1,2,3,4,5,6,7};
        int [] list2 = {5,6,7,8};


        Arrays.fill(list,10);
        System.out.println(Arrays.toString(list));
        Arrays.fill(list,10,15,20); //array fill iki şekilde kullanabiliyoruz 1 bütün dizideki değerleri değiştirmede 2 cisi aralıktaki değerleri değiştirmede

        arraymetfunk Dizi = new arraymetfunk();
        Dizi.print(list);

        arraymetfunk.fills(list,5);



    }
}
