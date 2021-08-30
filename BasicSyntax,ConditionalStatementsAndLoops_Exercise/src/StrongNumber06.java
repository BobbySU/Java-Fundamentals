import java.util.Scanner;

public class StrongNumber06 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = Integer.parseInt(scan.nextLine());
        int sum = 0;
        int n1 = n;
        while (n != 0) {
            int lastDigit = n % 10;
            int fact = 1;
            for (int i = 1; i <= lastDigit; i++) {
                fact = fact * i;
            }
            sum += fact;
            n = n / 10;
        }
        if (n1 == sum) {
            System.out.println("yes");
        } else {
            System.out.println("no");
        }
    }
}
