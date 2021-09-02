import java.util.Scanner;

public class ValidUsernames01 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String[] words = scan.nextLine().split(", ");

        for (String word : words) {
            if (check(word)) {
                System.out.println(word);
            }
        }
    }

    private static boolean check(String word) {
        if (!(word.length() >= 3 && word.length() <= 16)) {
            return false;
        }
        for (char ch : word.toCharArray()) {
            if (!(Character.isLetterOrDigit(ch) || ch == '-' || ch == '_')) {
                return false;
            }
        }
        return true;
    }
}
