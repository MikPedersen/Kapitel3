import java.awt.*;
import java.util.Scanner;

public class Opgave9 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the first 9 digits of an ISBN as integer");
        int firstNine = input.nextInt();

        int d9 = firstNine%10;
        int d8 = firstNine/10%10;
        int d7 = firstNine/100%10;
        int d6 = firstNine/1000%10;
        int d5 = firstNine/10000%10;
        int d4 = firstNine/100000%10;
        int d3 = firstNine/1000000%10;
        int d2 = firstNine/10000000%10;
        int d1 = firstNine/100000000%10;

        int lastdigit = (d1*1 + d2*2 + d3*3 + d4*4 + d5*5 + d6*6 + d7*7 + d8*8 + d9*9)%11;

        if (lastdigit == 10){
            System.out.println("The ISBN-10 number is 0" + firstNine + "X");
        }
        else
            System.out.println("The ISBN-10 number is 0" + firstNine + "" + lastdigit);
    }
}
