import java.util.Scanner;

public class SumEvenNumbers03 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String name = scan.nextLine();
        String names[] = name.split(" ");
        int n[] = new int[names.length];
        for (int i = 0; i < n.length; i++) {
            n[i] = Integer.parseInt(names[i]);
        }
        int sum = 0;
        for (int i = 0; i < n.length; i++) {
            if (n[i] % 2 == 0) {
                sum += n[i];
            }
        }
        System.out.print(sum);
    }
}
