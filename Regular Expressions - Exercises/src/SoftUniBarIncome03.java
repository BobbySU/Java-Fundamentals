import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SoftUniBarIncome03 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

//        String regex = "%([A-Z][a-z]*)%[^|$%.]*<(\\w+)>[^|$%.]*\\|([0-9]+)\\|[^|$%.]*?([0-9]+\\.*[0-9]*)\\$";
        String regex = "%([A-Z][a-z]+)%[^$%.|]*<(\\w+)>[^$%.|]*\\|(\\d+)\\|[^$%.|]*?(\\d+.*\\d*)\\$";
        Pattern pattern = Pattern.compile(regex);
        double totalSum = 0;

        String input = scan.nextLine();
        while (!input.equals("end of shift")) {
            Matcher matcher = pattern.matcher(input);
            if (matcher.find()) {
                String name = matcher.group(1);
                String produkt = matcher.group(2);
                int num = Integer.parseInt(matcher.group(3));
                double prise = Double.parseDouble(matcher.group(4));
                System.out.printf("%s: %s - %.2f%n", name, produkt, num * prise);
                totalSum += num * prise;
            }
            input = scan.nextLine();
        }
        System.out.printf("Total income: %.2f", totalSum);
    }
}
