package OpinionPoll03;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = Integer.parseInt(scan.nextLine());
        List<Person> people = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            String[] input = scan.nextLine().split("\\s+");
            Person person = new Person(input[0], Integer.parseInt(input[1]));
            people.add(person);
        }
        people = people.stream().filter(person -> person.getAge() > 30).collect(Collectors.toList());
        people.sort(Comparator.comparing(Person::getName));
        for (Person person : people) {
            System.out.println(person.getName() + " - " + person.getAge());
        }
    }
}
