import java.util.Scanner;

public class TextFilter04 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String[] words = scan.nextLine().split(", ");
        String text = scan.nextLine();

        for (String word : words) {
            String del = "*";
            del = del.repeat(word.length());
            text = text.replace(word, del);
        }
        System.out.println(text);
    }
}
