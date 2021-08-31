import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class GaussTrick02 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        List<Integer> num = Arrays.stream(scan.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());
        int size = num.size() / 2;
        for (int i = 0; i < size; i++) {
            num.set(i, num.get(i) + num.get(num.size() - 1));
            num.remove(num.size() - 1);
        }
        for (int i = 0; i < num.size(); i++) {
            System.out.print(num.get(i) + " ");
        }
    }
}

