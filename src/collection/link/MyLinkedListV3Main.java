package collection.link;

public class MyLinkedListV3Main {

    public static void main(String[] args) {
        MyLinkedListV3<String> stringList = new MyLinkedListV3<>();
        //마지막에 추가   // O(n)
        stringList.add("a");
        stringList.add("b");
        stringList.add("c");
        //list.add(1);      //타입 안정성 확보
        System.out.println(stringList);
        String string = stringList.get(0);
        System.out.println("string = " + string);

        MyLinkedListV3<Integer> intList = new MyLinkedListV3<>();
        intList.add(1);
        intList.add(2);
        intList.add(3);
        //intList.add("c");     //타입 안정성 확보
        Integer integer = intList.get(0);
        System.out.println("integer = " + integer);
    }
}

