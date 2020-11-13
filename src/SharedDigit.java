import java.util.Scanner;

public class SharedDigit {

    public static boolean hasSharedDigit(int x, int y) {
        if ( x < 10 || x > 99 || y < 10 || y > 99) {
            return false;
        }
        int x1 = x % 10;
        x /= 10;
        int x2 = x % 10;
        int y1 = y % 10;
        y /= 10;
        int y2 = y % 10;
        return x1 == y1 || x1 == y2 || x2 == y1 || x2 == y2;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(hasSharedDigit(scanner.nextInt(), scanner.nextInt()));
    }

}
