import java.util.Scanner;

public class LargestPrime {

    public static int getLargestPrime(int num) {
        if (num < 2) {
            return -1;
        }
        boolean flag = false;
        for (int i = num/2; i > 1 ; i--) {
            if (num % i == 0) {
                flag = true;
                break;
            }
        }
        if (!flag) {
            return num;
        }
        int x = num / 2;
        while (x > 2) {
            flag = false;
            if (num % x == 0 && x % 2 != 0) {
                for (int k = x / 2; k > 2; k--) {
                    if (x % k == 0) {
                        flag = true;
                        break;
                    }
                }
                if (!flag) {
                    return x;
                }
            }
            x--;
        }
        return num % 2 == 0 ? 2 : -1;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(getLargestPrime(scanner.nextInt()));
    }

}
