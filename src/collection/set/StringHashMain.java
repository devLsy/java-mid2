package collection.set;

public class StringHashMain {

    static final int CAPACITY = 10;

    public static void main(String[] args) {
        //char
        char charA = 'A';
        char charB = 'B';
        System.out.println("charA = " + (int)charA);
        System.out.println("charB = " + (int)charB);

        //hashCode
        System.out.println("hashCode('A') = " + hashCode("A"));
        System.out.println("hashCode('B') = " + hashCode("B"));
        System.out.println("hashCode('AB') = " + hashCode("AB"));

        //hashIndex
        //문자열의 해시코드를 정수형으로 반환
        int hashCode = hashCode("A");
        //정수형의 해시코드로 해시인덱스를 구함
        int hashIndex = hashIndex(hashCode);
        System.out.println("hashIndex = " + hashIndex);

        System.out.println("hashIndex(A) = " + hashIndex(hashCode("A")));
        System.out.println("hashIndex(B) = " + hashIndex(hashCode("B")));
        System.out.println("hashIndex(AB) = " + hashIndex(hashCode("AB")));
    }
    //문자열의 해시코드를 구함
    static int hashCode(String str) {
        char[] charArray = str.toCharArray();
        int sum = 0;
        for (char c : charArray) {
            sum = sum + (int) c;
        }
        return sum;
    }
    //해시코드값으로 해시인덱스를 구함
    static int hashIndex(int value) {
        return value % CAPACITY;
    }
}
