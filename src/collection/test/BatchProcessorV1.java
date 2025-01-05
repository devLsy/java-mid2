package collection.test;

import collection.list.MyArrayList;

public class BatchProcessorV1 {
    // MyArrayList에 직접 의존(bad)
    private final MyArrayList<Integer> list = new MyArrayList<>();
    //엄청 복잡한 로직이라고 가정
    public void logic(int size) {
        //업무를 하다보니 리스트의 앞부분에 데이터를 삽입하는 경우가 많아 배열리스트보다 Linkedlist가 더 낫겠다느 판단이 들어서 코드를 고쳐야 겠다고 마음을 먹음
        //그래서 코드를 개선하게 되고 그게 BatchProcessorV2가 됨
        for (int i = 0; i < size; i++) {
            list.add(0, i);
        }
    }
}
