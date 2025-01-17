package collection.deque;

import java.util.Stack;

public class StackMain {

    public static void main(String[] args) {
        /*
        LIFO(후입 선출)
        stack은 내부에서 Vector라는 자료구조를 사용함 > 자바 1.0에 개발되었는데 지금은 사용되지 않고 하위 호환을 위해 존재
        지금은 더 빠른 자료구조가 많기에 Vector를 사용하는 Stack도 사용하지 않는 것을 권장, 대신 Deque를 사용 권장
        */
        Stack<Integer> stack = new Stack<>();

        stack.push(1);
        stack.push(2);
        stack.push(3);
        System.out.println("stack = " + stack);

        // 다음 꺼낼 요소 확인(꺼내지 않고 단순 조회만)
        System.out.println("stack.peek() = " + stack.peek());

        // 스택 요소 뽑기
        System.out.println("stack.pop() = " + stack.pop());
        System.out.println("stack.pop() = " + stack.pop());
        System.out.println("stack.pop() = " + stack.pop());
        System.out.println("stack = " + stack);
    }
}
