package HospitalServiceProject;

public class Service_1 {
    Patient head; //head of list
    Patient tail; //tail of list

    //Constructor
    public Service_1() {
        head = null;
        tail = null;
    }

    //Checking list is empty or not
    public boolean isEmpty() {
        return (size() == 0);
    }

    // This function first builds new patient with the given than adds it to the LinkedList
    // New nodes are added to the tail of LinkedList
    public void insert(String name) {
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

    // overloading this method as new nodes are added to given position (int pos)
    public void insert(String name, int pos) {
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
            assert temp != null;
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

    // This method finds how many patients exist in LinkedList
    public int size() {
        int size = 0;
        Patient temp = head;
        while (temp != null) {
            size++;
            temp = temp.next;
        }
        return size;
    }

    // This function deletes a node in the LinkedList by a given "data"
    // Parameter name changed as key in order to prevent confusion
    public void deleteByName(String name) {
        Patient temp = head;
        while (temp != null){
            if (temp.getName().equals(name))
                break;
            temp = temp.next;
        }
        if (temp == head) {
            assert temp != null;
            head = temp.next;
            head.previous = null;
        } else if (temp == tail){
            tail = tail.previous;
            tail.next = null;
        } else {
            assert temp != null;
            temp.previous.next = temp.next;
            temp.next.previous = temp.previous;
        }
    }

    // This function deletes a node in the LinkedList by a given position
    public void deleteByPosition(int pos) {
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
            assert temp != null;
            head = temp.next;
            head.previous = null;
        } else if (temp == tail){
            tail = tail.previous;
            tail.next = null;
        } else {
            assert temp != null;
            temp.previous.next = temp.next;
            temp.next.previous = temp.previous;
        }
    }

    // This function gets the node in the given index
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

    // This function prints the LinkedList
    public void print() {

        if(this.isEmpty())
            return;
        Patient patient = this.head;  // makes a copy of head
        int index = 1;

        // Never operate on "head", otherwise you will lose the LinkedList unless you want to change "head"
        while (patient != null) {
            System.out.println(index++ + ". " + patient.getName());

            patient = patient.next;  // iterates to next node
        }

    }

}
