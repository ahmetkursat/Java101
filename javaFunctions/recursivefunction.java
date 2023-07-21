package java101.javaFunctions;

public class recursivefunction {
    static int f(int n ){
        System.out.println(n);
        if (n == 1){
            return 1;
        }
        return  f(n-1) +n;
    }

    public static void main(String[] args) {
        System.out.println(f(1));
    }
    //recursive geri dönüşü olan methodlar işe yarar



}
