package animal_demo;

public class Main {
    public static void main(String[] args) {
        Animal animal1 = new Animal("Fish", 2);
        Mammal mammal1 = new Mammal("John", 5, "Soft");
        Dog dog1 = new Dog("Smith", 10, "German Shepherd", "Thick");
        Poodle poodle1 = new Poodle("Meeker", 7, "Glossy", 10);
        Dalmatian dalmatian1 = new Dalmatian("John", 3, "Short", 100);
        Cat cat1 = new Cat("Bill", 25, "Short", 10);
        Bird bird1 = new Bird("Flappy",5, "Short");
        Sparrow sparrow1 = new Sparrow("Birdy",4, "Long", "Pretty");
        Chicken chicken1 = new Chicken("Dinner",1, "Medium soft", true);

        System.out.println(animal1.toString());
        System.out.println(mammal1.toString());
        System.out.println(dog1.toString());
        System.out.println(poodle1.toString());
        System.out.println(dalmatian1.toString());
        System.out.println(cat1.toString());
        System.out.println(bird1.toString());
        System.out.println(sparrow1.toString());
        System.out.println(chicken1.toString());

        animal1.eat();
        System.out.println();
        mammal1.move();
        System.out.println();
        dog1.bark();
        System.out.println();
        poodle1.prance();
        System.out.println();
        dalmatian1.work();
        System.out.println();
        cat1.meow();
        System.out.println();
        bird1.flap();
        System.out.println();
        chicken1.peck();
        System.out.println();
        sparrow1.fly();
        System.out.println();
    }
}