package collection.utils;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionsSortMain {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<Integer>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        Integer max = Collections.max(list);
        Integer min = Collections.min(list);

        System.out.println("max = " + max);
        System.out.println("min = " + min);

        System.out.println("list = " + list);
        //랜덤하게 정렬(할 때마다 결과가 달라짐)
        Collections.shuffle(list);
        System.out.println("list = " + list);
        Collections.sort(list);     //list.sort() 사용 권장, 여기서는 이런 것도 있다고 알려주는 의도
        System.out.println("list = " + list);
        Collections.reverse(list);  //마찬가지
        System.out.println("list = " + list);
    }
}
