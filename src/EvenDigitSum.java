import java.util.Scanner;

public class EvenDigitSum {

    public static int getEvenDigitSum(int number) {
        if (number < 0) {
            return -1;
        }
        int sum = 0;
        int mod;
        while (number > 0) {
            mod = number % 10;
            if (mod % 2 == 0) {
                sum += mod;
            }
            number /= 10;
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(getEvenDigitSum(scanner.nextInt()));
    }

}
