import java.util.Arrays;
import java.util.Scanner;

public class MaxSequenceOfEqualElements07 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] one = Arrays.stream(scan.nextLine().split(" "))
                .mapToInt(e -> Integer.parseInt(e))
                .toArray();

        int longht = 1;
        int longhtMax = 0;

        int start = 0;
        int best = 0;
        for (int i = 1; i < one.length; i++) {
            if (one[i] == one[i - 1]) {
                longht++;
            } else {
                longht = 1;
                start = i;
            }
            if (longht > longhtMax) {
                longhtMax = longht;
                best = start;
            }
        }
        for (int i = best; i < best + longhtMax; i++) {
            System.out.print(one[i] + " ");
        }
    }
}
