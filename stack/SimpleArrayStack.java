public class SimpleArrayStack {
    private int top;
    private int stackSize;
    private int stackArray[];

    public SimpleArrayStack(int stackSize) {
        this.stackSize = stackSize;
        this.stackArray = new int[stackSize];
        this.top = -1;
    }

    public SimpleArrayStack push(int val) {
        this.stackArray[++top] = val;
        return this;
    }

    public int pop() {
        return this.stackArray[top--];
    }

    public int peek() {
        return this.stackArray[top];
    }

    public boolean isEmpty() {
        return (this.top == -1);
    }

    public boolean isFull() {
        return ((this.top + 1) == this.stackSize);
    }
}
