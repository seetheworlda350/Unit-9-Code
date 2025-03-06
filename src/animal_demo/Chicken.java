package animal_demo;

public class Chicken extends Bird{

    private boolean hasGobble;
    public Chicken(String name, int age, String featherType, boolean hasGobble){
        super(name, age, featherType);
    }

    public void peck(){
        System.out.printf("%s just pecked", this.getName());
    }

}