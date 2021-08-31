import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ListOperations04 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        List<Integer> num = Arrays.stream(scan.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        String input = scan.nextLine();
        while (!input.equals("End")) {
            String[] comand = input.split(" ");
            String comandIndex = comand[0];
            switch (comandIndex) {
                case "Add":
                    int d = Integer.parseInt(comand[1]);
                    num.add(d);
                    break;
                case "Insert":
                    int n = Integer.parseInt(comand[1]);
                    int p = Integer.parseInt(comand[2]);
                    if (iSize(num, p)) {
                        num.add(p, n);
                    } else {
                        System.out.println("Invalid index");
                    }
                    break;
                case "Remove":
                    int i = Integer.parseInt(comand[1]);
                    if (iSize(num, i)) {
                        num.remove(i);
                    } else {
                        System.out.println("Invalid index");
                    }
                    break;
                case "Shift":
                    String side = comand[1];
                    int count = Integer.parseInt(comand[2]);
                    if (side.equals("left")) {
                        shiftLeft(num, count);
                    } else if (side.equals("right")) {
                        shiftRight(num, count);
                    }
                    break;
            }
            input = scan.nextLine();
        }
        System.out.println(num.toString().replaceAll("[\\[\\],]", ""));

    }

    private static void shiftLeft(List<Integer> num, int count) {
        for (int i = 0; i < count; i++) {
            int n = num.get(0);
            num.add(n);
            num.remove(0);
        }
    }

    private static void shiftRight(List<Integer> num, int count) {
        for (int i = 0; i < count; i++) {
            int n = num.get(num.size() - 1);
            num.add(0, n);
            num.remove(num.size() - 1);
        }
    }

    private static boolean iSize(List num, int i) {
        return i >= 0 && i < num.size();
    }
}
