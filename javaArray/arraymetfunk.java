package java101.javaArray;

public class arraymetfunk {
    void print(int[] arr){
        for(int i= 0; i<arr.length;i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();

    }
    void print(double[] arr){
        for(int i= 0; i<arr.length;i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();

    }

    static int[] fills(int[] arr,int value){
        for (int i= 0;i<arr.length;i++){
            arr[i] = value;

        }
        return arr;
    }






}
