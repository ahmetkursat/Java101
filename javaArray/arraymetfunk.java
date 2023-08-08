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

    static int search(int[] arr,int value){ //dizi sıral
        for (int i=0; i< arr.length;i++){
            if (arr[i] == value){
                return i;
            }
        }
        return -1;
    }

    static boolean equals(int[] l1,int[] l2){
        if (l1.length != l2.length){
            return false;
        }
        for (int i = 0; i <l1.length;i++){
            if (l1[i] != l2[i]){
                return false;
            }
        }
        return true;
    }






}
