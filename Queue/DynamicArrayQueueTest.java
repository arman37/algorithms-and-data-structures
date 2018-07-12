import java.util.Random;

public class DynamicArrayQueueTest {
    public static void main(String[] args) {
        Random random = new Random();
        DynamicArrayQueue myQueue = new DynamicArrayQueue();
        System.out.println("Capacity of the Queue: " + myQueue.capacity());
        System.out.println("current size of the Queue: " + myQueue.size());
        if (myQueue.isEmpty()) {
            System.out.println("Queue is empty");
        }

        for (int i = 0; i < 10; i++) {
            myQueue.enQueue(random.nextInt((100 - 1) + 1) + 1);
        }

        System.out.println("current size of the Queue: " + myQueue.size());
        if (myQueue.isFull()) {
            System.out.println("Queue is full");
        }

        myQueue.deQueue();
        myQueue.deQueue();
        myQueue.deQueue();

        System.out.println("current size of the Queue: " + myQueue.size());
        myQueue
          .enQueue(15)
          .enQueue(36)
          .enQueue(15)
          .enQueue(36)
          .enQueue(45);

        System.out.println("Capacity of the Queue: " + myQueue.capacity());
        System.out.println("current size of the Queue: " + myQueue.size());
    }
}
