package generic.ex1;

public class BoxMain3 {

    public static void main(String[] args) {

        GenericBox<Integer> integerBox = new GenericBox<Integer>();     //생성 시점에 T의 타입이 결정됨
        integerBox.set(10);
        //integerBox.set("문자100");      Integer타입으로 생성 했기 때문에 문자열 넣을 경우 컴파일 에러 발생
        Integer integer = integerBox.get();
        System.out.println("integer = " + integer);

        GenericBox<String> stringBox = new GenericBox<String>();
        stringBox.set("Hello");
        //stringBox.set(100);       String타입이니까 숫자를 넣을 경우 당연히 컴파일 에러 발생
        String string = stringBox.get();
        System.out.println("string = " + string);

        //원하는 모든 타입 사용 가능
        GenericBox<Double> doubleBox = new GenericBox<Double>();
        doubleBox.set(3.14);
        Double doubleValue = doubleBox.get();
        System.out.println("doubleValue = " + doubleValue);

        //GenericBox<User> doubleBox = new GenericBox<User>();
        //primitive타입은 안됨(int, long 등)

        //타입 추론: 생성하는 제네릭 타입 생략 가능(컴파일러가 추론)
        GenericBox<Integer> integerBox2 = new GenericBox<>();   //우측의 <> 안에 타입을 생략할 수 있음
    }
}
