import java.util.Scanner;

public class LastDigitChecker {

    public static boolean isValid(int num) {
        return num > 9 && num < 1001;
    }

    public static boolean hasSameLastDigit(int a, int b, int c) {
        if (!isValid(a) || !isValid(b) || !isValid(c)) {
            return false;
        }
        a = a % 10;
        b = b % 10;
        c = c % 10;
        return a == b || a == c || b == c;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(hasSameLastDigit(scanner.nextInt(), scanner.nextInt(), scanner.nextInt()));
    }

}
