package collection.set.test;

import java.util.*;

public class UniqueNamesTest3 {

    public static void main(String[] args) {
        // 중복 제거와 데이터의 값 순서로 출력(정렬)
        Set<Integer> set = new TreeSet<>(List.of(30, 20, 20, 10, 10));

        for (Integer s : set) {
            System.out.println(s);
        }
    }
}
