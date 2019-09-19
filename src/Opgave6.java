import java.lang.Math;
import java.util.Scanner;
public class Opgave6 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Welcome to the BMI index");
        System.out.println("Please enter your weight");
        double weight= input.nextDouble();
        System.out.println("Please enter your height first in feet");
        double feet = input.nextDouble();
        System.out.println("Please enter your height in inches");
        double inches = input.nextDouble();

        final double kilogramsPerPound = 0.45359237;
        final double metersPerInch = 0.0254;

        double bmi = (weight*kilogramsPerPound)/((feet*12+inches)*metersPerInch*(feet*12+inches)*metersPerInch);
        System.out.println("Your BMI is " + bmi);
        if (bmi < 18.5)
            System.out.println("underweight");
        else if (bmi <25)
            System.out.println("normal");
        else if (bmi < 30)
            System.out.println("overweight");
        else
            System.out.println("obese");
    }
}
