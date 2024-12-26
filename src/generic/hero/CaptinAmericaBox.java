package generic.hero;

//캡아 전용 박스
public class CaptinAmericaBox {

    private CaptinAmerica captinAmerica;

    public CaptinAmerica get() {
        return captinAmerica;
    }

    public void set(CaptinAmerica captinAmerica) {
        this.captinAmerica = captinAmerica;
    }

    public void printInfo() {
        System.out.println("영웅 이름: " + captinAmerica.getName());
        System.out.println("영웅 나이: " + captinAmerica.getAge());
    }

    public CaptinAmerica bigger(CaptinAmerica target) {
        return captinAmerica.getAge() > target.getAge() ? captinAmerica : target;
    }


}
