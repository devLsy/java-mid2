package generic.hero;

public class IronMan extends Avengers{
    
    public IronMan(String name, int age) {
        super(name, age);
    }

    @Override
    public void userSkill() {
        System.out.println("레이저 빔");
    }
}
