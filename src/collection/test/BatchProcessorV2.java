package collection.test;

import collection.list.MyLinkedList;

public class BatchProcessorV2 {
    // LinkedList로 바꿔서 성능이 많이 개선되었음
    // 하지만 이 코드도 여전히 BatchProcessor클래스가 MyLinkedList에 직접적으로 의존하고 있어서 변경사항이 생기면 이 코드를 또 수정해야 함
    // 이를 다형성과 제네릭을 이용해서 개선해보겠음
    // 그 코드가 BatchProcessorV3임
    private final MyLinkedList<Integer> list = new MyLinkedList<>();
    //엄청 복잡한 로직이라고 가정
    public void logic(int size) {
        for (int i = 0; i < size; i++) {
            list.add(0, i);
        }
    }
}
