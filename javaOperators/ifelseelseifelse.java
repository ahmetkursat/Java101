package java101.javaOperators;


public class ifelseelseifelse {
    public static void main(String[] args) {
//        int a = 10 , b = 20, c = 1;
//        boolean compare = a == b;
//        String str = compare ? "Eşittir" :"Eşit Değildir";
//        System.out.println(str);
//        Scanner veri = new Scanner(System.in);
//        if (compare){
//            System.out.println("Eşittir");
//        }else{
//            System.out.println("Eşit Değildir");
//        }

//        if((a < b) &&  (a < c)) {
//            System.out.println("A en küçük sayıdır");
//        } else if ((b < a) && (b <c)) {
//            System.out.println("B en küçük sayıdır");
//        } else if ((c < a) && (c < b )) {
//            System.out.println("C en küçük sayıdır");
//        }


//        int var1 = 5;
//        int var2 = 6;
//        if ((var2 = 1) == var1)//atama yapabiliyoruz
//            System.out.print(var2);
//        else
//            System.out.print(++var2);

        int a = 20, b = 10;
        if ((a < b) && (b++ < 25)){
            System.out.println(a);
        }else{
            System.out.print(a);
        }
        System.out.println(b);


    }
}
