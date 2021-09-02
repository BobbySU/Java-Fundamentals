import java.util.*;

public class CompanyUsers08 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Map<String, List<String>> map = new TreeMap<>();

        String[] input = scan.nextLine().split(" -> ");
        while (!input[0].equals("End")) {
            map.putIfAbsent(input[0], new ArrayList<>());
            if (!map.get(input[0]).contains(input[1])) {
                map.get(input[0]).add(input[1]);
            }
            input = scan.nextLine().split(" -> ");
        }
        map.entrySet().stream().forEach(entry -> {
            System.out.printf("%s%n", entry.getKey());
            entry.getValue().stream().forEach(e -> System.out.printf("-- %s%n", e));
        });
    }
}
