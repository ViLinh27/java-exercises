public class ClosedRectangle extends Shapes {

    private double area;

    public ClosedRectangle(int length, int width, String name, String color) {
        super(length, width, name, color);
        // this.area = area;
    }

    public double RectArea() {
        this.area = super.length * super.width;
        return this.area;
    }

    public String toString() {
        return super.toString() + " -area: " + RectArea() + "\n";
    }
}
