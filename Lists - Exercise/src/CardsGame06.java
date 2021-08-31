import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class CardsGame06 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        List<Integer> one = Arrays.stream(scan.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());
        List<Integer> two = Arrays.stream(scan.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        for (int i = 0; i < Math.max(one.size(), two.size()); i++) {
            if (one.get(i) > two.get(i)) {
                one.add(one.get(i));
                one.add(two.get(i));
                one.remove(i);
                two.remove(i);
            } else if (one.get(i) < two.get(i)) {
                two.add(two.get(i));
                two.add(one.get(i));
                one.remove(i);
                two.remove(i);
            } else if (one.get(i).equals(two.get(i))) {
                one.remove(i);
                two.remove(i);
            }
            i--;
            if (one.size() == 0 || two.size() == 0) {
                break;
            }
        }

        if (one.size() > two.size()) {
            int sum = sum(one);
            System.out.printf("First player wins! Sum: %d", sum);
        } else if (one.size() < two.size()) {
            int sum = sum(two);
            System.out.printf("Second player wins! Sum: %d", sum);
        } else {
            int sum = sum(one);
            System.out.printf("First player wins! Sum: %d%n", sum);
            System.out.printf("Second player wins! Sum: %d", sum);
        }
    }

    private static int sum(List<Integer> n) {
        int sum = 0;
        for (int i = 0; i < n.size(); i++) {
            sum += n.get(i);
        }
        return sum;
    }
}
