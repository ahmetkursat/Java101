package java101.javaFunctions;

public class overloading {
    public static void main(String[] args) {
    print();
    print(12);
    System.out.println(print(2,3));
    }
    static void print(){
        System.out.println("Merhaba");
    }
    static void print(int a){
        System.out.println("Parametreler : " + a);
    }
    static int print(int a,int b){
        return a + b;
    }
    

}
