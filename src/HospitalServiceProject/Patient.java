package HospitalServiceProject;


public class Patient {
    private String name;
    Patient next;
    Patient previous;

    //Constructor
    public Patient(String n){
        this.name = n;
        this.next=null;
        this.previous=null;
    }

    //Getter method
    public String getName(){
        return this.name;
    }

}
