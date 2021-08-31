package Students005;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String input = scan.nextLine();
        List<Students> students = new ArrayList<>();
        while (!input.equals("end")) {
            String[] data = input.split(" ");

            String first = data[0];
            String last = data[1];
            int age = Integer.parseInt(data[2]);
            String city = data[3];

            Students student = new Students(first, last, age, city);
            students.add(student);

            input = scan.nextLine();
        }
        String filter = scan.nextLine();
        for (Students s : students) {
            if (s.getCity().equals(filter)) {
                System.out.printf("%s %s is %d years old%n", s.getFirst(), s.getLast(), s.getAge());
            }
        }
    }
}
