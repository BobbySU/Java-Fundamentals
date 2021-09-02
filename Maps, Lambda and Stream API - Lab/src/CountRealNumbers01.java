import java.util.Arrays;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class CountRealNumbers01 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String[] input = scan.nextLine().split(" ");
        double[] num = Arrays.stream(input)
                .mapToDouble(Double::parseDouble)
                .toArray();
        Map<Double, Integer> map = new TreeMap<>();

        for (double n : num) {
            if (!map.containsKey(n)) {
                map.put(n, 1);
            } else {
                int count = map.get(n);
                count++;
                map.put(n, count);
            }
        }
        for (Map.Entry<Double, Integer> entry : map.entrySet()) {
            System.out.printf("%.0f -> %d%n", entry.getKey(), entry.getValue());
        }
    }
}
