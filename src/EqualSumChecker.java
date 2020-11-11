import java.util.Scanner;

public class EqualSumChecker {

    public static boolean hasEqualSum(int x, int y, int sum) {
        return x + y == sum;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(hasEqualSum(scanner.nextInt(), scanner.nextInt(), scanner.nextInt()));
    }

}
