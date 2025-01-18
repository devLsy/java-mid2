package collection.utils;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ImmutableMain {

    public static void main(String[] args) {
        //불변 리스트 생성
        List<Integer> list = List.of(1, 2, 3);

        //가변 리스트로 전환
        ArrayList<Integer> mutableList = new ArrayList<>(list);
        mutableList.add(4);             // 당연히 추가가 된다.
        System.out.println("mutableList = " + mutableList);
        System.out.println("mutableList.getClass() = " + mutableList.getClass());

        //다시 불변 리스트로
        List<Integer> unmodifiableList = Collections.unmodifiableList(mutableList);
        System.out.println("unmodifiableList = " + unmodifiableList);
        System.out.println("unmodifiableList.getClass() = " + unmodifiableList.getClass());
        //unmodifiableList.add(5);            // 예외 발생
    }
}
