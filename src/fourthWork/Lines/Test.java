package fourthWork.Lines;

public class Test {
    public static void main(String[] args) {
        Point p1 = new Point(4, 10);
        Point p2 = new Point(5, 20);
        Line[] lines = new Line[4];
        lines[0] = new Line(p1, p2);
        lines[1] = new ColorLine(p1, p2, "Blue");
        lines[2] = new Line(p1, p2);
        lines[3] = new ColorLine(p1, p2, "Red");

        for (Line line : lines) {
            line.print();
        }
    }
}
