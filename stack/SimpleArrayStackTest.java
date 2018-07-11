import java.util.Random;

public class SimpleArrayStackTest {
    public static void main(String args[]) {
        Random random = new Random();
        SimpleArrayStack myStack = new SimpleArrayStack(10);

        if (myStack.isEmpty()) {
            System.out.println("Stack is empty");
        }

        for (int i = 0; i < 10; i++) {
            myStack.push(random.nextInt((100 - 1) + 1) + 1);
        }

        if (myStack.isFull()) {
            System.out.println("Stack is full");
        }

        System.out.println("Popping the top element: " + myStack.pop());

        System.out.println("Peeking the top element: " + myStack.peek());
    }
}
