/**
 * Java 1/ Homework #7
 *
 * @author Ekaterina Dumskaya
 * @version 30.12
 *
*/

class SedmoeDz {
    public static void main (String[] args) {

        Cat[] cat = new Cat[3];
        cat[0] = new Cat("Tomas", 10);
        cat[1] = new Cat("Boris", 25);
        cat[2] = new Cat("Simba", 5);
        Plate plate = new Plate(30);

            for (Cat i : cat) {
                if (i.getCatIsFull() == 0) {
                    if (!plate.checkFood(i.getAppetite())) {
                        plate.addFood();
                        System.out.println(plate);
                    }
                    i.eat(plate);
                    System.out.print(i.getName() + " eat " + i.getAppetite() + " food and ... ");
                    System.out.println(plate);
                }
            }
            System.out.println("Now we have: " + plate.getFood());
    }
}

class Cat {
    private String name;
    private int appetite;
    private int catIsFull;
    
    Cat (String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
        this.catIsFull = 0;
    }
    
    String getName() {
        return name;
    }
    
    int getAppetite() {
        return appetite;
    }
    
    int getCatIsFull() {
        return catIsFull;
    }
    
    void eat(Plate plate) {
        plate.decreaseFood(appetite);
    }
    
    @Override
    public String toString() {
        return name + " appetite is " + appetite;
    }
}

class Plate {
    private int food;
    
    Plate(int food) {
        this.food = food;
    }
    
    int getFood() {
        return food;
    }
    
    void decreaseFood(int f) {
        this.food -= f;
    }
    
    void addFood() {
        this.food += 20;
        System.out.println("We add some food for you");
    }
    
    boolean checkFood(int f) {
        return (food - f) >= 0;
    }
    
    @Override
    public String toString() {
        return "Now we have - " + food;
    }
}