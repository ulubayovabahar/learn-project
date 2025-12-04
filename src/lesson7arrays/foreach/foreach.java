package lesson7arrays.foreach;

public class foreach {
    public static void main(String[] args) {

//        int[] liste = new int[4];
//        liste[0] = 1;
//        liste[1] = 2;
//        liste[2] = 3;
//        liste[3] = 4;

//        for(int i=0; i<liste.length; i++){
//            int value = liste[i];
//            System.out.println(value);
//        }

//        for(int value: liste){
//            System.out.println(value);
//        }


        // Multidimensional arrays

        // int[][] liste = new int[5][3];

        int[][] liste = new int[][]{
                {1,2,3},
                {4,5,6},
                {7,8,9},
                {10,11,12},
                {13,14,15}
        };

//        for(int i=0; i<liste.length; i++){
//            for(int j=0; j<liste[i].length; j++){
//                System.out.print(liste[i][j] + " ");
//            }
//            System.out.println();
//        }

        for(int[] setir : liste){
            for( int value : setir){
                System.out.print(value + " ");
            }
            System.out.println();
        }



    }
}
