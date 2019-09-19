import java.util.Scanner;

public class Opgave5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Please enter what day it is with a number");
        System.out.println("Sunday = 0, Monday = 1, Tuesday = 2, Wednesday = 3");
        System.out.println("Thursday = 4, Friday = 5, Saturday = 6");

        int today = input.nextInt() % 7;
        String day = null;
        String day2 = null;
        System.out.println("Please enter how many days ahead you want");
        int futureDay = today + input.nextInt() % 7;

        day = getString(today, day);
        day2 = getString(futureDay, day2);
        System.out.println("Today is " + day + " and the future day is " + day2);
    }

    public static String getString(int today, String day) {
        switch (today) {
            case 0: day = "sunday"; break;
            case 1: day = "monday"; break;
            case 2: day = "tuesday"; break;
            case 3: day = "wednesday"; break;
            case 4: day = "thursday"; break;
            case 5: day = "friday"; break;
            case 6: day = "saturday"; break;
        }
        return day;
    }
}
