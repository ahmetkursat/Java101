package java101.javaArray;

public class tekboyutluDiziler {
    public static void main(String[] args) {

     int[] dizi = new int[10];
     double[] list1 = new double[5];

     String[] days = {"Pazartesi","Salı","Çarşamba"};
     String[] weekenddays = {"Cumartesi","Pazar"};
//     days[0] = "Perşembe";
//        System.out.println(days.length);
//        System.out.println(days[0]);
//        System.out.println(weekenddays[0]);

        for (int i=0;i <=(days.length -1);i++){
            System.out.println(days[i]);
        }


    }
}
