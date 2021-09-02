import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExtractEmails06 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String input = scan.nextLine();

        List<String> mail = new ArrayList<>();

        Pattern pattern = Pattern.compile("[A-za-z0-9]+[.\\-_]?[A-Za-z0-9]+@[A-Za-z]+-?[A-Za-z]+(\\.[A-Za-z]+-?[A-Za-z])+");
//        Pattern pattern = Pattern.compile("(^|(?<=\\s))(([a-zA-Z0-9]+)([\\.\\-_]?)([A-Za-z0-9]+)(@)([a-zA-Z]+([\\.\\-_][A-Za-z]+)+))(\\b|(?=\\s))");
        Matcher matcher = pattern.matcher(input);

        while (matcher.find()) {
            mail.add(matcher.group());
        }
        for (String e : mail) {
            System.out.println(e);
        }
    }
}
