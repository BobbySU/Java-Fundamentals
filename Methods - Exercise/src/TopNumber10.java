import java.util.Scanner;

public class TopNumber10 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = Integer.parseInt(scan.nextLine());
        printNum(n);
    }

    private static void printNum(int n) {
        for (int i = 1; i <= n; i++) {
            if (divided(i) && odd(i)) {
                System.out.println(i);
            }
        }
    }

    private static boolean odd(int n) {
        while (n > 0) {
            int index = n % 10;
            if (index % 2 != 0) {
                return true;
            }
            n = n / 10;
        }
        return false;
    }

    private static boolean divided(int n) {
        int sum = 0;
        while (n > 0) {
            int index = n % 10;
            sum += index;
            n = n / 10;
        }
        if (sum % 8 == 0) {
            return true;
        }
        return false;
    }
}
