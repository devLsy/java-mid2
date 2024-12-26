package generic.ex1;

//모두를 담을 수 있는 부모 Object
public class ObjectBox {

    private Object value;

    public Object get() {
        return value;
    }

    public void set(Object value) {
        this.value = value;
    }
}
