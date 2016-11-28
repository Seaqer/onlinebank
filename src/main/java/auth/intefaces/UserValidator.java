package auth.intefaces;

/**
 * Created by Артём on 27.11.2016.
 */
public interface UserValidator {
    boolean validateLogin(String login);
    boolean validatePassword(char[] password);
    boolean validateEmail(String password);
}
