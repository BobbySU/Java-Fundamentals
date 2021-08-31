import java.util.Scanner;

public class CharactersInRange03 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        char a = scan.nextLine().charAt(0);
        char b = scan.nextLine().charAt(0);
        printBetuin(a, b);
    }

    private static void printBetuin(char a, char b) {
        if (a < b) {
            for (int i = a + 1; i < b; i++) {
                System.out.printf("%c ", i);
            }
        } else {
            for (int i = b + 1; i < a; i++) {
                System.out.printf("%c ", i);
            }
        }
    }
}
