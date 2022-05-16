package SimpleATMProject;

import java.util.Scanner;

public class LogIn {
    public static boolean logIn(Account account) {
        Scanner scanner = new Scanner(System.in);

        String name;
        String password;

        System.out.print("User Name: ");
        name = scanner.nextLine();

        System.out.print("Password: ");
        password = scanner.nextLine();

        return (account.getName().equals(name) && account.getPassword().equals(password));
    }
}
