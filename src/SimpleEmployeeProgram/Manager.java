package SimpleEmployeeProgram;

public class Manager extends Employee{
    private int managedPersonNum;

    public Manager(String name, String surname, int id, int managedPersonNum) {
        super(name, surname, id);
        this.managedPersonNum = managedPersonNum;
    }

    public void fire() {
        managedPersonNum--;
    }

    public void hire() {
        managedPersonNum++;
    }

    @Override
    public void showInfo() {
        super.showInfo();
        System.out.println("The Number of Managed Person: " + managedPersonNum);
    }
}
