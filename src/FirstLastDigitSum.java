import java.util.Scanner;

public class FirstLastDigitSum {

    public static int sumFirstAndLastDigit(int number) {
        if (number < 0) {
            return -1;
        }
        int first = number % 10;
        while (number >= 10) {
            number /= 10;
        }
        return first + number;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(sumFirstAndLastDigit(scanner.nextInt()));
    }

}
