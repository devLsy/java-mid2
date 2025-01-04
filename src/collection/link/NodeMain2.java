package collection.link;

public class NodeMain2 {

    public static void main(String[] args) {
        //노드 생성하고 연결하기: A -> B -> C
        Node first = new Node("A");     //1번 째 노드의 참조값: x01
        first.next = new Node("B");     //1번 째 노드의 next필드에 2번 째 노드의 참조값 저장: x02
        first.next.next = new Node("C");    //2번 째 노드의 next필드에 3번 째 노드의 참조값 저장: x03

        System.out.println("연결된 노드 출력하기");
        System.out.println(first);
        System.out.println(first.next);
    }
}
