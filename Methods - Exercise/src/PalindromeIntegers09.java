import java.util.Scanner;

public class PalindromeIntegers09 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String input = scan.nextLine();

        while (!input.equals("END")) {
            if (polindrom(input)) {
                System.out.println("true");
            } else {
                System.out.println("false");
            }
            input = scan.nextLine();
        }
    }

    private static boolean polindrom(String n) {
        String revers = reversN(n);
        if (n.equals(revers)) {
            return true;
        }
        return false;
    }

    private static String reversN(String n) {
        String revers = "";
        for (int i = n.length() - 1; i >= 0; i--) {
            revers += n.charAt(i);
        }
        return revers;
    }
}
