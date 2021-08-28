import java.util.Scanner;

public class RefactorSumOfOddNumbers13 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = Integer.parseInt(scan.nextLine());
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            int a =2 * i - 1;
            System.out.println(a);
            sum +=a;
        }
        System.out.printf("Sum: %d%n", sum);
    }
}
