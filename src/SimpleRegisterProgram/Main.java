package SimpleRegisterProgram;

public class Main {
    public static void main(String[] args) {
        SignUpManager signUpManager = new SignUpManager(new UserAgeCheckingService());
        signUpManager.signUp(new User(1, "Ebru", 21));

    }
}
