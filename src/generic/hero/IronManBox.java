package generic.hero;

//아이언맨 전용 박스
public class IronManBox {
    
    private IronMan ironMan;

    public IronMan get() {
        return ironMan;
    }

    public void set(IronMan ironMan) {
        this.ironMan = ironMan;
    }

    public void printInfo() {
        System.out.println("영웅 이름: " + ironMan.getName());
        System.out.println("영웅 나이: " + ironMan.getAge());
    }

    public IronMan bigger(IronMan target) {
        return ironMan.getAge() > target.getAge() ? ironMan : target;
    }
}
