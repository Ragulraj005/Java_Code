public class FixedSizeStack {
    private int[] elements;
    private int top;
    private int capacity;

    public FixedSizeStack(int capacity) {
        this.capacity = capacity;
        elements = new int[capacity];
        top = -1;
    }

    public void push(int element) {
        if (isFull()) {
            throw new RuntimeException("Stack is full (overflow)!");
        }
        elements[++top] = element;
    }

    public int pop() {
        if (isEmpty()) {
            throw new RuntimeException("Stack is empty (underflow)!");
        }
        return elements[top--];
    }

    public int peek() {
        if (isEmpty()) {
            throw new RuntimeException("Stack is empty!");
        }
        return elements[top];
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public boolean isFull() {
        return top == capacity - 1;
    }

    public static void main(String[] args) {
        FixedSizeStack stack = new FixedSizeStack(5);

        stack.push(1);
        stack.push(2);
        stack.push(3);

        System.out.println("Top element: " + stack.peek()); // Should print "Top element: 3"

        while (!stack.isEmpty()) {
            System.out.println("Popped: " + stack.pop());
        }
    }
}
