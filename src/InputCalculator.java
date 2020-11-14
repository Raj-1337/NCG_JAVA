import java.util.Scanner;

public class InputCalculator {

    public static void inputThenPrintSumAndAverage() {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int count = 0;
        while (scanner.hasNextInt()) {
            sum += scanner.nextInt();
            count++;
        }
        System.out.printf("SUM = %d AVG = %d", sum, Math.round((double)sum /count));
    }

    public static void main(String[] args) {
        inputThenPrintSumAndAverage();
    }

}
