package collection.array;

public class MyArrayListV4Main {

    public static void main(String[] args) {
        //제네릭으로 문자열만 담는 리스트 생성
        MyArrayListV4<String> stringList = new MyArrayListV4<>();
        stringList.add("a");
        stringList.add("b");
        stringList.add("c");
        //stringList.add(1);    //컴파일 에러 발생(타입 안정성 확보)
        //다운 캐스팅 불필요
        String string = stringList.get(0);
        System.out.println("string = " + string);
        
        //정수만 담는 리스트 생성
        MyArrayListV4<Integer> intList = new MyArrayListV4<>();
        intList.add(1);
        intList.add(2);
        intList.add(3);
        //intList.add("list");  //컴파일 에러 발생
        Integer integer = intList.get(0);
        System.out.println("integer = " + integer);
        
        /*
        배열리스트의 단점: 크기를 미리 알지 못하면 사용하지 않는 주소의 메모리 낭비,
        index를 사용하지 않는 경우 성능이 떨어짐(데이터를 앞이나 중간에 추가할 경우 기존 데이터를 전부 오른쪽으로 미는 연산이 필요 등)
        */
    }
}
