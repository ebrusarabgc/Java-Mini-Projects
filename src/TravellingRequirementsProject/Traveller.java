package TravellingRequirementsProject;

import java.util.Scanner;

public class Traveller implements Requirements{
    private final int fee;
    private final boolean travelBan;
    private final boolean visaStatus;

    public Traveller() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("What is the fee you deposited?");
        fee = scanner.nextInt();

        scanner.nextLine();

        System.out.println("Do you have any travel ban? (Pres 'Y' for yes, 'N' for no)");
        String ans = scanner.next();

        travelBan = ans.equals("Y");

        System.out.println("Do you have visa? (Pres 'Y' for yes, 'N' for no)");
        String ans2 = scanner.next();

        visaStatus = ans2.equals("Y");

    }

    @Override
    public boolean travelFeeCheck() {
        if (this.fee < 15) {
            System.out.println("Please pay the full fee...");
            return false;
        } else {
            System.out.println("Payment process is completed.");
            return true;
        }
    }

    @Override
    public boolean travelBanCheck() {
        if (travelBan) {
            System.out.println("You have a travel ban, you cannot go abroad...");
            return false;
        } else {
            System.out.println("You don't have any travel ban, you are free to go abroad.");
            return true;
        }
    }

    @Override
    public boolean visaStatusCheck() {
        if (!visaStatus) {
            System.out.println("You don't have visa, you cannot go abroad.");
            return false;
        } else {
            System.out.println("Visa process is completed, you are free to go abroad. ");
            return true;
        }
    }
}
