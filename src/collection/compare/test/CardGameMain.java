package collection.compare.test;

public class CardGameMain {

    public static void main(String[] args) {
        //이거 다시 한번 복기하면서 다시 풀어보자
        Deck deck = new Deck();
        Player player1 = new Player("플레이어1");
        Player player2 = new Player("플레이어2");

        for (int i = 0; i < 5; i++) {
            player1.drwaCard(deck);
            player2.drwaCard(deck);
        }

        player1.showHand();
        player2.showHand();

        //변수 선언과 동시에 결과를 알 수 있음
        Player winner = getWinner(player1, player2);

        if(getWinner(player1, player2) != null) {
            System.out.println(getWinner(player1, player2).getName() + " 승리");
        } else {
            System.out.println("무승부");
        }
    }

    private static Player getWinner(Player player1, Player player2) {
        int sum1 = player1.rankSum();
        int sum2 = player2.rankSum();

        if(sum1 > sum2) {
            return player1;
        } else if(sum1 == sum2) {
            return null;
        } else {
            return player2;
        }
    }
}
