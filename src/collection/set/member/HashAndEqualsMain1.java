package collection.set.member;

import collection.set.MyHashSetV2;

public class HashAndEqualsMain1 {

    public static void main(String[] args) {
        MyHashSetV2 set = new MyHashSetV2(10);
        //id가 같은 회원이라 논리적으로 같다고 하고 싶은 경우
        //equals와 hashCode 둘 다 재정의 안한 상태
        MemberNoHashNoEq m1 = new MemberNoHashNoEq("A");
        MemberNoHashNoEq m2 = new MemberNoHashNoEq("A");
        //hashcode출력하면 다른값임
        System.out.println("m1.hashCode() = " + m1.hashCode());
        System.out.println("m2.hashCode() = " + m2.hashCode());
        //equals 오버라이드 안한 상태면 참조값이 다르니까 false가 나옴
        System.out.println("m1.equals(m2) = " + m1.equals(m2));

        set.add(m1);
        set.add(m2);
        //출력해보면 hashcode가 다르니까 다른 인덱스에 들어가 있다.
        //심지어 같은 데이터가 들어가 있다.
        System.out.println(set);

        //검색 실패
        MemberNoHashNoEq searchValue = new MemberNoHashNoEq("A");
        System.out.println("searchValue.hashCode() = " + searchValue.hashCode());
        System.out.println("set.contains(searchValue) = " + set.contains(searchValue));

    }
}
