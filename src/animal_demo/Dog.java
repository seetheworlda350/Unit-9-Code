package animal_demo;

public class Dog extends Mammal{
    private String breed;
    public Dog(String name, int age, String breed, String furType){
        super(name, age, furType);
        this.breed = breed;
    }

    public void bark(){
        System.out.printf("%s barked", this.getName());
    }

}