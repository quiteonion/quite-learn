package A20240317;

public class CardTest {
    public static void main(String[] args) {
        /**
         * 一个扑克牌
         */
        /*Card c = new Card();
        System.out.println(c.getCard());*/
        /**
         * 多个扑克牌
         */
        Card c = new Card();
        for (int i = 0; i < c.getCard().length; i++) {
            System.out.println(c.getCard()[i]);
        }
    }
}
