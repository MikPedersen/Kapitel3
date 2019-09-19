import java.util.Scanner;

public class Opgave35 {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
        System.out.println("Please enter a number");
        int inputNumber = input.nextInt();
        if (inputNumber % 2 == 0)
            System.out.println(inputNumber + " is an even number");
        else
            System.out.println(inputNumber+ " is an odd number");

    }
}
