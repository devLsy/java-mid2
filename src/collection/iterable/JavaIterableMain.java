package collection.iterable;

import java.util.*;

public class JavaIterableMain {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        printAll(list.iterator());
        foreach(list);

        Set<Integer> set = new HashSet<>();
        set.add(1);
        set.add(2);
        set.add(3);
        printAll(set.iterator());
        foreach(set);
    }

    private static void printAll(Iterator<Integer> iterator) {
        System.out.println("iterator = " + iterator.getClass());
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }

    //Iterable타입으로 받으면 Iterable을 구현하는 모든 구현체에서 사용할 수 있다.(다형성)
    //컬렉션 프레임워크는 상위에 Iterable 인터페이스를 구현하고 있기 때문에 가능하다.
    private static void foreach(Iterable<Integer> iterable) {
        System.out.println("iterable.getClass() = " + iterable.getClass());
        for (Integer integer : iterable) {
            System.out.println("integer = " + integer);
        }
    }
}
