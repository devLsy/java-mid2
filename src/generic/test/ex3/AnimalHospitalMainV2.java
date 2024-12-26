package generic.test.ex3;

import generic.animal.Cat;
import generic.animal.Dog;

public class AnimalHospitalMainV2 {

    public static void main(String[] args) {
        AnimalHospitalV2<Dog> dogHospital = new AnimalHospitalV2<>();
        AnimalHospitalV2<Cat> catHosPital = new AnimalHospitalV2<>();
        //전혀 상관 없는 타입을 타입 인자로 전달할 수 있는 문제점도 발생
        AnimalHospitalV2<Integer> integerHosPital = new AnimalHospitalV2<>();
        AnimalHospitalV2<Object> objectHosPital = new AnimalHospitalV2<>();

    }
}
