import java.util.Arrays;

public class DynamicArrayStack {
    private int top = -1;
    private int stackArray[];
    private int stackSize = 10;

    public DynamicArrayStack() {
      this.stackArray = new int[stackSize];
    }

    public DynamicArrayStack(int stackSize) {
        this.stackSize = stackSize;
        this.stackArray = new int[stackSize];
    }

    public DynamicArrayStack push(int val) {
        if (this.isFull()) {
            this.ensureCapacity();
        }

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

    public int size() {
        return this.stackSize;
    }

    private void ensureCapacity() {
        System.out.println("Doubling the stack size");
        this.stackSize = this.stackSize * 2;
        this.stackArray = Arrays.copyOf(this.stackArray, this.stackSize);
    }
}
