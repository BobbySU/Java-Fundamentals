import java.util.Arrays;
import java.util.Scanner;

public class EvenAndOddSubtraction05 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String in = scan.nextLine();
        String[] items = in.split(" ");
        int[] arr = Arrays.stream(items)
                .mapToInt(e -> Integer.parseInt(e)).toArray();
        int odd = 0;
        int even = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                even += arr[i];
            } else {
                odd += arr[i];
            }
        }
        System.out.println(even - odd);
    }
}
