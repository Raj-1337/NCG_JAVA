import java.util.Scanner;

public class LeapYearCalculator {

    public static boolean isLeapYear(int year) {
        if (year < 1 || year > 9999)
            return false;
        if (year % 4 == 0) {
            if (year % 100 == 0) {
                return year % 400 == 0;
            }
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(isLeapYear(scanner.nextInt()));
    }

}
