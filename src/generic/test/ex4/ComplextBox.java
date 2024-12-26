package generic.test.ex4;

import generic.animal.Animal;
//제네릭 타입
public class ComplextBox<T extends Animal> {

    private T animal;

    public void set(T animal) {
        this.animal = animal;
    }
    //제네릭 메서드(여기서의 T는 제네릭 타입 매개변수인 T와 관련이 없음)
    public <T> T printAndReturn(T t) {
        System.out.println("animal.className: " + animal.getClass().getName());
        System.out.println("t.className: " + t.getClass().getName());
        //t.getName();  // 호출 안됨, 제네릭 메서드의 T는 extends Animal타입이 아니기 때문이다.
        return t;
    }
    /*
    예제 때문에 같은 타입 매개변수명을 T로 제네릭 타입과 제네릭 메서드 둘 다 T로 했지만 이렇게 모호하게 하면 안되고
    제네릭 타입(클래스 영역)은 T, 제네릭 메서드는 Z 이런 식으로 구분해야 한다.
    */
}
