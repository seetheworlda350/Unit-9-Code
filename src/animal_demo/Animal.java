package animal_demo;

public class Animal {
    public String name;
    public int age;
    public Animal(String name, int age){
        this.name = name;
        this.age = age;
    }

    public void eat(){
        System.out.printf("%s just ate something.",this.name);
    }

    public String getName(){
        return name;
    }
}