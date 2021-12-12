/**
* Java 1/ Homework #2
*
* @author Ekaterina Dumskaya
* @version 12.12. 23:30 - 13.12. 00:19
*
*/
class VtoroeDz {
    public static void main (String[] args) {
        returnSum(5, 1);
        checkPositiveOrNegative(0);
        returnTrueOrFalse(-1);
        printText(10);
    }
    
    static boolean returnSum(int a, int b) {
        int sum = a + b;
        return (sum >= 10 & sum <= 20? true : false);
    }
    
    static void checkPositiveOrNegative(int a) {
        System.out.println (a >=0? "Positive" : "Negative");
    }
    
    static boolean returnTrueOrFalse(int a) {
        return (a >= 0? false : true);
    }
    
    static void printText(int b) {
        for (int n = 0; n < b; n++){
            System.out.println ("Hello");
        }
    }
}