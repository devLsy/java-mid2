package collection.set.member;

import collection.set.MyHashSetV2;

public class HashAndEqualsMain3 {

    public static void main(String[] args) {
        //id가 같은 회원이라 논리적으로 같다고 하고 싶은 경우
        //hashCode & equals 둘 다 재정의
        MyHashSetV2 set = new MyHashSetV2(10);
        Member m1 = new Member("A");
        Member m2 = new Member("A");
        //hashcode 동일하게 나옴
        System.out.println("m1.hashCode() = " + m1.hashCode());
        System.out.println("m2.hashCode() = " + m2.hashCode());
        System.out.println("m1.equals(m2) = " + m1.equals(m2));
        
        //1건만 저장됨
        set.add(m1);
        set.add(m2);

        System.out.println(set);
        //검색 성공
        Member searchValue = new Member("A");
        System.out.println("searchValue.hashCode() = " + searchValue.hashCode());
        System.out.println("set.contains(searchValue) = " + set.contains(searchValue));

    }
}
