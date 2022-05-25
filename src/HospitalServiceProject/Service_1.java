package HospitalServiceProject;

//**************Double Linked List************************//
public class Service_1 {
    Patient head; //head of list
    Patient tail; //tail of list

    //Constructor
    public Service_1() {
        //Write your codes here
        head = null;
        tail = null;
    }

    //Check list is empty or not
    public boolean isEmpty() {
        //Write your codes here
        return (size() == 0);
    }

    //This function first builds new patient with the given data
    //than adds it to the LinkedList
    //new nodes are added to the tail of LinkedList
    public void insert(String name) {
        //Write your codes here
        Patient patient = new Patient(name);
        if (isEmpty()){
            head = tail = patient;
        }else {
            tail.next = patient;
            patient.previous = tail;
            tail = patient;
            tail.next = null;
        }
    }

    // overload this method as new nodes are added to given position (int pos)
    // fill the rest
    public void insert(String name, int pos) {
        //Write your codes here
        Patient patient = new Patient(name);
        if (isEmpty()){
            head = tail = patient;
        }
        else {
            Patient temp = head;
            int index = 0 ;
            while (temp != null){
                if (index == pos)
                    break;
                temp = temp.next;
                index++;
            }
            if (temp.previous == null){
                temp.previous = patient;
                patient.next = temp;
                head = patient;
            } else {
                temp = temp.previous;
                Patient patientNext = temp.next;

                patient.next = patientNext;
                patientNext.previous = patient;

                temp.next = patient;
                patient.previous = temp;
            }
        }
    }

    //This method finds how many patients are exist in LinkedList
    public int size() {
        //Write your codes here
        int size = 0;
        Patient temp = head;
        while (temp != null) {
            size++;
            temp = temp.next;
        }
        return size;
    }

    // This functions delete a node in the LinkedList by a given "data"
    // parameter name changed as key in order to prevent confusion
    public Patient deleteByName(String name) {
        //Write your codes here
        Patient temp = head;
        while (temp != null){
            if (temp.getName().equals(name))
                break;
            temp = temp.next;
        }
        if (temp == head) {
            head = temp.next;
            head.previous = null;
        } else if (temp == tail){
            tail = tail.previous;
            tail.next = null;
        } else {
            temp.previous.next = temp.next;
            temp.next.previous = temp.previous;
        }
        return temp;
    }

    // This functions delete a node in the LinkedList by a given position
    public Patient deleteByPosition(int pos) {
        //Write your codes here
        Patient temp = head;
        System.out.println(temp.getName());
        int index = 0 ;
        while (temp != null){
            if (index == pos)
                break;
            temp = temp.next;
            index++;
        }
        if (temp == head) {
            head = temp.next;
            head.previous = null;
        } else if (temp == tail){
            tail = tail.previous;
            tail.next = null;
        } else {
            temp.previous.next = temp.next;
            temp.next.previous = temp.previous;
        }
        return temp;
    }

    //This function get the node in the given index
    //*********************DO NOTHING*********************
    public Patient getByPosition(int pos){
        if(this.isEmpty())
            return new Patient("empty");
        Patient current = this.head;
        int index = 0;

        while (current != null){
            if(index++ == pos)
                break;
            current = current.next;
        }

        if(current == null)
            return new Patient("empty");

        return current;
    }

    // This function prints  the LinkenList
    //*********************DO NOTHING*********************
    public void print() {

        if(this.isEmpty())
            return;
        Patient patient = this.head;  // make a copy of head
        int index = 1;

        // never operate on "head", otherwise you will lost the linkedlist
        //unless you want to change "head"
        while (patient != null) {
            System.out.println(index++ + ". " + patient.getName());

            patient = patient.next;  // iterate to next node
        }

    }

}
