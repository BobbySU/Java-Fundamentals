import java.util.Arrays;
import java.util.Scanner;

public class TopIntegers05 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] one = Arrays.stream(scan.nextLine().split(" "))
                .mapToInt(e -> Integer.parseInt(e))
                .toArray();

        for (int i = 0; i < one.length - 1; i++) {
            if (one[i] > one[i + 1]) {
                if (one[i] > one[one.length - 1]) {
                    System.out.print(one[i] + " ");
                }
            }
        }
        System.out.print(one[one.length - 1]);
        System.out.println();
    }
}
