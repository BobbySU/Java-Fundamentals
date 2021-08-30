import java.util.Scanner;

public class SumOfChars04 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = Integer.parseInt(scan.nextLine());
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            char a = scan.nextLine().charAt(0);
            int ch = (int) a;
            sum += ch;
        }
        System.out.printf("The sum equals: %d", sum);
    }
}
