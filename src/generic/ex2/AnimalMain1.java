package generic.ex2;

import generic.animal.Animal;
import generic.animal.Cat;
import generic.animal.Dog;

public class AnimalMain1 {

    public static void main(String[] args) {
        Animal animal = new Animal("동물", 0);
        Dog dog = new Dog("멍멍이", 100);
        Cat cat = new Cat("냐옹이", 50);

        //개 전용 박스
        Box<Dog> dogBox = new Box<>();
        dogBox.set(dog);
        //dogBox.set(cat);      //당연히 고양이는 못 넣음
        Dog findDog = dogBox.get();
        System.out.println("findDog = " + findDog);

        //고양이 전용 박스
        Box<Cat> catBox = new Box<>();
        catBox.set(cat);
        Cat findCat = catBox.get();
        System.out.println("findCat = " + findCat);

        //동물 박스
        Box<Animal> animalBox = new Box<>();
        animalBox.set(animal);
        Animal findAnimal = animalBox.get();
        System.out.println("findAnimal = " + findAnimal);
    }
}
