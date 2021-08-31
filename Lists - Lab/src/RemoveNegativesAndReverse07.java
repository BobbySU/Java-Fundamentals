import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class RemoveNegativesAndReverse07 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        List<Integer> num = Arrays.stream(scan.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());
        num = remuveNegativ(num);
        Collections.reverse(num);
        if (num.isEmpty()) {
            System.out.println("empty");
        } else {
            print(num);
        }
    }

    private static void print(List<Integer> num) {
        System.out.println(num.toString().replaceAll("[\\[\\],]", ""));
    }

    private static List<Integer> remuveNegativ(List<Integer> num) {
        for (int i = 0; i < num.size(); i++) {
            int element = num.get(i);
            if (element < 0) {
                num.remove(i);
                i--;
            }
        }
        return num;
    }
}
