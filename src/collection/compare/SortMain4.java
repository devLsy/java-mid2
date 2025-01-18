package collection.compare;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class SortMain4 {

    //순서가 있는 List 같은 자료구조에서 정렬 사용
    public static void main(String[] args) {
        MyUser myUser1 = new MyUser("a", 30);
        MyUser myUser2 = new MyUser("b", 20);
        MyUser myUser3 = new MyUser("c", 10);

        List<MyUser> list = new LinkedList<>();
        list.add(myUser1);
        list.add(myUser2);
        list.add(myUser3);

        System.out.println("기본 데이터");
        System.out.println(list);

        System.out.println("Comparable 기본 정렬"); //내가 만든 정렬 기준 적용
        list.sort(null);
        System.out.println(list);

        System.out.println("Id Comparable 정렬");
        list.sort(new IdComparator());
        System.out.println(list);

        System.out.println("Id Comparable 내림차순 정렬");
        list.sort(new IdComparator().reversed());
        System.out.println(list);

        System.out.println("Collections util 사용");
        Collections.sort(list);
//        Collections.sort(list.reversed());
        System.out.println(list);
        //list.sort를 권장(객체 스스로 정렬 메서드를 가지고 있기 때문에)
    }
}
