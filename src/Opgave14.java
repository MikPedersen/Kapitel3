import java.util.Scanner;
public class Opgave14 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to the guessing game");
        System.out.println("Please guess whether it is heads 1 or tails 2");
        int guess = input.nextInt();

        int outcome = (int) (Math.random() * 2);
        switch (outcome) {
            case 0:
                System.out.println("Heads");
                break;
            case 1:
                System.out.println("Tails");
                break;
        }
        if (guess -1 == outcome)
            System.out.println("Winner");
        else
            System.out.println("Loser");
    }

}
