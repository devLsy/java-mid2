package collection.test;

import collection.list.MyList;

public class BatchProcessorV3 {

    /*
    MyArrayList와 MyLinkedList의 상위 타입인 MyList를 가지고 있고(추상적인 인터페이스에 의존)
    생성자를 통해서 외부에서 해당 인스턴스를 주입받음
    MyArrayList와 MyLinkedList는 둘 다 MyList를 구현하고 있어서 아래처럼 MyList타입으로 받을 수 있음
    MyList = new MyArrayList;
    MyList = new MyLinkedList;
    그러면 이 코드는 전혀 고칠게 없고 사용하는 쪽에서 생성자에서 MyArrayList나 MyLinkedList만 만들어서 넣어주면 됨
    또 추가로 MyList를 구현하는 다른 자료구조가 필요하면 MyList를 구현한 클래스만 추가해서 외부에서 생성자로 넣어주면 끝난다.
    이 코드를 보니 자연스럽게 스프링의 생성자 의존성 주입이 연상되었다.
    */
    private final MyList<Integer> list;
    
    public BatchProcessorV3(MyList<Integer> list) {
        this.list = list;
    }
    //엄청 복잡한 로직이라고 가정
    public void logic(int size) {
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < size; i++) {
            list.add(0, i);
        }
        long endTime = System.currentTimeMillis();
        System.out.println("크기: " + size + ", 계산시간: " + (endTime - startTime) + "ms");
    }
}
