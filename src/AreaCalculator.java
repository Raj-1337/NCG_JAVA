import java.util.Scanner;

public class AreaCalculator {

    public static double area(double radius) {
        if (radius < 0)
            return -1;
        return Math.PI * radius * radius;
    }

    public static double area(double x, double y) {
        if (x < 0 || y < 0)
            return -1;
        return x * y;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(area(scanner.nextDouble()));
        System.out.println(area(scanner.nextDouble(), scanner.nextDouble()));
    }

}
