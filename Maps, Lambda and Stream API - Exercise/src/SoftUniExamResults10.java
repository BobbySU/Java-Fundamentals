import java.util.*;

public class SoftUniExamResults10 {
    public static void main(String[] args) {
        try (Scanner scan = new Scanner(System.in)) {

            Map<String, Integer> map = new LinkedHashMap<>();
            Map<String, Integer> curs = new LinkedHashMap<>();

            String input = scan.nextLine();
            while (!input.equals("exam finished")) {
                String[] in = input.split("-");
                if (in[1].equals("banned")) {
                    if (map.containsKey(in[0])) {
                        map.put(in[0], -1);
                    }
                } else {
                    curs.putIfAbsent(in[1], 0);
                    if (curs.containsKey(in[1])) {
                        curs.put(in[1], curs.get(in[1]) + 1);
                    }
                    map.putIfAbsent(in[0], Integer.valueOf(in[2]));
                    if (map.containsKey(in[0])) {
                        int score = Integer.parseInt(in[2]);
                        if (score > map.get(in[0])) {
                            map.put(in[0], Integer.valueOf(in[2]));
                        }
                    }
                }
                input = scan.nextLine();
            }
            System.out.println("Results:");
            map.entrySet().stream().filter(e -> e.getValue() > 0)
//                    .sorted(Map.Entry.<String, Integer>comparingByValue().reversed()
//                            .thenComparing(Map.Entry.comparingByKey()))
                    .sorted((e1, e2) -> {
                        int sort = Integer.compare(e2.getValue(), e1.getValue());
                        if (sort == 0) {
                            sort = e1.getKey().compareTo(e2.getKey());
                        }
                        return sort;
                    })
                    .forEach(e -> System.out.printf("%s | %d%n", e.getKey(), e.getValue()));
            System.out.println("Submissions:");
            curs.entrySet().stream()
                    .sorted((e1, e2) -> {
                        int sort = Integer.compare(e2.getValue(), e1.getValue());
                        if (sort == 0) {
                            sort = e1.getKey().compareTo(e2.getKey());
                        }
                        return sort;
                    })
                    .forEach(e -> System.out.printf("%s - %d%n", e.getKey(), e.getValue()));
        }
    }
}
