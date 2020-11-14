import java.util.Scanner;

public class FlourPack {

    public static boolean canPack(int bigCount, int smallCount, int goal) {
        if (bigCount < 0 || smallCount < 0 || goal < 0) {
            return false;
        }
        int sum = 0;
        while (bigCount > 0) {
            if (sum + 5 > goal) {
                break;
            }
            bigCount--;
            sum += 5;
        }
        return goal - sum <= smallCount;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(canPack(scanner.nextInt(), scanner.nextInt(), scanner.nextInt()));
    }

}
