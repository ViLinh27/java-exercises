public class ClosedTriangle extends Shapes {
    private double area;

    public ClosedTriangle(int length, int width, String name, String color) {
        super(length, width, name, color);
    }

    public double getArea() {
        this.area = super.length * super.width * 0.5;
        return this.area;
    }

    public String toString() {
        return super.toString() + " -area: " + getArea() + "\n";
    }

}
