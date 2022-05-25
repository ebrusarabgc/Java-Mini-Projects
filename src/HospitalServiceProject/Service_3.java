package HospitalServiceProject;


//Queue with Linked List
public class Service_3 {
    Service_1 queue; // Your queue. Use this

    // Constructor to initialize a queue
    Service_3() {
        this.queue = new Service_1();
    }

    // Utility function to dequeue the front element
    public Patient dequeue() {
        //Write your codes here
        if(isEmpty()) {
            return null;
        }
        Patient temp = queue.head;
        queue.head = temp.next;
        queue.head.previous = null;

        return temp;
    }

    // Utility function to add an item to the queue
    public void enqueue(Patient p) {
        //Write your codes here
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
        //Write your codes here
        return (size() == 0);
    }

    // Utility function to return the size of the queue
    public int size() {
        //Write your codes here
        int size = 0;
        Patient temp = queue.head;
        while (temp != null) {
            size++;
            temp = temp.next;
        }
        return size;
    }

}
