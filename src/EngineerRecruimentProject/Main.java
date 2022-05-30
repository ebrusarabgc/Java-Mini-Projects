package EngineerRecruimentProject;

public class Main {
    public static void main(String[] args) {
        ComputerEngineer computerEngineer1 = new ComputerEngineer(false,false);

        computerEngineer1.militaryServiceStatus();
        computerEngineer1.criminalRecordQuery();
        computerEngineer1.graduationGrade(3.07);

        String[] experience1 = {"Google", "Microsoft", "Amazon"};
        computerEngineer1.jobExperience(experience1);

        MechanicalEngineer mechanicalEngineer1 = new MechanicalEngineer(true,false);

        String[] experience2 = {};
        String[] references2 = {"A", "B", "C"};

        mechanicalEngineer1.militaryServiceStatus();
        mechanicalEngineer1.criminalRecordQuery();
        mechanicalEngineer1.graduationGrade(2.91);
        mechanicalEngineer1.jobExperience(experience2);
        mechanicalEngineer1.addReferences(references2);
        mechanicalEngineer1.work();
    }
}
