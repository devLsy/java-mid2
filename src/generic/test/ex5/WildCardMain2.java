package generic.test.ex5;

import generic.animal.Animal;
import generic.animal.Cat;
import generic.animal.Dog;

public class WildCardMain2 {

    public static void main(String[] args) {
        Box<Object> objBox = new Box<>();
        Box<Animal> animalBox = new Box<>();
        Box<Dog> dogBox = new Box<>();
        Box<Cat> catBox = new Box<>();
        // Animal 포함 상위 타입만 전달 가능
        writeBox(objBox);
        writeBox(animalBox);
        //writeBox(dogBox);   //컴파일 오류

        Animal animal = animalBox.get();
        System.out.println("animal = " + animal);
    }
    // 하한선(?값이 Animal보다 상위여야 한다.)//하한 와일드 카드는 와일드카드에만 사용 가능
    static void writeBox(Box<? super Animal> box) {
        box.set(new Dog("멍멍이", 100));
    }
}
