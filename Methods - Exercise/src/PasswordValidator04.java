import java.util.Scanner;

public class PasswordValidator04 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String input = scan.nextLine();

        if (!lenght(input)) {
            System.out.println("Password must be between 6 and 10 characters");
        }
        if (!letters(input)) {
            System.out.println("Password must consist only of letters and digits");
        }
        if (!digits(input)) {
            System.out.println("Password must have at least 2 digits");
        }
        if (lenght(input) && letters(input) && digits(input)) {
            System.out.println("Password is valid");
        }
    }

    private static boolean lenght(String input) {
        if (input.length() >= 6 && input.length() <= 10) {
            return true;
        }
        return false;
    }

    private static boolean letters(String input) {
        boolean noChar = false;
        for (int i = 0; i < input.length(); i++) {
            char in = input.charAt(i);
            if (Character.isLetterOrDigit(in)) {
            } else {
                noChar = true;
            }
        }
        if (!noChar) {
            return true;
        }
        return false;
    }

    private static boolean digits(String input) {
        int count = 0;
        for (int i = 0; i < input.length(); i++) {
            char in = input.charAt(i);
            if (Character.isDigit(in)) {
                count++;
            }
        }
        if (count < 2) {
            return false;
        }
        return true;
    }
}
