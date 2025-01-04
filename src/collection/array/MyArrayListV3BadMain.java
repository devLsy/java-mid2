package collection.array;

public class MyArrayListV3BadMain {

    public static void main(String[] args) {
        //언제 터질지 모르는 폭탄 같은 코드
        MyArrayListV3 numberList = new MyArrayListV3();
        // 숫자만 입력하기를 기대
        numberList.add(1);
        numberList.add(2);
        numberList.add("문자3");  //모르고 문자를 입력해도 아무 문제가 없음(Object 타입)
        System.out.println(numberList);

        // Object를 반환하므로 다운 캐스팅 필요
        Integer num1 = (Integer) numberList.get(0);
        Integer num2 = (Integer) numberList.get(1);
        //당연히 2번 째 인덱스에 숫자가 있겠거니 해서 Integer로 캐스팅을 하면 ClassCastException 발생(문자가 들어 있기 때문에)
        Integer num3 = (Integer) numberList.get(2);
        //타입 안정성이 보장 안됨
    }
}
