import java.util.Arrays;
import java.util.Scanner;

public class Train01 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = Integer.parseInt(scan.nextLine());
        int[] array = new int[n];
        for (int i = 0; i < array.length; i++) {
            array[i] = Integer.parseInt(scan.nextLine());
        }
        int sum = 0;
        for (int num : array) {
            System.out.print(num + " ");
            sum += num;
        }
        System.out.println();
        System.out.println(sum);
    }
}
