import java.sql.SQLOutput;
import java.util.Scanner;

public class Opgave1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a, b, c");
        double a = input.nextDouble();
        double b = input.nextDouble();
        double c = input.nextDouble();

        double discriminant = Math.pow(b, 2) - 4 * a * c;

        if (discriminant > 0 ){
            double root1 = (- b + Math.pow(discriminant, 0.5)) / 2*a;
            double root2 = (- b - Math.pow(discriminant, 0.5)) / 2*a;

            System.out.println("The equation has 2 roots: " + root1 + " " + root2);
        }
        else if (discriminant == 0){
            double root1 = (- b + Math.pow(discriminant, 0.5)) / 2*a;
            System.out.println(" The equation has 1 root: " + root1);
        }
        else {
            System.out.println("The equation has no real roots");
        }
    }
}
