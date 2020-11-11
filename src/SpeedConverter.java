import java.util.Scanner;

public class SpeedConverter {

    public static long toMilesPerHour(double kilometersPerHour) {
        if (kilometersPerHour < 0)
            return -1;
        return Math.round(kilometersPerHour / 1.609);
    }

    public static void printConversion(double kilometersPerHour) {
        long miles = toMilesPerHour(kilometersPerHour);
        if (miles < 0) {
            System.out.println("Invalid Value");
        } else {
            System.out.println(kilometersPerHour + " km/h = " + miles + " mi/h");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        printConversion(scanner.nextDouble());
    }

}
