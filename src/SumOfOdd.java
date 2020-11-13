import java.util.Scanner;

public class SumOfOdd {

    public static boolean isOdd(int  number) {
        return number >= 0 && number % 2 != 0;
    }

    public static int sumOdd(int start, int end) {
        if (end < start || start < 0) {
            return -1;
        }
        int sum = 0;
        while (start <= end) {
            if (isOdd(start)) {
                sum += start;
            }
            start++;
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(sumOdd(scanner.nextInt(), scanner.nextInt()));
    }

}
