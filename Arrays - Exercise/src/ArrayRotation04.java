import java.util.Arrays;
import java.util.Scanner;

public class ArrayRotation04 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] one = Arrays.stream(scan.nextLine().split(" "))
                .mapToInt(e -> Integer.parseInt(e))
                .toArray();
        int n = Integer.parseInt(scan.nextLine());
        for (int i = 1; i <= n; i++) {
            int number = one[0];
            for (int j = 0; j < one.length - 1; j++) {
                one[j] = one[j + 1];
            }
            one[one.length - 1] = number;
        }
        for (int a : one) {
            System.out.print(a + " ");
        }
    }
}
