import java.util.Arrays;
import java.util.Scanner;

public class CondenseArrayToNumber07 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int sum = 0;
            int[] one = Arrays.stream(scan.nextLine().split(" "))
                    .mapToInt(Integer::parseInt)
                    .toArray();
            if (one.length == 1) {
                sum = one[0];
            }else if (one.length == 2) {
                sum = one[0] + one[1];
            }else {
            while (one.length != 2) {
                int[] condensed = new int[one.length - 1];
                for (int i = 0; i < one.length - 1; i++) {
                    condensed[i] = one[i] + one[i + 1];
                    if (condensed.length == 2) {
                        sum += condensed[i];
                    }
                }
                one = condensed;
            }
        }
        System.out.println(sum);
    }
}
