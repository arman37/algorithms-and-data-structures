public class SimpleArrayStackTest {
    public static void main(String args[]) {
        SimpleArrayStack myStack = new SimpleArrayStack(10);

        if (myStack.isEmpty()) {
            System.out.println("Stack is empty");
        }

        myStack
          .push(5)
          .push(4)
          .push(7)
          .push(17)
          .push(53)
          .push(52)
          .push(35)
          .push(9)
          .push(89)
          .push(50);

        if (myStack.isFull()) {
            System.out.println("Stack is full");
        }

        System.out.println("Popping the top element: " + myStack.pop());

        System.out.println("Peeking the top element: " + myStack.peek());
    }
}
