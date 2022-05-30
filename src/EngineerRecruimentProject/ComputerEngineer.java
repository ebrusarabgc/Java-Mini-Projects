package EngineerRecruimentProject;

public class ComputerEngineer implements IEngineer {
    private final boolean militaryService;
    private final boolean criminalRecord;

    public ComputerEngineer(boolean militaryService, boolean criminalRecord) {
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
        System.out.println("I worked these companies as a computer engineer: ");

        for (String s : arr) {
            System.out.println("-" + s);
        }
    }
}
