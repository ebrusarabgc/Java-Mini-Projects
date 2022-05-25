package HospitalServiceProject;


//Stack with Linked List
public class Service_2 {
    Service_1 stack; // Your stack. Use this

    // Constructor to initialize the stack
    Service_2(){
        this.stack = new Service_1();
    }

    // Utility function to add an element `x` to the stack
    public void push(Patient p){
        //Write your codes here
        if (isEmpty()){
            stack.head = stack.tail = p;
        }
        else {
            Patient temp = stack.head;
            temp.previous = p;
            p.next = temp;
            stack.head = p;
        }
    }

    // Utility function to pop a top element from the stack
    public Patient pop(){
        if(isEmpty()) {
            return null;
        }
        Patient temp = stack.head;
        stack.head = temp.next;
        stack.head.previous = null;

        return temp;
    }

    // Utility function to check if the stack is empty or not
    public Boolean isEmpty(){
        //Write your codes here
        return (size() == 0);
    }

    // Utility function to return the size of the stack
    public int size() {
        //Write your codes here
        int size = 0;
        Patient temp = stack.head;
        while (temp != null) {
            size++;
            temp = temp.next;
        }
        return size;
    }

}
