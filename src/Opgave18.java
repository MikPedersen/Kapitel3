import java.util.Scanner;

public class Opgave18 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the weight of the package in pounds");
        double weight = input.nextDouble();
        if (weight > 20){
            System.out.println("The package cannot be shipped");
        }
        else {
            double costPerPounds = 0;
            if (0 > weight && weight <= 2) {
                costPerPounds = 2.5;
            } else if (weight <= 4) {
                costPerPounds = 4.5;
            } else if (weight <= 10) {
                costPerPounds = 7.5;
            } else
                costPerPounds = 10.5;

            System.out.println("Price for shipping is $" + costPerPounds * weight);
        }
    }
}
