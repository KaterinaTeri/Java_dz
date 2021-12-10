class PervoeDZ {
    public static void main(String[] args) {
        printThreeWords();
		checkSumSign();
		printColor();
		compareNumbers();
    }
	
	static void printThreeWords() {
        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");
    }
	
   	static void checkSumSign() {
		int a = -10;
		int b = 7;
		System.out.println(a+b>=0? "The amount is positive" : "The amount is negative");
	}
	
	static void printColor() {
		int value = 0;
		if (value <=0) {
			System.out.println("Red");
		} else if (value <=100) {
			System.out.println("Yellow");
		} else {
			System.out.println("Green");
		}
		
	}
	
	static void compareNumbers() {
		int a = 11;
		int b = 3;
		System.out.println(a>=b? "a >= b" : "a < b");
	}
}
