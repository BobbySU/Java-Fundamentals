import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MatchDates03 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String text = scan.nextLine();
        String shablon = "\\b(?<Day>\\d{2})([/ .-])(?<Month>[A-z][a-z]{2})\\2(?<Year>\\d{4})\\b";

        Pattern regex = Pattern.compile(shablon);
        Matcher matcher = regex.matcher(text);

        while (matcher.find()) {
            System.out.printf("Day: %s, Month: %s, Year: %s%n", matcher.group(1), matcher.group(3), matcher.group(4));
        }
    }
}
