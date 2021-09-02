import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Furniture01 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        List<String> furniture = new ArrayList<>();
        double totalSum = 0;
        String input = scan.nextLine();
        while (!input.equals("Purchase")) {

            Pattern regex = Pattern.compile(">>(\\w+)<<(\\d+.?\\d*)!(\\d+)");
            Matcher matcher = regex.matcher(input);
            if (matcher.find()) {
                String futnit = matcher.group(1);
                double price = Double.parseDouble(matcher.group(2));
                int num = Integer.parseInt(matcher.group(3));

                furniture.add(futnit);
                double sum = price * num;
                totalSum += sum;
            }
            input = scan.nextLine();
        }
        System.out.println("Bought furniture:");
        for (String e : furniture) {
            System.out.println(e);
        }
        System.out.printf("Total money spend: %.2f", totalSum);
    }
}
