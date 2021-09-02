import java.util.*;

public class Orders04 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Map<String, List<Double>> map = new LinkedHashMap<>();
        String[] input = scan.nextLine().split(" ");
        while (!input[0].equals("buy")) {
            List<Double> num = new ArrayList<>(2);
            if (map.containsKey(input[0])) {
                double two = map.get(input[0]).get(1);
                num.add(Double.parseDouble(input[1]));
                num.add(1, Double.parseDouble(input[2]) + two);
                map.put(input[0], num);
            } else {
                num.add(Double.parseDouble(input[1]));
                num.add(Double.parseDouble(input[2]));
                map.put(input[0], num);
            }
            input = scan.nextLine().split(" ");
        }
        map.entrySet().forEach(entry -> System.out.printf
                ("%s -> %.2f%n", entry.getKey(), (entry.getValue().get(0)) * entry.getValue().get(1)));
    }
}
