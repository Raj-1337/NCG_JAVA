import java.util.Scanner;

public class PerfectNumber {

    public static boolean isPerfectNumber(int num) {
        if (num < 1) {
            return false;
        }
        int sum = 0;
        for (int  i = 1; i <= num / 2; i++) {
            if (num % i == 0) {
                sum += i;
            }
        }
        return sum == num;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(isPerfectNumber(scanner.nextInt()));
    }

}
