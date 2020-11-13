import java.util.Scanner;

public class MinToYrsAndDays {

    public static void printYearsAndDays(long minutes) {
        if (minutes < 0) {
            System.out.println("Invalid Value");
            return;
        }
        System.out.printf("%d min = %d y and %d d", minutes, minutes/60/24/365, (minutes/60/24) % 365);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        printYearsAndDays(scanner.nextLong());
    }

}
