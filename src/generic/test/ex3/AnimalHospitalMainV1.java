package generic.test.ex3;

import generic.animal.Cat;
import generic.animal.Dog;

public class AnimalHospitalMainV1 {

    public static void main(String[] args) {
        AnimalHospitalV1 dogHospital = new AnimalHospitalV1();
        AnimalHospitalV1 catHospital = new AnimalHospitalV1();

        Dog dog = new Dog("멍멍이1", 100);
        Cat cat = new Cat("냐옹이1", 300);
        
        //개 병원
        dogHospital.set(dog);
        dogHospital.checkup();

        //고양이 병원
        catHospital.set(cat);
        catHospital.checkup();

        // 문제1: 개 병원에 고양이 전달해도 컴파일 에러가 없다.
        dogHospital.set(cat);       // 매개변수 체크 실패: 컴파일 오류가 발생하지 않는다.(부모 타입으로 다 받을 수 있기 때문에)

        // 문제2: 개 타입 반환
        dogHospital.set(dog);
        // 반환타입이 부모 타입인 Animal이라서 다운 캐스팅 필요
        Dog boggerDog = (Dog) dogHospital.bigger(new Dog("멍멍이2", 200));

        //코드 재사용성은 늘었지만 타입 안정성이 지켜지지 않고 다운 캐스팅 필요하게 되었음
    }
}
