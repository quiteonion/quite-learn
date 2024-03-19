package A20240317;

public class Card1Test {
    public static void main(String[] args) {
        /**
         * 一个扑克牌
         */
        /*Card c = new Card();
        System.out.println(c.getCard());*/
        /**
         * 多个扑克牌
         */
        Card1 c = new Card1();
        String[] arr = c.getCard();
        for (int i = 0; i <arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}