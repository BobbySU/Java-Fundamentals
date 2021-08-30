import java.util.Arrays;
import java.util.Scanner;

public class EqualArrays06 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] one = Arrays.stream(scan.nextLine().split(" "))
                .mapToInt(e -> Integer.parseInt(e))
                .toArray();
        int[] two = Arrays.stream(scan.nextLine().split(" "))
                .mapToInt(e -> Integer.parseInt(e))
                .toArray();
        int sum = 0;
        boolean ok = true;
        for (int i = 0; i < two.length; i++) {
            sum += one[i];
            if (one[i] != two[i]) {
                System.out.printf("Arrays are not identical. Found difference at %d index.", i);
                ok = false;
                break;
            }
        }
        if (ok) {
            System.out.printf("Arrays are identical. Sum: %d", sum);
        }
    }
}
