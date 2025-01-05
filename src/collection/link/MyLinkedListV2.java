package collection.link;

public class MyLinkedListV2 {

    private Node first;
    private int size = 0;

    //마지막 인덱스에 값을 추가
    public void add(Object e) {
        Node newNode = new Node(e);
        if(first == null) {
            first = newNode;
        } else {
            getLastNode().next = newNode;
        }
        size++;
    }

    //추가 코드
    public void add(int index, Object e) {
        Node newNode = new Node(e);
        //제일 처음
        if(index ==0) {
            newNode.next = first;
            first = newNode;
        } else {
            /*
            내 직전 노드(index -1)를 구한 뒤 직전 노드의 next값을 신규 노드의 next값으로 넣고
            직전 노드의 next가 신규 노드를 가리키도록 변경한다.
            ex1)
            신규로 만든 노드의 주소값은 x04다.
            직전 노드의 next는 x03 주소를 가리키고 있었다.
            신규로 만든 노드의 next가 x03을 가리키도록 변경한다.(newNode.next = prev.next)
            직전 노드의 next는 신규 노드주소값인 x04를 가리키도록 변경한다.(prev.next = newNode)
            ex2)
            0번 째 노드:둘리,
            1번 째 노드: 또치,
            2번 째 노드: 도우너
            둘리의 next는 또치를 가리키고 또치의 next는 도우너를 가리키고 도우너를 null을 가리킨다.
            이 때 2번 째 노드(현재 도우너 위치)에 희동이를 추가하려고 한다.
            희동이를 추가하려면 먼저 직전 노드인 또치를 알아야 한다.
            또치의 next는 도우너를 가리키고 있다.
            이제 또치의 next주소(도우너)를 신규 노드인 희동이의 next에 넣어서 희동이가 도우너를 가리키도록 한다.
            그 다음 또치의 next는 희동이를 가리키도록 하면 된다.
            */
            Node prev = getNode(index - 1);
            newNode.next = prev.next;
            //직전 노드의 next값을 신규 노드로 바꿔준다.
            prev.next = newNode;
        }
        size++;
    }

    private Node getLastNode() {
        Node x = first;
        while (x.next != null) {
            x = x.next;
        }
        return x;
    }

    public Object set(int index, Object e) {
        Node x = getNode(index);
        Object oldValue = x.item;
        x.item = e;
        return oldValue;
    }

    //추가 코드
    public Object remove(int index) {
        Node removeNode = getNode(index);
        Object removedItem = removeNode.item;
        //첫번 째가 가리키는게 내가 가리키던걸로 변경
        if(index == 0) {    
            first = removeNode.next;
        //내 직전 노드가 내가 가리키던걸로 변경    
        } else {
            Node prev = getNode(index - 1);
            prev.next = removeNode.next;
        }
        //내 아이템 null로, 내가 가리키던 주소도 null로
        removeNode.item = null;
        removeNode.next = null;
        size--;
        return removedItem;
    }

    public Object get(int index) {
        return getNode(index).item;
    }

    private Node getNode(int index) {
        Node x = first;
        for (int i = 0; i < index; i++) {
            x = x.next;
        }
        return x;
    }

    public int indexOf(Object e) {
        int index = 0;
        for (Node x = first; x != null; x = x.next) {
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
}
