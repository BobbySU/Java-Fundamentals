import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MatchPhoneNumber02 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String text = scan.nextLine();
        String shablon = "\\+359([- ])2\\1\\d{3}\\1\\d{4}\\b";

        Pattern regex = Pattern.compile(shablon);
        Matcher matcher = regex.matcher(text);

        List<String> phone = new ArrayList<>();

        while (matcher.find()) {
            phone.add(matcher.group());
        }
        System.out.print(phone.toString().replaceAll("[\\[\\]]", ""));
    }
}
