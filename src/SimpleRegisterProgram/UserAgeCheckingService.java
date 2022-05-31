package SimpleRegisterProgram;

public class UserAgeCheckingService implements IUserCheckingService {
    @Override
    public boolean checkUser(User user) {
        return user.getAge() > 18;
    }
}
