import java.util.Scanner;

public class NumberPalindrome {

    public static boolean isPalindrome(int number) {
        if (number < 0) {
            number *= -1;
        }
        int copy = number;
        int rev = 0;
        int mod;
        while (number > 0) {
            mod = number % 10;
            number /= 10;
            rev = rev * 10 + mod;
        }
        return rev == copy;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(isPalindrome(scanner.nextInt()));
    }

}
