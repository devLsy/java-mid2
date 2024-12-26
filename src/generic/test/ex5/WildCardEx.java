package generic.test.ex5;

import generic.animal.Animal;

public class WildCardEx {

    static <T> void printGenericV1(Box<T> box) {
        System.out.println("T = " + box.get());
    }
    
    //Box<Dog>, Box<Cat>, Box<Object> 다 들어올 수 있음
    static void printWildCardV1(Box<?> box) {
        System.out.println("? = " + box.get());
    }

    static <T extends Animal> void printGenericV2(Box<T> box){
        T t = box.get();
        System.out.println("이름 = " + t.getName());
    }

    static void printWildCardV2(Box<? extends Animal> box){
        Animal animal = box.get();
        System.out.println("이름 = " + animal.getName());
    }

    static <T extends Animal> T printAndReturnGeneric(Box<T> box){
        T t = box.get();
        System.out.println("이름 = " + t.getName());
        return t;
    }

    static Animal printAndReturnWildCard(Box<? extends Animal> box){
        Animal animal = box.get();
        System.out.println("이름 = " + animal.getName());
        return animal;
    }


}
