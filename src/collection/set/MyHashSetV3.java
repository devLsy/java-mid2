package collection.set;


import java.util.Arrays;
import java.util.LinkedList;

public class MyHashSetV3<E> implements MySet<E> {

    static final int DEFAULT_INITIAL_CAPACITY = 16;
    private LinkedList<E>[] buckets;

    private int size = 0;
    private int capacity = DEFAULT_INITIAL_CAPACITY;

    public MyHashSetV3() {
        initBucket();
    }

    public MyHashSetV3(int capacity) {
        this.capacity = capacity;
        initBucket();
    }

    private void initBucket() {
        buckets = new LinkedList[capacity];
        for (int i = 0; i < capacity; i++) {
            buckets[i] = new LinkedList<>();
        }
    }

    public boolean add(E value) {
        int hashIndex = hashIndex(value);
        LinkedList<E> bucket = buckets[hashIndex];
        if(bucket.contains(value)) {
            return false;
        }

        bucket.add(value);
        size++;
        return true;
    }

    public boolean contains(E searchValue) {
        int hashIndex = hashIndex(searchValue);
        LinkedList<E> bucket = buckets[hashIndex];
        return bucket.contains(searchValue);
    }

    public boolean remove(E value) {
        int hashIndex = hashIndex(value);
        LinkedList<E> bucket = buckets[hashIndex];
        // 버킷안의 값을 지워야 해서 int형이 아닌 object타입으로 넘겨야 해서 Wrapper 타입으로 변경
        // Linked안의 값을 지워야 함, int형을 넘기면 인덱스의 있는 값을 지움 
        boolean result = bucket.remove(value);
        if(result) {
            size--;
            return true;
        } else {
            return false;
        }
    }

    public int getSize() {
        return size;
    }

    private int hashIndex(Object value) {
        // hashCode가 마이너스인 경우 절대값으로
        return Math.abs(value.hashCode()) % capacity;
    }

    @Override
    public String toString() {
        return "MyHashSetV3{" +
                "buckets=" + Arrays.toString(buckets) +
                ", size=" + size +
                ", capacity=" + capacity +
                '}';
    }
}
