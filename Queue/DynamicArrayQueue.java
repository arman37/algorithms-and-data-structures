import java.util.Arrays;

public class DynamicArrayQueue {
    int rear = -1;
    int front = -1;
    int capacity = 10;
    int currentSize = 0;
    int arrayQueue[];

    public DynamicArrayQueue() {
        this.arrayQueue = new int[this.capacity];
    }

    public DynamicArrayQueue(int capacity) {
        this.capacity = capacity;
        this.arrayQueue = new int[capacity];
    }

    /*adds item at the end of the Queue*/
    public DynamicArrayQueue enQueue(int item) {
        if (isFull()) {
            ensureCapacity();
        }
        /*start adding item at the beginning of the Queue if no space is available at the top*/
        if (++this.rear == this.capacity) {
            this.rear = 0;
        }
        this.arrayQueue[this.rear] = item;
        this.currentSize++;
        System.out.println("Element " + item + " is pushed to Queue at index [" + this.rear + "] and Rear is: " + this.rear);

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
            System.out.println("Front position is: " + this.front);

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

    private void ensureCapacity() {
        System.out.println("Queue is full, Doubling the queue size");
        int newCapacity = this.capacity * 2;
        int newArray[] = new int[newCapacity];
        int size = 0;
        /*relocating front items*/
        for (int i = this.front + 1, j = 0; i < this.capacity; i++) {
            newArray[j++] = this.arrayQueue[i];
            size = j;
            System.out.printf("Moving front item %d from index [%d] to index [%d] \n", this.arrayQueue[i], i, j - 1);
        }
        /*relocating rear items*/
        for (int i = 0; i <= this.front; i++) {
            newArray[size + i] = this.arrayQueue[i];
            System.out.printf("Moving rear item %d from index [%d] to index [%d] \n", this.arrayQueue[i], i, size + i);
        }

        this.capacity = newCapacity;
        this.front = -1;
        this.rear = this.currentSize - 1;
        this.arrayQueue = newArray;
    }

    private void reOrganizeQueue() {

    }
}
