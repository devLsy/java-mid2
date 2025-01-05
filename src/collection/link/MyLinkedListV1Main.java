package collection.link;

public class MyLinkedListV1Main {

    public static void main(String[] args) {
        MyLinkedListV1 list = new MyLinkedListV1();
        System.out.println("==데이터 추가==");   //최초
        System.out.println(list);

        //마지막 노드를 찾는데는 O(n)이지만 마지막 노드에 새로운 노드를 추가하는데 O(1)이 걸린다. 그래서 O(n)
        list.add("a");
        System.out.println(list);
        list.add("b");
        System.out.println(list);
        list.add("c");
        System.out.println(list);

        System.out.println("==기능 사용==");
        System.out.println("list.size(): " + list.size());
        System.out.println("list.get(1): " + list.get(1));      // O(n), 배열은 O(1) >> 특정위치의 데이터를 찾는 건 배열보다 성능이 떨어짐
        System.out.println("list.indexOf('c'): " + list.indexOf("c"));
        System.out.println("list.set(2, 'z'), oldValue: " + list.set(2, "z"));  // 특정 위치의 노드를 찾는데 O(n)이 걸린다.
        System.out.println(list);

        System.out.println("==범위 초과==");
        list.add("d");
        System.out.println(list);
        list.add("e");
        System.out.println(list);
        list.add("f");
        System.out.println(list);

        //연결리스트는 배열에 비해 마지막에 데이터를 추가하고 특정위치의 데이터를 찾는 건 루프를 돌아야 되서 시간이 오래걸린다. O(n)
    }
}
