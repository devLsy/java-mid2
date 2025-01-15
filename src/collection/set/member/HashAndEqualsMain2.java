package collection.set.member;

import collection.set.MyHashSetV2;

public class HashAndEqualsMain2 {

    public static void main(String[] args) {
        //id가 같은 회원이라 논리적으로 같다고 하고 싶은 경우
        //hashCode만 재정의한 상태
        MyHashSetV2 set = new MyHashSetV2(10);
        MemberOnlyHash m1 = new MemberOnlyHash("A");
        MemberOnlyHash m2 = new MemberOnlyHash("A");
        //hashcode는 동일하게 나옴
        System.out.println("m1.hashCode() = " + m1.hashCode());
        System.out.println("m2.hashCode() = " + m2.hashCode());
        System.out.println("m1.equals(m2) = " + m1.equals(m2));
        
        //참조값이 다르게 나옴
        System.out.println("System.identityHashCode(m1) = " + System.identityHashCode(m1));
        System.out.println("System.identityHashCode(m2) = " + System.identityHashCode(m2));
        //add를 할 때 contains로 값을 비교하는데 이 때 equals를 재정의하지 않아서 object의 equals를 쓰기 때문에 참조값이 다르니까 false가 나와서 논리적으로 같지만
        //참조값이 달라서 set에 저장을 해버린다.(비교에 실패)
        set.add(m1);
        set.add(m2);

        System.out.println(set);
        //검색은 여전히 실패한다.(찾을 때도 마찬가지다. equals로 비교가 실패함)
        MemberOnlyHash searchValue = new MemberOnlyHash("A");
        System.out.println("searchValue.hashCode() = " + searchValue.hashCode());
        System.out.println("set.contains(searchValue) = " + set.contains(searchValue));

    }
}
