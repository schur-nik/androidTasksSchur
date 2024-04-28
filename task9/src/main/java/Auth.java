import Exceptions.WrongLoginException;
import Exceptions.WrongPasswordException;

public class Auth {
    public static void validate(String login, String password, String confirmPassword) throws WrongLoginException, WrongPasswordException {
        if (login.length() >= 20) {
            throw new WrongLoginException("Логин должен быть меньше 20 символов. Длинна введенного логина: " + login.length());
        }

        if (!password.equals(confirmPassword)) {
            throw new WrongPasswordException("Введённые пароли не совпадают");
        }
        if (password.length() >= 20) {
            throw new WrongPasswordException("Пароль должен быть меньше 20 символов. Длинна введенного пароля: " + login.length());
        }
    }
}
