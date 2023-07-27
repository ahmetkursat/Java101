package java101.javaArray;

public class arrayStart {
    public static void main(String[] args) {

        
        double[] myList = new double[10];

        // Java'da diziye ilk değerler süslü parantezler arasında verilir.
        double[] myList2 = { 1.9, 2.9, 3.4, 3.5 };

        // tüm dizi elemanlarını arada boşuk bırakarak sırayla ekrana yazdırır.
        for (int i = 0; i < myList.length; i++)
        {
            System.out.println(myList[i] + " ");
        }

    }
}
