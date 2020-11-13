import java.util.Scanner;

public class EqualityPrinter {

    public static void printEqual(int a, int b, int c) {
        if (a < 0 || b < 0 || c < 0) {
            System.out.println("Invalid value");
        } else if (a == b && a == c) {
            System.out.println("All numbers are equal");
        } else if (a != b && a != c && b != c) {
            System.out.println("All numbers are different");
        } else {
            System.out.println("Neither all are equal or different");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        printEqual(scanner.nextInt(), scanner.nextInt(), scanner.nextInt());
    }

}
