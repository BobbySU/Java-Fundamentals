import java.util.Scanner;

public class ReplaceRepeatingChars06 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String input = scan.nextLine();
        StringBuilder text = new StringBuilder();
        text = text.append(input.charAt(0));
        for (int i = 1; i < input.length(); i++) {
            if (text.charAt(text.length() - 1) != input.charAt(i)) {
                text = text.append(input.charAt(i));
            }
        }
        System.out.println(text);
    }
}
