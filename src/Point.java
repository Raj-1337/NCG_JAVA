public class Point {

    private int x;
    private int y;

    public Point() {
        this(0, 0);
    }

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public double distance() {
        return Math.sqrt(Math.pow(x , 2.0) + Math.pow(y , 2.0));
    }

    public double distance(int x, int y) {
        return Math.sqrt(Math.pow((x - this.x), 2.0) + Math.pow((y - this.y), 2.0));
    }

    public double distance(Point p) {
        return Math.sqrt(Math.pow((p.x - this.x), 2.0) + Math.pow((p.y - this.y), 2.0));
    }

    public static void main(String[] args) {
        Point p = new Point();
        System.out.println(p.distance(-1, -1 ));
    }
}
