package generic.ex1;

//제네릭 사용
public class GenericBox<T> {

    private T value;

    public void set(T value) {
        this.value = value;
    }

    public T get() {
        return value;
    }
}
