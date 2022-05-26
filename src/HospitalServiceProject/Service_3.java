package HospitalServiceProject;

//Queue with Linked List
public class Service_3 {
    Service_1 queue;

    // Constructor to initialize a queue
    Service_3() {
        this.queue = new Service_1();
    }

    // Utility function to dequeue the front element
    public void dequeue() {
        if(isEmpty()) {
            return;
        }
        Patient temp = queue.head;
        queue.head = temp.next;
        queue.head.previous = null;

    }

    // Utility function to add an item to the queue
    public void enqueue(Patient p) {
        if (isEmpty()) {
            queue.head = queue.tail = p;
        } else {
            queue.tail.next = p;
            p.previous = queue.tail;
            queue.tail = p;
            queue.tail.next = null;
        }
    }

    // Utility function to check if the queue is empty or not
    public Boolean isEmpty() {
        return (size() == 0);
    }

    // Utility function to return the size of the queue
    public int size() {
        int size = 0;
        Patient temp = queue.head;
        while (temp != null) {
            size++;
            temp = temp.next;
        }
        return size;
    }

}
