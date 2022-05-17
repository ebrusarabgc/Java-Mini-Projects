package SimpleATMProgram;

public class Main {
    public static void main(String[] args) {
        ATM atm = new ATM();
        Account account1 = new Account("Ebru Bağca", 2000, "password");

        atm.run(account1);

        System.out.println("Exiting ATM program...");
    }
}
