import java.util.Scanner;

public class FactorPrinter {

    public static void printFactors(int num) {
        if (num < 1) {
            System.out.println("Invalid Value");
            return;
        }
        for (int i = 1; i <= num / 2; i++) {
            if (num % i == 0) {
                System.out.printf("%d ", i);
            }
        }
        System.out.println(num);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        printFactors(scanner.nextInt());
    }

}
