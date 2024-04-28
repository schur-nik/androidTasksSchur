import Exceptions.WrongLoginException;
import Exceptions.WrongPasswordException;

public class Main {
    public static void main(String[] args) {
        String login;

        // Ошибка WrongLoginException
        try {
            login = "BibaBibaBibaBibaBiba";
            Auth.validate(login, "123", "123");
            System.out.println(login + " - Успешная валидация");
        } catch (WrongLoginException e) {
            System.out.println("WrongLoginException: " + e.getMessage());
        } catch (WrongPasswordException e) {
            System.out.println("WrongPasswordException: " + e.getMessage());
        }

        // Ошибка WrongPasswordException
        try {
            login = "Biba";
            Auth.validate("Biba", "123", "1234");
            System.out.println(login + " - Успешная валидация");
        } catch (WrongLoginException e) {
            System.out.println("WrongLoginException: " + e.getMessage());
        } catch (WrongPasswordException e) {
            System.out.println("WrongPasswordException: " + e.getMessage());
        }

        // Без ошибок
        try {
            login = "Biba";
            Auth.validate("Biba", "123", "123");
            System.out.println(login + " - Успешная валидация");
        } catch (WrongLoginException e) {
            System.out.println("WrongLoginException: " + e.getMessage());
        } catch (WrongPasswordException e) {
            System.out.println("WrongPasswordException: " + e.getMessage());
        }
    }
}
