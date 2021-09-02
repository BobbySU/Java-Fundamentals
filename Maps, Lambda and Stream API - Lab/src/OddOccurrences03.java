import java.util.*;

public class OddOccurrences03 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String[] input = scan.nextLine().toLowerCase().split(" ");
        Map<String, Integer> list = new LinkedHashMap<>();
        for (String n : input) {
            if (!list.containsKey(n)) {
                list.put(n, 1);
            } else {
                int count = list.get(n) + 1;
                list.put(n, count);
            }
        }
        List<String> odd = new ArrayList<>();
        for (var n : list.entrySet()) {
            if (n.getValue() % 2 == 1) {
                odd.add(n.getKey());
            }
        }
        for (int i = 0; i < odd.size(); i++) {
            System.out.print(odd.get(i));
            if (i < odd.size() - 1) {
                System.out.print(", ");
            }
        }
    }
}
