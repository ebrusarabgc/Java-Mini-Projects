package SimpleRegisterProgram;

public class UserNameCheckingService implements IUserCheckingService {
    @Override
    public boolean checkUser (User user) {
        return user.getName().startsWith("Eb");
    }
}
