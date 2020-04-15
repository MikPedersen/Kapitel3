import java.util.Scanner;

public class Opgave12 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a 3 digit integer");

        int userInput= input.nextInt();

        int three = userInput%10;
        int one = userInput/100%10;

        if (one == three){
            System.out.println(userInput + " is a palindrome");
        }
        else
            System.out.println(userInput + " is not a palindrome");
    }
}
