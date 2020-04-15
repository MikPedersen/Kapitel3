import java.util.Scanner;

public class Opgave21 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter year: (e.g., 2012)");
        int y = input.nextInt();

        System.out.println("Enter month: 1-12");
        int m = input.nextInt();

        System.out.println("Enter the day of the month: 1-31");
        int q = input.nextInt();

        if (m == 1 || m == 2) {
            m = m + 12;
            y = y - 1;
        }

        int j = y / 100;
        int k = y % 100;
        int h = (q + 26 * (m + 1) / 10 + k + k / 4 + j / 4 + 5 * j) % 7;
        String dayOfWeek;
        switch (h){
            case 0 : dayOfWeek = "Saturday"; break;
            case 1 : dayOfWeek = "Sunday"; break;
            case 2 : dayOfWeek = "Monday"; break;
            case 3 : dayOfWeek = "Tuesday"; break;
            case 4 : dayOfWeek = "Wednesday"; break;
            case 5 : dayOfWeek = "Thursday"; break;
            default: dayOfWeek = "Friday"; break;
        }
        System.out.println("Day of the week is " + dayOfWeek);
    }
}
