package animal_demo;

public class Poodle extends Dog{
    private int curlyRanking;
    public Poodle(String name, int age, String furType, int curlyRanking){
        super(name,age,"Poodle",furType);
        this.curlyRanking = curlyRanking;
    }

    public void prance(){
        System.out.printf("%s pranced", this.getName());
    }
}