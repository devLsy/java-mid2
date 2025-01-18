package collection.compare.test;

public class Card implements Comparable<Card> {

    private final int rank;     //카드의 숫자
    private final Suit suit;          //카드의 마크

    public Card(int rank, Suit suit) {
        this.rank = rank;
        this.suit = suit;
    }

    public int getRank() {
        return rank;
    }

    public Suit getSuit() {
        return suit;
    }

    @Override
    public int compareTo(Card anotherCard) {
        // 숫자를 먼저 비교하고, 숫자가 같으면 마크를 비교
        if(this.rank != anotherCard.rank) {
            return Integer.compare(this.rank, anotherCard.rank);
        } else {
            //enum 타입은 Comparable을 구현하고 있어서 compareTo() 사용 가능
            //enum의 compareTo()는 final로 선언되어 있어서 재정의가 안되니까 필요한 경우에 다른 메서드 만들어서 사용해야 함
            //enum의 열거형 데이터가 바뀌지 않는다는 전제
            return this.suit.compareTo(anotherCard.suit);
        }
    }

    @Override
    public String toString() {
        return rank + "(" + suit.getIcon() + ")";
    }
}
