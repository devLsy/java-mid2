package collection.test;

import collection.list.MyArrayList;
import collection.list.MyLinkedList;
import collection.list.MyList;

public class BatchProcessorMain {

    public static void main(String[] args) {
        //MyArrayList를 사용, 상위타입으로 받음
        MyList<Integer> myArrayList =  new MyArrayList<>();
        BatchProcessorV3 processor1 = new BatchProcessorV3(myArrayList);
        //ArrayList는 데이터를 찾는 건 빠르지만 넣고 나서 데이터를 미는 연산이 필요하니까 느리다.
        processor1.logic(90_000);  // 결과: 5969ms

        //MyLinkedList를 사용, 상위타입으로 받음
        MyList<Integer> myLinkedList =  new MyLinkedList<>();
        BatchProcessorV3 processor2 = new BatchProcessorV3(myLinkedList);
        //LinkedList니까 앞에 데이터를 넣는 경우는 참조값만 변경하면 되고 실제 데이터의 정렬은 없으니까 속도가 ArrayList에 비해서 훨씬 빠르다.
        processor2.logic(90_000);   // 결과: 3ms
    }
}
