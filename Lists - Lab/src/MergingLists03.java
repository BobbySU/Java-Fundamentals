import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class MergingLists03 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        List<Integer> one = Arrays.stream(scan.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());
        List<Integer> two = Arrays.stream(scan.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        int small = Math.min(one.size(), two.size());
        for (int i = 0; i < small; i++) {
            System.out.print(one.get(i) + " " + two.get(i) + " ");
        }
        printAll(one, small);
        printAll(two, small);
    }

    private static void printAll(List<Integer> num, int small) {
        for (int i = small; i < num.size(); i++) {
            System.out.print(num.get(i) + " ");
        }
    }
}
