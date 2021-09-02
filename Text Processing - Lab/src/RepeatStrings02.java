import java.util.Scanner;

public class RepeatStrings02 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String[] words = scan.nextLine().split(" ");
        StringBuilder result = new StringBuilder();

        for (String e : words) {
            for (int i = 0; i < e.length(); i++) {
                result.append(e);
            }
        }
        System.out.println(result);
    }
}
