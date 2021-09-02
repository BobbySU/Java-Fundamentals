import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class SoftUniParking05 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = Integer.parseInt(scan.nextLine());
        Map<String, String> map = new LinkedHashMap<>();

        for (int i = 0; i < n; i++) {
            String[] input = scan.nextLine().split(" ");
            if (input[0].equals("register")) {
                if (!map.containsKey(input[1])) {
                    map.put(input[1], input[2]);
                    System.out.printf("%s registered %s successfully%n", input[1], input[2]);
                } else {
                    System.out.printf("ERROR: already registered with plate number %s%n", map.get(input[1]));
                }
            } else if (input[0].equals("unregister")) {
                if (!map.containsKey(input[1])) {
                    System.out.printf("ERROR: user %s not found%n", input[1]);
                } else {
                    System.out.printf("%s unregistered successfully%n", input[1]);
                    map.remove(input[1]);
                }
            }
        }
        map.entrySet().forEach(entry -> System.out.println(entry.getKey() + " => " + entry.getValue()));
    }
}
