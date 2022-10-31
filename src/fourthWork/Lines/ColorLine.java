package fourthWork.Lines;

public class ColorLine extends Line {
    String Color;

    public ColorLine(Point p1, Point p2, String Color) {
        super(p1, p2);
        this.Color = Color;
    }

    @Override
    public String toString() {
        return "ColorLine{" +
                "Color='" + Color + '\'' +
                ", p1=" + p1 +
                ", p2=" + p2 +
                '}';
    }
    public void print() {
        System.out.println("I'm a color line: " + toString());
    }
}
