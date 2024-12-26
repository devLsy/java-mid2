package generic.ex1;

public class RowTypeMain {

    public static void main(String[] args) {
        // 로 타입(과거 코드와 호환 때문에 어쩔 수 없이 사용한다고 함)
        GenericBox integerBox = new GenericBox();
        /*
        위 코드는 아래 코드와 비슷(<> 생략한 경우은 타입을 object로 추론하는 듯?)
        GenericBox<Object> integerBox = new GenericBox<>();  //권장
        로 타입은 사용하지 말 것!!
        */       
        integerBox.set(10);
        Integer result = (Integer) integerBox.get();
        System.out.println("result = " + result);
    }
}
