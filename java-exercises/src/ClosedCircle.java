public class ClosedCircle extends Shapes {

    private double area;

    public ClosedCircle(int length, int width, String name, String color) {
        super(length, width, name, color);
        // this.area = area;
    }

    public double circleArea() {
        this.area = super.length * super.width * 3.14;
        return this.area;
    }

    public String toString() {
        return super.toString() + " -area: " + circleArea() + "\n";
    }
}
