import java.util.Scanner;

public class PlayingCat {

    public static boolean isCatPlaying(boolean summer, int temperature) {
        return ((summer && temperature > 24 && temperature < 46) || (temperature > 24 &&  temperature < 36));
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(isCatPlaying(scanner.nextBoolean(), scanner.nextInt()));
    }

}
