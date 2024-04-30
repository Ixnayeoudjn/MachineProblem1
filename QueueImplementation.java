public class QueueImplementation {
    int queue[];
    int front = -1, rear = -1;
    int queueSize = 0; 

    public void queueCreation (int length) {
        queueSize = length;
        queue = new int[queueSize];
        System.out.println("Successfully created a queue with a size of " + queueSize + "\n");
    }

    public boolean emptyChecker() {
        return (queue == null);
    }

    public boolean fullChecker() {
        return (rear == queueSize - 1);
    } 

    public void enqueue (int queueElement) {
        if (front == -1 && rear == -1) {
            front = 0;
            rear = 0; 
            queue[rear] = queueElement;
            System.out.println("Element succesfully added to the queue");
        } else {
            if (front == -1) {
                front = 0;
            }
            rear++;
            queue[rear] = queueElement;
            System.out.println("Element succesfully added to the queue");
        }
    }

    public void dequeue () {
        if (front == rear) {
            front = -1;
            rear = -1;
            System.out.println("The queue is now empty.");
        } else {
            front++;
            System.out.println("Element succesfully remove from the queue");
        }
    }

    public void queuePrint() {
        if (front == -1 && rear == -1) {
            System.out.println("Queue is Empty");
        } else {
            System.out.println("Current Queue:");
            for (int i = front; i <= rear; i++) {
                System.out.print("[" + queue[i] + "] ");
            }
        }
        System.out.println("");
    }

    public int frontQueue() {
        return queue[front];
    }

    public int rearQueue() {
        return queue[rear];
    }
}