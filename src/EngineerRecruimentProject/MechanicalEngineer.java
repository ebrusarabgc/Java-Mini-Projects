package EngineerRecruimentProject;

public class MechanicalEngineer implements IEngineer, IWorking {
    private final boolean militaryService;
    private final boolean criminalRecord;

    public MechanicalEngineer(boolean militaryService, boolean criminalRecord) {
        this.militaryService = militaryService;
        this.criminalRecord = criminalRecord;
    }

    @Override
    public void militaryServiceStatus() {
        if(militaryService) {
            System.out.println("I did military service.");
        } else {
            System.out.println("I didn't do military service yet.");
        }

    }

    @Override
    public void graduationGrade(double GPA) {
    }

    @Override
    public void criminalRecordQuery() {
        if(criminalRecord) {
            System.out.println("I have criminal record.");
        } else {
            System.out.println("I don't have criminal record.");
        }

    }

    @Override
    public void jobExperience(String[] arr) {
        if(arr.length == 0) {
            System.out.println("I don't have any job experience.");
        } else {
            System.out.println("I worked these companies as a mechanical engineer: ");

            for (String s : arr) {
                System.out.println("-" + s);
            }
        }
    }

    public void addReferences(String[] arr) {
        if (arr.length == 0) {
            System.out.println("I don't have any references.");
        } else {
            System.out.println("My references: ");
            for (String s : arr) {
                System.out.print(s + " ");
            }
            System.out.println();
        }
    }

    @Override
    public void work() {
        System.out.println("Mechanical engineer is working...");
    }
}
