import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class Race02 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        List<String> name = Arrays.stream(scan.nextLine().split(",\\s+")).collect(Collectors.toList());
        Map<String, Integer> namesAll = new LinkedHashMap<>();
        name.forEach(e -> namesAll.put(e, 0));

        Pattern lether = Pattern.compile("[A-Za-z]+");
        Pattern digit = Pattern.compile("\\d");

        String input = scan.nextLine();
        while (!input.equals("end of race")) {
            StringBuilder mchedName = new StringBuilder();
            int distance = 0;
            Matcher letherName = lether.matcher(input);
            while (letherName.find()) {
                mchedName.append(letherName.group());
            }
            if (name.contains(mchedName.toString())) {
                Matcher digitName = digit.matcher(input);
                while (digitName.find()) {
                    distance += Integer.parseInt(digitName.group());
                }
                int distanceTo = namesAll.get(mchedName.toString());
                namesAll.put(mchedName.toString(), distanceTo + distance);
            }
            input = scan.nextLine();
        }
        List<String> result = namesAll.entrySet().stream()
                .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
                .limit(3)
                .map(Map.Entry::getKey)
                .collect(Collectors.toList());

        System.out.printf("1st place: %s%n2nd place: %s%n3rd place: %s", result.get(0), result.get(1), result.get(2));
    }
}