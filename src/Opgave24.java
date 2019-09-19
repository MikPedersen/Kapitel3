import java.util.Random;
public class Opgave24 {

    public static void main(String[] args) {
        Random randomCard = new Random();
        System.out.println("Welcome to pick a card");

        String cardRank[] = {"Ace", "2", "3", "4", "5", "6","7", "8", "9", "10","Jack", "Queen", "King"};

        String cardSuit[] = {"Clubs", "Diamonds", "Hearts", "Spades" };

        int randomNumber=randomCard.nextInt(cardRank.length);
        int randomNumber2=randomCard.nextInt(cardSuit.length);
        System.out.println("Your card is " + cardRank[randomNumber] + " of " + cardSuit[randomNumber2]);


    }
}