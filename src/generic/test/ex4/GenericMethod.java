package generic.test.ex4;

public class GenericMethod {

    public static Object objMethod(Object obj) {
        System.out.println("obj print: " + obj);
        return obj;
    }

    /*
    해당 메서드만 제네릭 적용(제네릭 메서드(제네릭 타입의 메서드란 의미))
    */
    public static <T> T genericMethod(T t) {
        System.out.println("generic print: " + t);
        return t;
    }
    public static <T extends Number> T numberMethod(T t) {
        System.out.println("bound print: " + t);
        return t;
    }
}
