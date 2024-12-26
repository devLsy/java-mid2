package generic.ex1;

public class BoxMain2 {

    public static void main(String[] args) {
        //모든 객체의 타입을 받을 수 있는 최상위 객체인 Object를 이용(다형성)해서 중복은 제거 되었으나 타입 안정성 문제가 발생(이게 더 위험!!!)
        ObjectBox intergerBox = new ObjectBox();
        intergerBox.set(10);
        //다운 캐스팅
        Integer integer = (Integer) intergerBox.get();
        System.out.println("integer = " + integer);

        ObjectBox stringBox = new ObjectBox();
        stringBox.set("hello");
        //다운 캐스팅
        String string = (String) stringBox.get();
        System.out.println("string = " + string);

        //잘못된 타입의 인수 전달 시(당연히 컴파일 에러는 없다.)
        intergerBox.set("문자100");
        /*
        ..생략
        예시니까 단순히 위에서 세팅하고 아래에서 꺼내지만 실제는 다른 클래스끼리 사용하거나.. 코드가 엄청 길거나 할 수 있기 때문에 당연히 실수를 할 확률이 매우 높다.
        타입 안정성 문제 발생(뭐가 들어올지 몰라)
        */
        Integer result = (Integer) intergerBox.get();  // String -> Integer 캐스팅 예외 발생
        System.out.println("result = " + result);
    }
}
