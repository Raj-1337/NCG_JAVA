import java.util.Scanner;

public class TeenNumberChecker {

    public static boolean isTeen(int x) {
        return x > 12 && x < 20;
    }

    public static boolean hasTeen(int a, int b, int c) {
        return isTeen(a) || isTeen(b) || isTeen(c);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(hasTeen(scanner.nextInt(), scanner.nextInt(), scanner.nextInt()));
    }

}
