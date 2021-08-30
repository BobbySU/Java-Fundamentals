import java.util.Scanner;

public class SpecialNumbers10 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = Integer.parseInt(scan.nextLine());

        for (int i = 1; i <= n; i++) {
            int sum = 0;
            int nomber = i;

            while (nomber > 0) {
                int current = nomber % 10;
                sum = sum + current;
                nomber = nomber / 10;
            }
            if (5 == sum || 7 == sum || 11 == sum) {
                System.out.printf("%d -> True%n", i);
            } else {
                System.out.printf("%d -> False%n", i);
            }
        }
    }
}
