import java.util.Scanner;

public class FactorialDivision08 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int a = Integer.parseInt(scan.nextLine());
        int b = Integer.parseInt(scan.nextLine());

        System.out.printf("%.2f", (double) factorial(a) / factorial(b));
    }

    private static long factorial(int n) {
        if (n == 0)
            return 1;
        else
            return (n * factorial(n - 1));
    }
}
