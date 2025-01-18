package collection.iterable;

import java.util.Iterator;

public class MyArrayMain {

    public static void main(String[] args) {
        MyArray myArray = new MyArray(new int[]{1, 2, 3, 4});
        Iterator<Integer> iterator = myArray.iterator();
        System.out.println("iterator 사용");
        while (iterator.hasNext()) {
            Integer value = iterator.next();
            System.out.println("value = " + value);
        }

        //추가(향상된 for문 사용 가능) > Iterable 구현해야 가능, 물론 제대로 사용하려면 iterator도 구현해야 함
        System.out.println("for-each 사용");
        for (Integer value : myArray) {
            System.out.println("value = " + value);
        }
        //위처럼 작성하면 컴파일 시점에 while(iterator.hasNext())...생략으로 바꿔서 실행된다고 한다.
    }
}
