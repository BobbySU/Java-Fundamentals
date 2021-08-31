import java.util.Scanner;

public class MiddleCharacters06 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String input = scan.nextLine();
        printMid(input);
    }

    private static void printMid(String input) {
        if (input.length() % 2 != 0) {
            int mid = input.length() / 2;
            System.out.printf("%c", input.charAt(mid));
        } else {
            int mid = input.length() / 2;
            System.out.printf("%c%c", input.charAt(mid - 1), input.charAt(mid));
        }
    }
}
