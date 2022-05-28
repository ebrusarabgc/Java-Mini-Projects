package TravellingRequirementsProject;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("Welcome to Sabiha Gökçen Airport...");

        String requirements = """
                Requirements for Going Abroad:\s
                1- You must pay full fee for going abroad (15$)\s
                2- You must not have a travel ban\s
                3- You must have visa for the country you travel.""";

        while (true) {
            System.out.println();
            System.out.println(requirements);
            System.out.println();

            Traveller traveller = new Traveller();

            System.out.println("Travel fee is checking...");
            Thread.sleep(3000);

            if (!traveller.travelFeeCheck()) {
                continue;
            }

            System.out.println();
            System.out.println("Travel ban status is checking...");
            Thread.sleep(3000);

            if (!traveller.travelBanCheck()) {
                continue;
            }

            System.out.println();
            System.out.println("Visa status is checking...");
            Thread.sleep(3000);

            if (!traveller.visaStatusCheck()) {
                continue;
            }

            System.out.println();
            System.out.println("Your transactions are completed. You can buy a plane ticket and go abroad...");
            break;
        }
    }
}
