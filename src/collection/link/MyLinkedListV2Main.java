package collection.link;

public class MyLinkedListV2Main {

    public static void main(String[] args) {
        MyLinkedListV2 list = new MyLinkedListV2();
        //마지막에 추가   // O(n)
        list.add("a");
        list.add("b");
        list.add("c");
        System.out.println(list );

        //첫번 째 항목에 추가, 삭제
        System.out.println("첫번 째 항목에 추가");
        list.add(0, "d");   // O(1)
        System.out.println(list);

        //첫번 째 항목에 삭제
        System.out.println("첫번 째 항목에 삭제");
        list.remove(0);     // O(1)
        System.out.println(list);

        //중간 항목에 추가, 삭제
        System.out.println("중간 항목에 추가");
        list.add(1, "e");       // O(n)
        System.out.println(list);

        System.out.println("중간 항목에 삭제");
        list.remove(1);           // O(n)
        System.out.println(list);

        //배열리스트는 인덱스를 통해 추가나 삭제할 위치(O(1))는 빠르게 찾지만, 추가나 삭제 이후에 데이터를 한칸씩 밀어야 해서 이 부분이 O(n)으로 오래 걸린다.(빨리 찾지만 데이터 가공이 오래걸림)
        //반면 연결 리스트는 위치는 next.next..로 이동해야 해서 오래 걸리지만 추가나 삭제는 참조값만 변경하면 되므로 이 부분이 O(1)로 빠르다.(늦게 찾지만 데이터 가공이 빠름)
    }
}

