package animal_demo;

public class Sparrow extends Bird{

    private String songType;

    public Sparrow(String name, int age, String featherType, String songType){
        super(name, age, featherType);
    }

    public void fly(){
        System.out.printf("%s is flying", this.getName());
    }
}