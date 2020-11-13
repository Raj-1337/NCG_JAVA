import java.util.Scanner;

public class NumberToWords {

    public static int getDigitCount(int num) {
        if (num < 0) {
            return -1;
        }
        int count = 0;
        while (num > 0) {
            count++;
            num /= 10;
        }
        return count;
    }

    public static int reverse(int num) {
        boolean flag = false;
        if (num < 0) {
            num *= -1;
            flag = true;
        }
        int rev = 0;
        while (num > 0) {
            rev = rev * 10 + (num % 10);
            num /= 10;
        }
        return flag ? rev * -1 : rev;
    }

    public static void numberToWords(int num) {
        if (num < 0) {
            System.out.println("Invalid Value");
            return;
        }
        int turns = getDigitCount(num);
        num =  reverse(num);
        int mod;
        while (turns > 0) {
            mod = num % 10;
            num /= 10;
            switch (mod) {
                case 0:
                    System.out.println("Zero");
                    break;
                case 1:
                    System.out.println("One");
                    break;
                case 2:
                    System.out.println("Two");
                    break;
                case 3:
                    System.out.println("Three");
                    break;
                case 4:
                    System.out.println("Four");
                    break;
                case 5:
                    System.out.println("Five");
                    break;
                case 6:
                    System.out.println("Six");
                    break;
                case 7:
                    System.out.println("Seven");
                    break;
                case 8:
                    System.out.println("Eight");
                    break;
                case 9:
                    System.out.println("Nine");
                    break;
            }
            turns--;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        numberToWords(scanner.nextInt());
    }

}
