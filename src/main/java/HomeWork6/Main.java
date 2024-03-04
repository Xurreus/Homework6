package HomeWork6;
import java.util.Scanner;
import java.util.Matcher;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your password: ");
        String password = scanner.nextLine();
        if (isValidPassword(password)) {
            System.out.println("Valid password");
        } else {
            System.out.println("Invalid password!!!");
        }
        scanner.close();
    }

    public static boolean isValidPassword(String password) {
        return password.length() >= 8 && password.matches(".*[a-zA-Z].*") && password.matches(".*\\d.*") && password.matches(".*[^a-zA-Z0-9].*");
    }
}


