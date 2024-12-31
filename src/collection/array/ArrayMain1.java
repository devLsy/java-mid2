package collection.array;

import java.util.Arrays;

public class ArrayMain1 {

    public static void main(String[] args) {
        int[] arr = new int[5];
        //index 입력: O(1)
        System.out.println("==index 입력: 0(1)==");
        arr[0] = 1;
        arr[1] = 2;
        arr[2] = 3;
        System.out.println(Arrays.toString(arr));

        //index 변경: O(1)
        System.out.println("==index 변경: 0(1)==");
        arr[2] = 10;
        System.out.println(Arrays.toString(arr));

        System.out.println("==index 조회: 0(1)==");
        System.out.println("arr[2] = " + arr[2]);

        System.out.println("==배열 검색: 0(n)==");
        System.out.println(Arrays.toString(arr));

        //value 10을 찾는다.
        int value = 10;
        for (int i = 0; i < arr.length; i++) {
            System.out.println("arr[" + i + "] = " + arr[i]);
            if(arr[i] == value) {
                System.out.println(value + " 찾음");
                break;
            }
        }
        /*
        컴퓨터가 배열에서 자료를 찾는 공식
        int value = arr[0]; 이런식으로 배열의 인덱스를 이용해서 값을 찾을 때
        배열의 시작 참조 + (자료의 크기 * 인덱스 위치)
        ex) arr[0]:  x100(참조 주소 예시) + (4byte(int) * 0): x100
        한번의 연산으로 필요한 위치를 찾을 수 있음
        하지만 배열을 검색하는 경우 순차적으로 조회해야 된다.
        */
    }
}
