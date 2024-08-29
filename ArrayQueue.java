
import java.util.Scanner;

class ArrayQueue {
    private int[] queue;
    private int front, rear, size, capacity;

    public ArrayQueue(int capacity) {
        this.capacity = capacity;
        queue = new int[capacity];
        front = 0;
        rear = -1;
        size = 0;
    }

    public void enqueue(int value) {
        if (size == capacity) {
            System.out.println("Queue is full.");
        } else {
            rear = (rear + 1) % capacity;
            queue[rear] = value;
            size++;
            System.out.println("Enqueued " + value);
        }
    }

    public void dequeue() {
        if (size == 0) {
            System.out.println("Queue is empty.");
        } else {
            System.out.println("Dequeued " + queue[front]);
            front = (front + 1) % capacity;
            size--;
        }
    }

    public void peek() {
        if (size == 0) {
            System.out.println("Queue is empty.");
        } else {
            System.out.println("Front element is " + queue[front]);
        }
    }

    public void display() {
        if (size == 0) {
            System.out.println("Queue is empty.");
        } else {
            System.out.print("Queue: ");
            for (int i = 0; i < size; i++) {
                System.out.print(queue[(front + i) % capacity] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter queue capacity: ");
        int capacity = scanner.nextInt();
        ArrayQueue queue = new ArrayQueue(capacity);

        int choice;
        do {
            System.out.println("1. Enqueue");
            System.out.println("2. Dequeue");
            System.out.println("3. Peek");
            System.out.println("4. Display");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    System.out.print("Enter value to enqueue: ");
                    int value = scanner.nextInt();
                    queue.enqueue(value);
                    break;
                case 2:
                    queue.dequeue();
                    break;
                case 3:
                    queue.peek();
                    break;
                case 4:
                    queue.display();
                    break;
                case 5:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice. Try again.");
            }
        } while (choice != 5);

        scanner.close();
    }
}