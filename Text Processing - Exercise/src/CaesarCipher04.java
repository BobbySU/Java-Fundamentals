import java.util.Scanner;

public class CaesarCipher04 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String input = scan.nextLine();
        StringBuilder text = new StringBuilder();

        for (int i = 0; i < input.length(); i++) {
            char a = (char) (input.charAt(i) + 3);
            text = text.append(a);
        }
        System.out.println(text);
    }
}
