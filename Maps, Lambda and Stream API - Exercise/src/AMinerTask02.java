import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class AMinerTask02 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String input = scan.nextLine();
        Map<String, Integer> map = new LinkedHashMap<>();

        while (!input.equals("stop")) {
            int sum = Integer.parseInt(scan.nextLine());
            if (map.containsKey(input)) {
                map.put(input, map.get(input) + sum);
            } else {
                map.put(input, sum);
            }
            input = scan.nextLine();
        }
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.printf("%s -> %d%n", entry.getKey(), entry.getValue());
        }
//        map.entrySet().forEach(entry -> System.out.println(entry.getKey()+" -> "+entry.getValue()));
    }
}
