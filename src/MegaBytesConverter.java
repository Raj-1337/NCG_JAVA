import java.util.Scanner;

public class MegaBytesConverter {

    public static void printMegaBytesAndKiloBytes(int kiloBytes) {
        if (kiloBytes < 0) {
            System.out.println("Invalid Value");
            return;
        }
        System.out.printf("%d KB = %d MB and %d KB", kiloBytes, kiloBytes / 1024, kiloBytes % 1024);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        printMegaBytesAndKiloBytes(scanner.nextInt());
    }

}
