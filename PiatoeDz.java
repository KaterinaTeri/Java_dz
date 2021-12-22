/**
 * Java 1/ Homework #5
 *
 * @author Ekaterina Dumskaya
 * @version 22.12
 *
*/
class PiatoeDz {
    public static void main (String[] args) {
        Person[] person = new Person[5];
        person[0] = new Person ("Arkadiy Antipov", "pojarniy", "ark@mail.ru", 8901, 15000, 40);
        person[1] = new Person ("Boris Borovik", "lektor", "bor@gmail.ru", 8902, 10000, 70);
        person[2] = new Person ("Vitaliy Viatskiy", "povar", "vit@ya.ru", 8903, 20000, 25);
        person[3] = new Person ("Gennadiy Gromov", "voditel", "gen@yandex.ru", 8904, 12000, 60);
        person[4] = new Person ("Dmitriy Donskoy", "analitic", "dmi@icloud.com", 8905, 19000, 35);
        person[0].setAge(50);                //посмотрела, как работает сеттер
        for (int i = 0; i < person.length; i++) {
            if (person[i].getAge() > 40) {
                System.out.println(person[i]);
            }
        }
    }
}

class Person {
    private String fio;
    private String position;
    private String email;
    private int tel;
    private int zp;
    private int age;
    
    
    Person (String fio, String position, String email, int tel, int zp, int age) {
        this.fio = fio;
        this.position = position;
        this.email = email;
        this.tel = tel;
        this.zp = zp;
        this.age = age;
    }
    
    public int getAge() {
        return age;
    }
    
    public void setAge (int age) {
        if (age > 0) {
            this.age = age;
        }
    }
    
    @Override
    public String toString () {
        return fio + ", " + position + ", " + email + ", " + tel + ", " + zp  + ", " + age;
    }
}



