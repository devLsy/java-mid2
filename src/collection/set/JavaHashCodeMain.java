package collection.set;

import collection.set.member.Member;

public class JavaHashCodeMain {

    public static void main(String[] args) {
        //Object의 기본 hashCode는 객체의 참조값을 기반으로 생성
        Object obj1 = new Object();
        Object obj2 = new Object();
        System.out.println("obj1.hashCode() = " + obj1.hashCode());
        System.out.println("obj2.hashCode() = " + obj2.hashCode());
        // 각 클래스마다 hashCode를 이미 오버라이딩 해두었다.
        Integer i = 10;
        String strA = "A";
        String strAB = "AB";

        System.out.println("i.hashCode() = " + i.hashCode());
        System.out.println("'A'.hashCode() = " + strA.hashCode());
        System.out.println("'AB'.hashCode() = " + strAB.hashCode());

        //hashCode는 마이너스 값이 들어올 수 있다.
        System.out.println("-1.hashCode() = " + Integer.valueOf(-1).hashCode());

        //둘은 같을까? 다를까?(내가 원하는 건 값이 같으면 같은 거다.)
        //인스턴스는 다르지만 equals는 같다.
        Member member1 = new Member("idA");
        Member member2 = new Member("idA");

        //equals, hashCode를 오버라이드 하지 않은 경우와, 한 경우를 비교
        //아래는 false(참조값을 비교)
        System.out.println("(member1 == member2) = " + (member1 == member2));
        //아래는 true(equals를 오버라이드 했기 떄문에 값을 비교 )
        System.out.println("(member1 equals member2) = " + (member1.equals(member2)));
        //두 인스턴스의 해시코드(Member클래스에서 오버라이드 했기 때문에 같다.)
        //만약에 hashCode 오버라이드를 지우면? 다르게 나온다.
        System.out.println("member1.hashCode() = " + member1.hashCode());
        System.out.println("member2.hashCode() = " + member2.hashCode());

    }
}
