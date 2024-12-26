package generic.test.ex3;

import generic.animal.Cat;
import generic.animal.Dog;

public class AnimalHospitalMainV3 {

    public static void main(String[] args) {
        AnimalHospitalV3<Dog> dogHospital = new AnimalHospitalV3<>();
        AnimalHospitalV3<Cat> catHosPital = new AnimalHospitalV3<>();
        //Animal과 관련 없는 타입은 컴파일 에러
        //AnimalHospitalV3<Integer> integerHosPital = new AnimalHospitalV3<>();
        //AnimalHospitalV3<Object> objectHosPital = new AnimalHospitalV3<>();

        Dog dog = new Dog("멍멍이1", 100);
        Cat cat = new Cat("냐옹이1", 300);

        //개 병원
        dogHospital.set(dog);
        dogHospital.checkup();

        //고양이 병원
        catHosPital.set(cat);
        catHosPital.checkup();

        // 문제1: 개 병원에 고양이 전달
        //dogHospital.set(cat);       // 매개변수 체크 성공: 컴파일 오류 발생

        // 문제2: 개 타입 반환
        dogHospital.set(dog);
        //캐스팅 불필요
        Dog biggerDog = dogHospital.bigger(new Dog("멍멍이2", 200));
        System.out.println("biggerDog = " + biggerDog);
        
        // 타입 안정성 해결, 재사용 문제도 해결
    }
}
