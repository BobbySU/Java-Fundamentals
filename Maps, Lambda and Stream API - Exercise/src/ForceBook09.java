import java.util.*;

public class ForceBook09 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Map<String, List<String>> map = new LinkedHashMap<>();

        String input = scan.nextLine();
        while (!input.equals("Lumpawaroo")) {
            if (input.contains("|")) {
                String[] in = input.split("\\s+\\|\\s+");
                map.putIfAbsent(in[0], new ArrayList<>());
                boolean find = false;
                for (List<String> n : map.values()) {
                    if (n.contains(in[1])) {
                        find = true;
                    }
                }
                if (!find) {
                    map.get(in[0]).add(in[1]);
                }
            } else if (input.contains("->")) {
                String[] in = input.split("\\s+->\\s+");
                String finalInput = in[0];
                map.entrySet().forEach(e -> e.getValue().remove(finalInput));
                map.putIfAbsent(in[1], new ArrayList<>());
                map.get(in[1]).add(in[0]);
                System.out.printf("%s joins the %s side!%n", in[0], in[1]);
            }
            input = scan.nextLine();
        }
        map.entrySet().stream().filter(el -> el.getValue().size() > 0)
                .sorted((e1, e2) -> {
                    int sort = Integer.compare(e2.getValue().size(), e1.getValue().size());
                    if (sort == 0) {
                        sort = e1.getKey().compareTo(e2.getKey());
                    }
                    return sort;
                })
                .forEach(e -> {
                    System.out.printf("Side: %s, Members: %d%n", e.getKey(), e.getValue().size());
                    e.getValue().stream().sorted().forEach(user -> System.out.println("! " + user));
                });
    }
}

