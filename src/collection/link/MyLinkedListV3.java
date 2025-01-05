package collection.link;

public class MyLinkedListV3<E> {

    private Node<E> first;
    private int size = 0;

    //마지막 인덱스에 값을 추가
    public void add(E e) {
        Node<E> newNode = new Node<>(e);
        if(first == null) {
            first = newNode;
        } else {
            Node<E> lastNode = getLastNode();
            lastNode.next = newNode;
        }
        size++;
    }

    //추가 코드
    public void add(int index, E e) {
        Node<E> newNode = new Node<>(e);
        //제일 처음
        if(index ==0) {
            newNode.next = first;
            first = newNode;
        } else {
            Node<E> prev = getNode(index - 1);
            newNode.next = prev.next;
            //직전 노드의 next값을 신규 노드로 바꿔준다.
            prev.next = newNode;
        }
        size++;
    }

    private Node<E> getLastNode() {
        Node<E> x = first;
        while (x.next != null) {
            x = x.next;
        }
        return x;
    }

    public E set(int index, E e) {
        Node<E> x = getNode(index);
        E oldValue = x.item;
        x.item = e;
        return oldValue;
    }

    //추가 코드
    public E remove(int index) {
        Node<E> removeNode = getNode(index);
        E removedItem = removeNode.item;
        //첫번 째가 가리키는게 내가 가리키던걸로 변경
        if(index == 0) {    
            first = removeNode.next;
        //내 직전 노드가 내가 가리키던걸로 변경    
        } else {
            Node<E> prev = getNode(index - 1);
            prev.next = removeNode.next;
        }
        //내 아이템 null로, 내가 가리키던 주소도 null로
        removeNode.item = null;
        removeNode.next = null;
        size--;
        return removedItem;
    }

    public E get(int index) {
        Node<E> node = getNode(index);
        return node.item;
    }

    private Node<E> getNode(int index) {
        Node<E> x = first;
        for (int i = 0; i < index; i++) {
            x = x.next;
        }
        return x;
    }

    public int indexOf(E e) {
        int index = 0;
        for (Node<E> x = first; x != null; x = x.next) {
            if(e.equals(x.item)) {
                return index;
            }
            index++;
        }
        return -1;
    }

    public int size() {
        return size;
    }

    @Override
    public String toString() {
        return "MyLinkedListV1{" +
                "first=" + first +
                ", size=" + size +
                '}';
    }

    //중첩 클래스
    private static class Node<E> {

        E item;
        Node<E> next;

        public Node(E item) {
            this.item = item;
        }
        //[A -> B -> C]
        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            Node<E> x = this;
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
}
