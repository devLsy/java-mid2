package generic.test.ex4;

public class MethodMain1 {

    public static void main(String[] args) {
        Integer i = 10;
        //반환 받으려면 다운 캐스팅 필요
        Object object = GenericMethod.objMethod(i);

        // 타입 인자(Type Argument) 명시적 전달
        System.out.println("명시적 타입 인자 전달");
        Integer result = GenericMethod.<Integer>genericMethod(i);
        System.out.println("result = " + result);
        //제네릭 메서드의 타입 상한선을 Number로 줘서 Number와 관련된 인수만 전달 가능
        Integer integerValue = GenericMethod.<Integer>numberMethod(10);
        Double doubleValue = GenericMethod.<Double>numberMethod(20.0);
        //Integer temp = GenericMethod.<Integer>numberMethod(new Object());     //컴파일 오류

        //아래처럼 타입은 생략가능하다. 매개변수로 넘기는 인자값으로 컴파일러가 추론해서 전달한다.
        Double doubleValue2 = GenericMethod.numberMethod(20.0);


    }
}
