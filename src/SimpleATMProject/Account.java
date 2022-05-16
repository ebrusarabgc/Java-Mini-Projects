package SimpleATMProject;

public class Account {

    private String name;
    private int balance;
    private String password;

    public Account(String name, int balance, String password) {
        this.name = name;
        this.balance = balance;
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void withdrawMoney(int amount) {
        if (amount > balance) {
            System.out.println("The money to be withdrawn cannot be greater than the balance. Your balance: " + balance);
        } else {
            balance -= amount;
            System.out.println("Your new balance: " + balance);
        }
    }

    public void depositMoney(int amount) {
        balance += amount;
        System.out.println("Your new balance: " + balance);
    }

}
