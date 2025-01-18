package collection.utils;

import java.util.*;

public class EmptyListMain {

    public static void main(String[] args) {
        //빈 리스트 생성
        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new LinkedList<>();


        //빈 불변 리스트 생성
        List<Object> list3 = Collections.emptyList();       // 자바 5부터
        List<Integer> list4 = List.of();     //값을 안 넣으면 빈 불변 리스트(자바 9부터)

        System.out.println("list1 = " + list1.getClass());
        System.out.println("list2 = " + list2.getClass());
        System.out.println("list3 = " + list3.getClass());
        System.out.println("list4 = " + list4.getClass());

        List<Integer> list5 = Arrays.asList(1,2,3);
        List<Integer> list6 = List.of(1,2,3);

        Integer[] arr = {1,2,3,4,5};
        List<Integer> arrList = Arrays.asList(arr);

        //Arrays.asList로 만든 List는 사이즈를 변경할 수는 없지만 안에 들어 있는 데이터는 변경 가능하다.
        arrList.set(0, 100);
        //Arrays.asList는 내부에서 배열을 가지고 있다.
        //Integer[] arr = {1,2,3,4,5};
        //List<Integer> arrList = Arrays.asList(arr);
        //Arrays.asList로 List를 만들 때 인자로 전달받은 arr의 참조값을 내부에서 가지고 있다.
        //그래서 arrList의 데이터를 변경하면 참조하고 있는 내부 arr의 데이터도 변경이 된다.
        //List.of()는 인자로 넘어온 데이터를 기준으로 새로운 list로 만든다.
        //아래의 두 메서드는 똑같이 List타입을 반환하지만 살짝 다르다.
        //대부분의 경우 List.of()를 사용하는 걸 권장하고 Arrays.asList()는 어마어마하게 큰 데이터가 들어 있는 배열을 list로 전환할 때 효과적이라고 하지만 쓸 일이 거의 없다고 함
        System.out.println("arr = " + Arrays.toString(arr));
        System.out.println("arrList = " + arrList);
    }
}
