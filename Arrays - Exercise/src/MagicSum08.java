import java.util.Arrays;
import java.util.Scanner;

public class MagicSum08 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] one = Arrays.stream(scan.nextLine().split(" "))
                .mapToInt(e -> Integer.parseInt(e))
                .toArray();
        int n = Integer.parseInt(scan.nextLine());

        for (int i = 0; i < one.length - 1; i++) {
            for (int j = i + 1; j < one.length; j++) {
                if (one[i] + one[j] == n) {
                    System.out.println(one[i] + " " + one[j]);
                }
            }
        }
    }
}
