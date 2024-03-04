package HomeWork6;
public class PasswordChecker {
    public static boolean isValidPassword(String password) {
        if (password.length() < 8) {
            return false;
        }
        if (!password.matches(".*[!@#$%^&*()-_=+|{}\\[\\]:;\"'<>,.?/0-9a-zA-Z].*")) {
            return false;
        }
        return true;
    }
}
