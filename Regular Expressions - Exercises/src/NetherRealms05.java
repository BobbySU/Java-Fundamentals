import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class NetherRealms05 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        List<String> demons = Arrays.stream(scan.nextLine().split("[, ]+")).sorted().collect(Collectors.toList());

//        Pattern pattern = Pattern.compile("([^\\d+\\-*.\\/])");
//        Pattern patternDamage = Pattern.compile("(-?\\d+\\.?\\d*)");
//        Pattern patternSymbol = Pattern.compile("([*/])");
        Pattern pattern = Pattern.compile("[^\\d+\\-*\\/.]");
        Pattern patternDamage = Pattern.compile("\\-?\\d+\\.*\\d*");
        Pattern patternSymbol = Pattern.compile("[*\\/]");

        for (String e : demons) {
            int health = 0;
            double damage = 0;
            Matcher matcher = pattern.matcher(e);
            Matcher matcherDamage = patternDamage.matcher(e);
            Matcher matcherSymbol = patternSymbol.matcher(e);
            while (matcher.find()) {
                health += matcher.group().charAt(0);
            }
            while (matcherDamage.find()) {
                damage += Double.parseDouble(matcherDamage.group());
            }
            while (matcherSymbol.find()) {
                if (matcherSymbol.group().equals("*")) {
                    damage *= 2;
                } else {
                    damage /= 2;
                }
            }
            System.out.printf("%s - %d health, %.2f damage%n", e, health, damage);
        }
    }
}