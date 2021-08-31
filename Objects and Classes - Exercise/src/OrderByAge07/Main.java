package OrderByAge07;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        List<Person07> people = new ArrayList<>();
        String input = scan.nextLine();
        while (!input.equals("End")) {
            String[] list = input.split("\\s+");
            Person07 person07 = new Person07(list[0], list[1], Integer.parseInt(list[2]));
            people.add(person07);
            input = scan.nextLine();
        }
        people.sort(Comparator.comparingInt(Person07::getAge));
        for (Person07 person : people) {
            System.out.println(person.toString());
        }
    }
}
