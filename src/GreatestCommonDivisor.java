import java.util.Scanner;

public class GreatestCommonDivisor {

    public static int getGreatestCommonDivisor(int x, int y) {
        if (x < 10 || y < 10) {
            return -1;
        }
        int gcd = Math.max(x, y) / 2 > Math.min(x, y) ? Math.max(x, y) / 2 : Math.min(x, y);
        while (gcd > 1) {
            if (x % gcd == 0 && y % gcd == 0) {
                break;
            }
            gcd--;
        }
        return gcd;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(getGreatestCommonDivisor(scanner.nextInt(), scanner.nextInt()));
    }

}
