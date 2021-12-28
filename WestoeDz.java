/**
 * Java 1/ Homework #6
 *
 * @author Ekaterina Dumskaya
 * @version 29.12
 *
*/

class WestoeDz {
    public static void main (String[] args) {
        IAnimal cat = new Cat ("Tima",200);
        IAnimal dog = new Dog ("Reks",  10, 500);
        IAnimal[] animals = {cat, dog};
        for (IAnimal animal : animals) {
            System.out.println(animal);
            System.out.println(animal.run(200));
            System.out.println(animal.run(600));
            System.out.println(animal.swim(5));
            System.out.println(animal.swim(15));
        }
        
    }
}

interface IAnimal {
    String swim(int dist);
    String run(int dist);
}

abstract class Animal implements IAnimal {
    protected String name;
    protected int swimMax;
    protected int runMax;
    
    Animal (String name, int swimMax, int runMax) {
        this.name = name;
        this.swimMax = swimMax;
        this.runMax = runMax;
    }
    
    @Override
    public String swim(int dist) {
        if (dist > swimMax) {
            return name + " sorry, I couldn't swim " + dist;
        } else {
            return name + " yes, I can swim " + dist;
        }
    }
    
    @Override
    public String run(int dist) {
        if (dist > runMax) {
            return name + " sorry, I couldn't run " + dist;
        } else {
            return name + " yes, I can run " + dist;
        }
    }
    
    @Override
    public String toString() {
        return name + " Can swim only - " + swimMax + " m " + " Can run only - " + runMax + " m ";
    }
}

class Cat extends Animal {
    
    Cat (String name, int swimMax, int runMax) {
        super (name, swimMax, runMax);
    }
    
    Cat (String name, int runMax) {
        super (name, 0, runMax);
    }
    
    @Override
    public String swim(int dist) {
        return name + "Error! I cannot swim!";
    }
}

class Dog extends Animal {
    
    Dog (String name, int swimMax, int runMax) {
        super (name, swimMax, runMax);
    }
}