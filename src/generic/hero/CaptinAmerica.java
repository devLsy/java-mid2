package generic.hero;

public class CaptinAmerica extends Avengers{
    
    public CaptinAmerica(String name, int age) {
        super(name, age);
    }

    @Override
    public void userSkill() {
        System.out.println("방패 던지기");
    }
}
