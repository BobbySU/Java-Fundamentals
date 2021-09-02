import java.util.*;
import java.util.stream.Collectors;

public class LegendaryFarming03 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Map<String, Integer> map = new LinkedHashMap<>();
        Map<String, Integer> junk = new TreeMap<>();
        map.put("fragments", 0);
        map.put("motes", 0);
        map.put("shards", 0);
        boolean faund = false;
        String isFaund = "";

        while (!faund) {
            String[] input = scan.nextLine().toLowerCase().split(" ");
            for (int i = 0; i < input.length; i += 2) {
                int vol = Integer.parseInt(input[i]);
                String word = input[i + 1];
                if (map.containsKey(word)) {
                    map.put(word, map.get(word) + vol);
                    if (map.get(word) >= 250) {
                        isFaund = word;
                        map.put(isFaund, map.get(isFaund) - 250);
                        printFaund(isFaund);
                        faund = true;
                        break;
                    }
                } else {
                    if (junk.containsKey(word)) {
                        junk.put(word, junk.get(word) + vol);
                    } else {
                        junk.put(word, vol);
                    }
                }
            }
        }
        printMap(map);
        printJunk(junk);
    }

    private static void printJunk(Map<String, Integer> junk) {
        junk.entrySet().forEach(entry -> System.out.println(entry.getKey() + ": " + entry.getValue()));
    }

    private static void printMap(Map<String, Integer> map) {
        Map<String, Integer> sortedMap = map.entrySet().stream()
                .sorted(Comparator.comparingInt(e -> -e.getValue()))
                .collect(Collectors.toMap(
                        Map.Entry::getKey,
                        Map.Entry::getValue,
                        (a, b) -> {
                            throw new AssertionError();
                        },
                        LinkedHashMap::new
                ));
        sortedMap.entrySet().forEach(entry -> System.out.println(entry.getKey() + ": " + entry.getValue()));
    }

    private static void printFaund(String isFaund) {
        switch (isFaund) {
            case "shards":
                System.out.println("Shadowmourne obtained!");
                break;
            case "fragments":
                System.out.println("Valanyr obtained!");
                break;
            case "motes":
                System.out.println("Dragonwrath obtained!");
                break;
        }
    }
}
