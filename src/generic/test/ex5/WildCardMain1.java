package generic.test.ex5;

import generic.animal.Animal;
import generic.animal.Cat;
import generic.animal.Dog;

public class WildCardMain1 {

    public static void main(String[] args) {
        Box<Object> objBox = new Box<>();
        Box<Dog> dogBox = new Box<>();
        Box<Cat> catBox = new Box<>();

        dogBox.set(new Dog("멍멍이1", 100));

        WildCardEx.printGenericV1(dogBox);
        WildCardEx.printWildCardV1(dogBox);


        WildCardEx.printGenericV2(dogBox);
        WildCardEx.printWildCardV2(dogBox);

        Dog dog = WildCardEx.printAndReturnGeneric(dogBox);
        Animal animal = WildCardEx.printAndReturnWildCard(dogBox);

        /*
        아래처럼 명확하게 반환 타입을 정하고 싶을 때는 제네릭 메서드, 그게 아니면 와일드 카드 사용 권장
        Dog dog = WildCardEx.printAndReturnGeneric(dogBox);

        //와일드 카드는 상위 타입을 반환하기 때문에 캐스팅을 해줘야 한다.
        Animal animal = WildCardEx.printAndReturnWildCard(dogBox);
        */
    }
}
