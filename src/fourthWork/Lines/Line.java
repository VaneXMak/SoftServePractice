package fourthWork.Lines;

public class Line {
    Point p1;
    Point p2;

    public Line() {}
    public Line(Point p1, Point p2) {
        this.p1 = p1;
        this.p2 = p2;
    }

    @Override
    public String toString() {
        return "Line{" +
                "p1=" + p1 +
                ", p2=" + p2 +
                '}';
    }
    public void print() {
        System.out.println("I'm a line: " + toString());
    }
}
