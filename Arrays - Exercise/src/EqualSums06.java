import java.util.Arrays;
import java.util.Scanner;

public class EqualSums06 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] one = Arrays.stream(scan.nextLine().split(" "))
                .mapToInt(e -> Integer.parseInt(e))
                .toArray();

        boolean result = true;
        for (int i = 0; i < one.length; i++) {
            int leftSum = 0;
            int rightSum = 0;
            for (int j = 0; j < i; j++) {
                leftSum += one[j];
            }
            for (int k = i + 1; k <= one.length - 1; k++) {
                rightSum += one[k];
            }
            if (leftSum == rightSum) {
                System.out.println(i);
                result = false;
            }
        }
        if (result) {
            System.out.println("no");
        }
    }
}
