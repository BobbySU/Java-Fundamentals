package Students05;
import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        List<Students> people = new ArrayList<>();
        int n = Integer.parseInt(scan.nextLine());
        for (int i = 0; i < n; i++) {
            String[] input = scan.nextLine().split(" ");
            Students student = new Students(input[0], input[1], Double.parseDouble(input[2]));
            people.add(student);
        }
        people = people.stream().sorted(Comparator.comparingDouble(Students::getScore)).collect(Collectors.toList());
        Collections.reverse(people);

        for (Students students : people) {
            System.out.println(students.toString());
        }
    }
}
