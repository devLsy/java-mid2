package collection.array;

import java.util.Arrays;

//제네릭 타입으로 선언
public class MyArrayListV4<E> {

    private static final int DEFUALT_CAPACITY = 5;

    private Object[] elementData;
    private int size = 0;

    //타입 이레이저 때문에 new 키워드에 E를 못 쓴다.(컴파일 단계에서만 타입 매개변수 사용 가능하고 런타임에는 사라진다.)
    public MyArrayListV4() {
        elementData = new Object[DEFUALT_CAPACITY];
    }

    public MyArrayListV4(int initialCapacity) {
        elementData = new Object[initialCapacity];
    }

    public int size() {
        return size;
    }

    public void add(E e) {
        //코드 추가
        if(size == elementData.length) {
            grow();
        }
        elementData[size] = e;
        size++;
    }

    /*
    누군가 고의적으로? 아래처럼 문자열만 받는 메서드를 넣는 경우 이 메서드를 사용하는 곳에서 매개변수 타입인 E의 인자로 Integer를 넣어서 생성한 경우
    ClassCastException 발생할 수 있음
    그래서 반드시 들어오는 타입을 제네릭 타입으로 해줘야 한다.
    클래스 설계를 잘 해야 함
    */
//    public void addBad(String str) {
//        elementData[size] = str;
//        size++;
//    }

    //코드 추가
    public void add(int index, E e) {
        if(size == elementData.length) {
            grow();
        }
        //데이터 이동
        shiftRightFrom(index);
        elementData[index] = e;
        size++;
    }

    //코드 추가, 요소의 마지막부터 index까지 오른쪽으로 밀기
    private void shiftRightFrom(int index) {
        for (int i = size; i > index; i--) {
            elementData[i] = elementData[i - 1];
        }
    }

    //코드 추가
    private void grow() {
        int oldCapacity = elementData.length;
        int newCapacity = oldCapacity * 2;
        //배열을 새로 만들고, 기존 배열을 새로운 배열에 복사
        /*
        Object[] newArr = new Object[newCapacity];
        for (int i = 0; i < elementData.length; i++) {
            newArr[i] = elementData[i];
        }
        */
        elementData = Arrays.copyOf(elementData, newCapacity);
    }

    @SuppressWarnings("unchecked")
    public E get(int index) {
        return (E) elementData[index];
    }

    public E set(int index, E element) {
        E oldValue = get(index);
        elementData[index] = element;
        return oldValue;
    }

    //코드 추가
    public E remove(int index) {
        E oldValue = get(index);
        shiftLeftFrom(index);

        size--;
        elementData[size] = null;
        return oldValue;
    }

    //코드 추가, 요소의 index부터 마지막까지 왼쪽으로 밀기
    private void shiftLeftFrom(int index) {
        for (int i = index; i < size - 1; i++) {
            elementData[i] = elementData[i + 1];
        }
    }

    public int indexOf(E o) {
        for (int i = 0; i < size; i++) {
            if(o.equals(elementData[i])) {
                return i;
            }
        }
        return -1;
    }

    public String toString() {
        return Arrays.toString(Arrays.copyOf(elementData, size)) +
                " size= " + size + ", capacity= " + elementData.length;
    }
}
