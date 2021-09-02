import java.util.*;

public class Courses06 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Map<String, List<String>> courses = new LinkedHashMap<>();
        String[] input = scan.nextLine().split(" : ");
        while (!input[0].equals("end")) {
            if (!courses.containsKey(input[0])) {
                courses.put(input[0], new ArrayList<>());
            }
            courses.get(input[0]).add(input[1]);
            input = scan.nextLine().split(" : ");
        }
        courses.entrySet().stream().sorted((e1, e2) -> Integer.compare(e2.getValue().size(), e1.getValue().size()))
                //descending order -e2.getValue().size(), e1.getValue().size()
                .forEach(entry -> {
                    System.out.printf("%s: %d%n", entry.getKey(), entry.getValue().size());
                    entry.getValue().stream().sorted().forEach(student -> System.out.printf("-- %s%n", student));
                    //sorted() - ascending order
                });
    }
}
