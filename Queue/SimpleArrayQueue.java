public class SimpleArrayQueue {
    int rear = -1;
    int front = -1;
    int capacity;
    int currentSize;
    int arrayQueue[];

    public SimpleArrayQueue(int capacity) {
        this.capacity = capacity;
        this.arrayQueue = new int[capacity];
        this.currentSize = 0;
    }

    /*adds item at the end of the Queue*/
    public SimpleArrayQueue enQueue(int item) {
        if (isFull()) {
            System.out.println("Overflow ! Unable to add element: " + item);
            throw new IndexOutOfBoundsException("Overflow Exception");
        } else {
            /*start adding item at the beginning of the Queue if no space is available at the top*/
            if (++this.rear == this.capacity) {
                this.rear = 0;
            }
            this.arrayQueue[this.rear] = item;
            this.currentSize++;
            System.out.println("Element " + item + " is pushed to Queue at index [" + this.rear + "]");
        }

        return this;
    }

    /*removes item from the beginning of the Queue*/
    public int deQueue() {
        if (isEmpty()) {
            System.out.println("Underflow ! Unable to remove element from Queue");
            throw new java.util.NoSuchElementException("Underflow Exception");
        } else {
            int item = this.arrayQueue[++this.front];
            this.currentSize--;
            System.out.println("Pop operation done ! removed: " + item + " from index [" + this.front + "]");
            /*check if we removed the last element from the end of the Queue*/
            if (this.front == this.capacity - 1) {
                /*start from the beginning*/
                this.front = -1;
            }

            return item;
        }
    }

    /*check if Queue is full*/
    public boolean isFull() {
        return (this.capacity == this.currentSize);
    }

    /*check if Queue is empty*/
    public boolean isEmpty() {
        return (this.currentSize == 0);
    }

    /*returns current size of the Queue*/
    public int size() {
        return this.currentSize;
    }

    /*returns capacity of the Queue*/
    public int capacity() {
        return this.capacity;
    }
}
