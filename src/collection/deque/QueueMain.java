package collection.deque;

import java.util.ArrayDeque;
import java.util.Queue;

public class QueueMain {

    public static void main(String[] args) {
        // FIFO(선입선출)
        //Queue<Integer> queue = new LinkedList<Integer>();       //얘보다는 밑에가 빠르다고 함
        Queue<Integer> queue = new ArrayDeque<>();

        //데이터 추가
        queue.offer(1);
        queue.offer(2);
        queue.offer(3);
        System.out.println("queue = " + queue);

        //다음 꺼낼 데이터 확인(꺼내지 않고 단순 조회만)
        Integer peek = queue.peek();
        System.out.println("peek = " + peek);

        //데이터 꺼내기
        System.out.println("queue.poll() = " + queue.poll());
        System.out.println("queue.poll() = " + queue.poll());
        System.out.println("queue.poll() = " + queue.poll());
        System.out.println("queue = " + queue);
    }
}
