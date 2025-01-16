package collection.set.test;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class UniqueNamesTest2 {

    public static void main(String[] args) {
        // 중복 제거하되 입력 순서 유지
        Integer[] inputArr = {5, 30, 20, 20, 10, 10};
        //기존 for문 대체
        //List.of로 만든 list를 set에 세팅
        Set<Integer> set = new LinkedHashSet<>(List.of(inputArr));

        //배열을 리스트로
        List<Integer> Array2List = Arrays.asList(1, 2, 3);
        //리스트를 배열로
        List<Integer> list2Array = List.of(1, 2, 3);
        //자바 9 이상 사용 시 List.of() 권장
        

        for (Integer s : set) {
            System.out.println(s);
        }
    }
}
