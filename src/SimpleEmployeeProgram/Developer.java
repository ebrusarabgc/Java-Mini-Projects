package SimpleEmployeeProgram;

public class Developer extends Employee{
    private final String language;

    public Developer(String name, String surname, int id, String language) {
        super(name, surname, id);
        this.language = language;
    }

    public void format(String OS) {
        System.out.println(getName() + " " + getSurname() + " formats " + OS);
    }

    @Override
    public void showInfo() {
        super.showInfo();
        System.out.println("The Language The Developer Works on: " + language);
    }
}
