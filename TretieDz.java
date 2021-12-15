/**
 * Java 1/ Homework #3
 *
 * @author Ekaterina Dumskaya
 * @version 15.12
 *
*/
class TretieDz {
    public static void main (String[] args) {
        changeMassive();
        fillMassive();
        multiplyMassive();
        fillDiagonal();
        getArgument(10, 7);
        findMinAndMax();
    }
    
    static void changeMassive() {
        int[] binar = {0, 1, 1, 1, 0};
        for (int i = 0; i < binar.length; i++) {
            if (binar[i] > 0){
                binar[i] = 0;
            } else {
                binar[i] = 1;
            }
        System.out.print(binar[i] + " ");
        } 
		System.out.println();
    }
    
    static void fillMassive() {
        int[] sto = new int[100];
        for (int i = 0; i < sto.length; i++) {
            sto[i] = i+1;
            System.out.print(sto[i]);
        }
        System.out.println();
    }
    
    static void multiplyMassive() {
        int[] multy = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < multy.length; i++) {
            if (multy[i] < 6) {
                multy[i] = multy[i]+multy[i];
            }
            System.out.print(multy[i] + " ");
        }
        System.out.println();
    }
    
    static void fillDiagonal() {
        int n = 5;
        int[][] diagonal = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == j) {
                    diagonal[i][j] = 1;
                } else {
                    diagonal[i][j] = 0;
                }
                System.out.print(diagonal[i][j] + " ");
            }
        System.out.println();
        }
    }
    
    static void getArgument (int len, int initialValue) {
        int[] arg = new int[len];
        for (int i = 0; i < arg.length; i++) {
            arg[i] = initialValue;
            System.out.print(arg[i] + " ");
        }
        System.out.println();
    }
    
    static void findMinAndMax() {
        int[] minmax = {1, 9, 5, 13, 0};
        int minN = minmax[0];
        int maxN = minmax[0];
        for (int i : minmax) {
            if (i < minN)
                minN = i;
        }
        for (int j : minmax) {
            if (j > maxN)
                maxN = j;
        }
        System.out.println("Minimum number = " + minN);
        System.out.println("Maximum number = " + maxN);
    }

}