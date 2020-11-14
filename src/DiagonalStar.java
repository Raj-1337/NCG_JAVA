import java.util.Scanner;

public class DiagonalStar {

    public static void printSquareStar(int num) {
        if (num < 5) {
            System.out.println("Invalid Value");
            return;
        }
        for (int i = 0; i < num; i++) {
            System.out.print("*");
        }
        System.out.println();
        int start = 2;
        int end = num - 1;
        for (int i = 2; i < num; i++) {
            System.out.print("*");
            for (int j = 2; j < num; j++) {
                System.out.print(j == start || j == end ? "*" : " ");
            }
            System.out.println("*");
            start++;
            end--;
        }
        for (int i = 0; i < num; i++) {
            System.out.print("*");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        printSquareStar(scanner.nextInt());
    }

}
