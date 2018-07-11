import java.util.Random;

public class DynamicArrayStackTest {
    public static void main(String args[]) {
        Random random = new Random();
        DynamicArrayStack myStack = new DynamicArrayStack(5);

        System.out.println("Stack size:" + myStack.size());
        if (myStack.isEmpty()) {
            System.out.println("Stack is empty");
        }

        for (int i = 0; i < 15; i++) {
            myStack.push(random.nextInt((100 - 1) + 1) + 1);
        }
        System.out.println("New stack size:" + myStack.size());

        if (myStack.isFull()) {
            System.out.println("Stack is full");
        }

        System.out.println("Popping the top element: " + myStack.pop());

        System.out.println("Peeking the top element: " + myStack.peek());
    }
}
