import java.util.Scanner;

public class ZigZagArrays03 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = Integer.parseInt(scan.nextLine());

        String[] array = new String[n];
        for (int i = 0; i < array.length; i++) {
            array[i] = scan.nextLine();
        }
        int[] one = new int[n];
        int[] two = new int[n];

        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) {
                one[i] = Integer.parseInt(array[i].split(" ")[0]);
                two[i] = Integer.parseInt(array[i].split(" ")[1]);
            } else {
                one[i] = Integer.parseInt(array[i].split(" ")[1]);
                two[i] = Integer.parseInt(array[i].split(" ")[0]);
            }
        }
        for (int a : one) {
            System.out.print(a + " ");
        }
        System.out.println();
        for (int a : two) {
            System.out.print(a + " ");
        }
    }
}
