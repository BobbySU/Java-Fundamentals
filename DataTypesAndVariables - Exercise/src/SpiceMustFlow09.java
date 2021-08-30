import java.util.Scanner;

public class SpiceMustFlow09 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = Integer.parseInt(scan.nextLine());

        int days = 0;
        int total = 0;
        while (n >= 100) {
            int Spices = n - 26;
            total += Spices;
            n -= 10;
            days++;
        }
        System.out.println(days);
        if (total >= 26) {
            total -= 26;
        }
        System.out.println(total);
    }
}
