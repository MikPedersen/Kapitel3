import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class Opgave8 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter 3 numbers");
        int firstNumber = input.nextInt();
        int secondNumber = input.nextInt();
        int thirdNumber = input.nextInt();

        int temp;
        if (secondNumber < firstNumber || thirdNumber < firstNumber){
            if (secondNumber < firstNumber){
                temp = firstNumber;
                firstNumber = secondNumber;
                secondNumber = temp;
            }
            if (thirdNumber < firstNumber){
                temp = firstNumber;
                firstNumber = thirdNumber;
                thirdNumber = temp;
            }
        }
        if (thirdNumber < secondNumber){
            temp = secondNumber;
            secondNumber = thirdNumber;
            thirdNumber = temp;
        }

//        sorted numbers
        System.out.println(firstNumber + " " + secondNumber + " " +thirdNumber);
    }

}
