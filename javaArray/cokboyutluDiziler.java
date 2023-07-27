package java101.javaArray;

public class cokboyutluDiziler {
    public static void main(String[] args) {
        int [] list = new int[5];
        int [] list2 ={1,2,3,4,5};

        int[][] matris = new int[6][6];
//        matris[0][0] = 0;
//        matris[2][3] = 839;
//        System.out.println(matris[2][3]);

//        int[][] jsonmatris = new int[6][6];
//
//        jsonmatris[][] = {
//            {0 ,453,939,243,783,891};
//
//        };

        int[][] matruska = {
                {0,453,939,243,783,891},
                {453,0,490,384,620,439},
                {939,490,0,839,863,423},
                {243,384,839,0,544,1045},
                {783,620,863,544,0,1045},
                {891,439,423,823,1045,0}
        };

//        System.out.println(matruska[5][5]);
//        System.out.println(matruska[0][3]);


        int matrax[][] = new int[3][4];
        int number = 1;
        for (int i=0;i<matrax.length;i++){
           for (int j= 0; j<matrax[i].length;j++){
                matrax[i][j] = number++;
           }
        }

        for (int i =0;i<matrax.length;i++){
            for (int j=0;j<matrax[i].length;j++){
                System.out.print(matrax[i][j] + " ");
            }
            System.out.println();
        }


    }
}
