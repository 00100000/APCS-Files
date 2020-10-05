public class RandomCard {
    public static void main (String[]args) {
        for (int i = 0; i < 100; i++) {
            printRandomCard(1);
        }
    }
    public static void printRandomCard(int numJokers) {
        // joker case
        if (numJokers == 1 && (int)(Math.random()*53) == 0) {
            System.out.println("Joker");
            return;
        }
        // select suit and card number
        String[] suitArr = {"Diamonds", "Hearts", "Spades", "Clubs"};
        String suit = suitArr[(int)(Math.random()*4)];
        int cardNum = 1 + (int)(Math.random()*12);
        // special cases
        if (cardNum == 1) {
            System.out.println("Ace of " + suit);
            return;
        }
        if (cardNum == 11) {
            System.out.println("Jack of " + suit);
            return;
        }
        if (cardNum == 12) {
            System.out.println("Queen of " + suit);
            return;
        }
        if (cardNum == 13) {
            System.out.println("King of " + suit);
            return;
        }
        // numbered card
        System.out.println(cardNum + " of " + suit);
    }
}