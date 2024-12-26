package generic.hero;

//부모 클래스
public class Avengers {

    private String name;
    private int age;

    public Avengers(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void userSkill() {
        System.out.println("기술 사용~");
    }

    @Override
    public String toString() {
        return "Avengers{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
