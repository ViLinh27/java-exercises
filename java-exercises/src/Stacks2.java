public class Stacks2 {
    // store elements of stack;
    private int arr[];
    // top of stack:
    private int top;
    // how much stack can hold;
    private int capacity;

    // create a stack
    Stacks2(int size) {
        // init the array
        // int the stack variables
        arr = new int[size];
        capacity = size;
        top = -1;// because start out as empty
    }

    // push element on top of stack
    public void push(int x) {
        if (isFull()) {
            System.out.println("stack overflow");

            // terminates program
            System.exit(1);
        }

        // insert elem on top of stack
        System.out.println("Inserting " + x);
        arr[++top] = x;
    }

    // pop elem from top of stack
    public int pop() {
        // if stack is empty no pop
        if (isEmpty()) {
            System.out.println("stack is empty");
            System.exit(1);
        }
        // pop from top of stack
        return arr[top--];
    }

    // return size of stack
    public int getSize() {
        return top + 1;
    }

    public Boolean isEmpty() {
        return top == -1;
    }

    public Boolean isFull() {
        return top == capacity - 1;
    }

    // display eleme of stack
    public void printStack() {
        for (int i = 0; i <= top; i++) {
            System.out.print(arr[i] + ", ");
        }
    }
}

// first ex from
// https://www.programiz.com/java-programming/examples/stack-implementation