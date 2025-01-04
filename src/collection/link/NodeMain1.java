package collection.link;

public class NodeMain1 {

    public static void main(String[] args) {
        //노드 생성하고 연결하기: A -> B -> C
        Node first = new Node("A");     //1번 째 노드의 참조값
        first.next = new Node("B");     //1번 째 노드의 next필드에 2번 째 노드의 참조값 저장
        first.next.next = new Node("C");    //2번 째 노드의 next필드에 3번 째 노드의 참조값 저장
        //아래는 npe발생(4번 째 주소값은 null임)
        System.out.println("4번 째 주소로 이동 = " + first.next.next.next.toString());
        //[first] ---> [Node("A") | next] ---> [Node("B") | next] ---> [Node("C") | null]
        System.out.println("모든 노드 탐색하기");
        Node x = first;
        while (x != null) {
            System.out.println(x.item);
            x = x.next;
        }
        /*
        간단하게 생각하면 노드는 데이터를 저장하고 다음 노드로 연결되는 주소값만 가지고 있는 구조고
        참조값만 있으면 계속 연결해서 이동 가능
        마치 기차를 연결한 것 처럼 1번 째 노드는 기차의 기관차 역할, 모든 칸은 기관차에서부터 연결됨
        next 필드: 다음 노드로의 연결 고리를 담당하며, 필드에 값이 있으면 계속 연결 가능
        null: 기차의 마지막 칸(연결할 곳이 없음)
        */
    }
}
