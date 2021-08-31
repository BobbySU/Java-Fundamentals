import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ListManipulationAdvanced05 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        List<Integer> num = Arrays.stream(scan.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        String input = scan.nextLine();
        while (!input.equals("end")) {
            String[] comand = input.split(" ");
            String comandIndex = comand[0];
            switch (comandIndex) {
                case "Contains":
                    int c = Integer.parseInt(comand[1]);
                    if (num.contains(c)) {
                        System.out.println("Yes");
                    } else {
                        System.out.println("No such number");
                    }
                    break;
                case "Print":
                    if (comand[1].equals("even")) {
                        printEven(num);
                    } else {
                        printOdd(num);
                    }
                    break;
                case "Get":
                    printSum(num);
                    break;
                case "Filter":
                    String ch = comand[1];
                    int n = Integer.parseInt(comand[2]);
                    filter(num, ch, n);
                    break;
            }
            input = scan.nextLine();
        }
    }

    private static void filter(List<Integer> num, String ch, int n) {
        for (int i = 0; i < num.size(); i++) {
            switch (ch) {
                case ">=":
                    if (num.get(i) >= n) {
                        System.out.print(num.get(i) + " ");
                    }
                    break;
                case "<=":
                    if (num.get(i) <= n) {
                        System.out.print(num.get(i) + " ");
                    }
                    break;
                case ">":
                    if (num.get(i) > n) {
                        System.out.print(num.get(i) + " ");
                    }
                    break;
                case "<":
                    if (num.get(i) < n) {
                        System.out.print(num.get(i) + " ");
                    }
                    break;
            }
        }
        System.out.println();
    }

    private static void printSum(List<Integer> num) {
        int sum = 0;
        for (int i = 0; i < num.size(); i++) {
            int number = num.get(i);
            sum += number;
        }
        System.out.println(sum);
    }

    private static void printOdd(List<Integer> num) {
        for (int i = 0; i < num.size(); i++) {
            if (num.get(i) % 2 != 0) {
                System.out.print(num.get(i) + " ");
            }
        }
        System.out.println();
    }

    private static void printEven(List<Integer> num) {
        for (int i = 0; i < num.size(); i++) {
            if (num.get(i) % 2 == 0) {
                System.out.print(num.get(i) + " ");
            }
        }
        System.out.println();
    }
}