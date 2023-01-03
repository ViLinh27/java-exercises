import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        // LinkedList list = new LinkedList();
        // list.insert(list, 1);
        // list.insert(list, 2);
        // list.insert(list, 3);
        // list.insert(list, 4);
        // list.insert(list, 4);
        // list.insert(list, 5);
        // list.printList(list);

        // list.deleteByKey(list, 1);// delete head
        // list.printList(list);

        // list.deleteByKey(list, 4);// delete in middle
        // list.printList(list);

        // list.deleteByKey(list, 6);// delete nonexistent key
        // list.printList(list);

        // Shapes shape = new Shapes(3, 4, "shape", "red");
        ClosedCircle circle = new ClosedCircle(2, 2, "circle", "blue");
        ClosedRectangle rectangle = new ClosedRectangle(4, 5, "rectangle", "green");
        ClosedTriangle triangle = new ClosedTriangle(5, 7, "Triangle", "orange");
        OpenCurve curve = new OpenCurve(4, 4, "Curve", "pink");
        OpenLine line = new OpenLine(5, 5, "Line", "purple");
        OpenText text = new OpenText(6, 6, "text", "yellow");

        // System.out.println(shape.toString());
        // System.out.println(circle.toString());
        // System.out.println(rectangle.toString());
        // System.out.println(triangle.toString());

        LinkedListShapes shapeslist = new LinkedListShapes();
        shapeslist.insert(shapeslist, circle);
        shapeslist.insert(shapeslist, rectangle);
        shapeslist.insert(shapeslist, triangle);
        shapeslist.insert(shapeslist, curve);
        shapeslist.insert(shapeslist, line);
        shapeslist.insert(shapeslist, text);
        shapeslist.printList(shapeslist);

        shapeslist.deleteByKey(shapeslist, "circle");
        shapeslist.printList(shapeslist);

        shapeslist.deleteByKey(shapeslist, "Triangle");
        shapeslist.printList(shapeslist);

        shapeslist.deleteByKey(shapeslist, "oval");
        shapeslist.printList(shapeslist);

        System.out.println("\n");

        // stacks:
        System.out.println("Stacks: ");
        Stacks stack = new Stacks();
        Stack<Integer> usestack = new Stack<Integer>();
        stack.stackpush(usestack, 1);
        stack.stackpush(usestack, 2);
        stack.stackpush(usestack, 3);
        stack.stackpop(usestack);
        stack.stackpush(usestack, 4);

        stack.stackpeek(usestack);
        stack.stacksearch(usestack, 2);
        stack.stacksearch(usestack, 6);

        System.out.println("\n");
        Stacks2 stack2 = new Stacks2(5);

        stack2.push(1);
        stack2.push(2);
        stack2.push(3);

        System.out.print("Stack2: ");
        stack2.printStack();

        // remove from stack
        stack2.pop();
        System.out.println("\nAfter popping out...");
        stack2.printStack();
    }
}
