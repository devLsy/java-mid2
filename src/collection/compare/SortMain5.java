package collection.compare;

import java.util.TreeSet;

public class SortMain5 {

    public static void main(String[] args) {
        //트리구조에서 정렬
        MyUser myUser1 = new MyUser("a", 30);
        MyUser myUser2 = new MyUser("b", 20);
        MyUser myUser3 = new MyUser("c", 10);

        TreeSet<MyUser> treeSet1 = new TreeSet<>();
        treeSet1.add(myUser1);
        treeSet1.add(myUser2);
        treeSet1.add(myUser3);
        /*
        이 친구는 트리셋에 들어가는 순간 정렬이 되어 있다.
        트리구조는 트리에 데이터를 넣을 때부터 정렬이 되어 있어야 한다.(이진트리구조의 경우 값을 비교해서 작은 값이 왼쪽, 큰 값이 오른쪽에 저장되기 때문에 )
        */
        System.out.println("Comparable 기본 정렬");
        System.out.println(treeSet1);
        //내가 만든 정렬기준으로 정렬하려면 트리셋을 생성할 때 생성자의 인자로 비교자를 넣어줘야 함
        TreeSet<MyUser> treeSet2 = new TreeSet<>(new IdComparator());
        treeSet2.add(myUser1);
        treeSet2.add(myUser2);
        treeSet2.add(myUser3);

        System.out.println("Id Comparable 정렬");
        System.out.println(treeSet2);


    }
}
