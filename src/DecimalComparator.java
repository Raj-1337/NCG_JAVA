import java.util.Scanner;

public class DecimalComparator {

    public static boolean areEqualByThreeDecimalPlaces(double x, double y) {
        return (int) (x * 1000) == (int) (y * 1000);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(areEqualByThreeDecimalPlaces(scanner.nextDouble(), scanner.nextDouble()));
    }

}
