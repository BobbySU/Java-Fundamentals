import java.util.Scanner;

public class Substring03 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String word = scan.nextLine();
        String text = scan.nextLine();

        while (text.indexOf(word) != -1) {
            text = text.replace(word, "");
        }
        System.out.println(text);
    }
}
