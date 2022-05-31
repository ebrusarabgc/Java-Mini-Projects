package SimpleRegisterProgram;

public class SignUpManager {
    private IUserCheckingService userCheckingService;

    public SignUpManager(IUserCheckingService userCheckingService) {
        this.userCheckingService = userCheckingService;
    }

    public void signUp(User user) {
        if (userCheckingService.checkUser(user)) {
            System.out.println(user.getName() + " named user signed in.");
        } else {
            System.out.println(user.getName() + " named user could not sign in.");
        }
    }
}
