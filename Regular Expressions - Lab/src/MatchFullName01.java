import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MatchFullName01 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String text = scan.nextLine();
        String shablon = "(?<first>\\b[A-Z][a-z]+) (?<last>[A-Z][a-z]+\\b)";

        Pattern regex = Pattern.compile(shablon);
        Matcher matcher = regex.matcher(text);

        while (matcher.find()) {
            System.out.print(matcher.group() + " ");
        }
    }
}
