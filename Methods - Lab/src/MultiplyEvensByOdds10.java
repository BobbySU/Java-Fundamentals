import java.util.Scanner;

public class MultiplyEvensByOdds10 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = Math.abs(Integer.parseInt(scan.nextLine()));
        System.out.println(multiplay(n));
    }

    private static int multiplay(int n) {
        int oddSum = odd(n);
        int evenSum = even(n);
        return oddSum * evenSum;
    }

    private static int even(int n) {
        int sum = 0;
        while (n > 0) {
            int digit = n % 10;
            if (digit % 2 == 0) {
                sum += digit;
            }
            n = n / 10;
        }
        return sum;
    }

    private static int odd(int n) {
        int sum = 0;
        while (n > 0) {
            int digit = n % 10;
            if (digit % 2 != 0) {
                sum += digit;
            }
            n = n / 10;
        }
        return sum;
    }
}
