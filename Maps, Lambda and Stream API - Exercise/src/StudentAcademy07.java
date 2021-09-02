import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class StudentAcademy07 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = Integer.parseInt(scan.nextLine());
        Map<String, Double> map = new LinkedHashMap<>();
        for (int i = 0; i < n; i++) {
            String name = scan.nextLine();
            double score = Double.parseDouble(scan.nextLine());
            map.putIfAbsent(name, score);
            if (map.containsKey(name)) {
                map.put(name, (score + map.get(name)) / 2);
            }
        }
        map.entrySet().stream().sorted((e1, e2) -> Double.compare(e2.getValue(), e1.getValue()))
                .forEach(e -> {
                    if (e.getValue() >= 4.50) {
                        System.out.printf("%s -> %.2f%n", e.getKey(), e.getValue());
                    }
                });
    }
}
