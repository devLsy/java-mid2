package collection.link;

public class Node {

    //예제의 단순화를 위해 디폴트 접근제어자로 선언
    //노드에 넣을 아이템
    Object item;
    //다음 노드를 가리키는 참조값
    Node next;

    public Node(Object item) {
        this.item = item;
    }

    /*
    //IDE 생성 toString()
    @Override
    public String toString() {
        return "Node{" +
                "item=" + item +
                ", next=" + next +
                '}';
    }
    */

    //사용자 정의 toString()
    //[A -> B -> C]
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        Node x = this;
        sb.append("[");
        while (x != null) {
            sb.append(x.item);
            if(x.next != null) sb.append("->");
            x = x.next;
        }
        sb.append("]");
        return sb.toString();
    }
}
