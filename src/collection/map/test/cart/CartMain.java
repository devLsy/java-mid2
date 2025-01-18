package collection.map.test.cart;

public class CartMain {

    public static void main(String[] args) {
        /*
        cart안의 HashMap에서 키는 Product가 되기에
        Product의 equals() hashcode()를 재정의 하지 않으면 사과가 이미 있어도 사과를 또 추가하는 대형사고가 발생한다.
        해시 자료구조에서 위 2개를 재정의하지 않으면 기본적으로 Object의 메서드를 사용하는데 이 때는 인스턴스의 참조값으로
        비교 하기 때문에 참조값이 다르면 다르다고 판단해서 원하지 않는 결과가 나온다.
        그래서 값으로 비교하기 위해 반드시 재정의 해야 한다.
        */
        Cart cart = new Cart();
        cart.add(new Product("사과", 1000), 1);
        cart.add(new Product("바나나", 500), 1);
        cart.printAll();

        cart.add(new Product("사과", 1000), 2);
        cart.printAll();

        cart.minus(new Product("사과", 1000), 3);
        cart.printAll();
    }
}
