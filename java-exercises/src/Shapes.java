public class Shapes {// super class
    // closed shapes
    // circle
    // triangle
    // rectangle

    // open shape
    // line
    // curve
    // text
    protected int length;
    protected int width;
    protected String name;
    protected String color;
    // protected double area;

    public Shapes(int length, int width, String name, String color) {
        this.length = length;
        this.width = width;
        this.name = name;
        this.color = color;
    }

    public int getLength() {
        return this.length;
    }

    public int getWidth() {
        return this.width;
    }

    public String getName() {
        return this.name;
    }

    public String getColor() {
        return this.color;
    }

    public String toString() {
        return this.name + " -length: " + this.length + " -width: " + this.width + " -color: " + this.color;
    }

}

// each class supports tostring that returns attr as string

// shape :
// name
// tostring()
// length
// width
// color

// closed shapes:
// area()
// inherit tostring,length,width

// open shapes:
// inherit tostring,length,width=0
