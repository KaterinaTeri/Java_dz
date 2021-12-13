/**
* Java 1/ Homework #2
*
* @author Ekaterina Dumskaya
* @version 12.12. 23:30 - 13.12. 00:19 - 13.12. 11:17
*
*/
class VtoroeDz {
    public static void main (String[] args) {
        returnSum(5, 1);
        checkPositiveOrNegative(0);
        returnTrueOrFalse(-1);
        printText("Hello", 5);
    }
    
    static boolean returnSum(int a, int b) {
        int sum = a + b;
        return sum >= 10 & sum <= 20;
    }

    static void checkPositiveOrNegative(int a) {
        System.out.println(a >= 0 ? "Positive" : "Negative");
    }

    static boolean returnTrueOrFalse(int a) {
        if (a >=0) {
            return false;
        }
        return true;
    }
    
    static void printText(String str, int a) {
        for (int n = 0; n < a; n++){
            System.out.println (str);
        }
    }
}

