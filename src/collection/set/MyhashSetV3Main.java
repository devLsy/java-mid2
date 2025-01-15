package collection.set;

public class MyhashSetV3Main {

    public static void main(String[] args) {
        MySet<String> set = new MyHashSetV3(10);
        set.add("A");
        set.add("B");
        set.add("C");
        System.out.println("set = " + set);

        //검색
        String searchValue = "A";
        System.out.println("set.contains(searchValue) = " + set.contains(searchValue));

        MySet<Integer> set2 = new MyHashSetV3(10);
        set2.add(1);
        set2.add(2);
        set2.add(3);

        //검색
        Integer searchValue2 = 1;
        System.out.println("set2.contains(searchValue2) = " + set2.contains(searchValue2));
    }
}
