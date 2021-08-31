import java.util.Scanner;

public class NxNMatrix07 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = Integer.parseInt(scan.nextLine());
        print(n);
    }

    private static void print(int n) {
        for (int i = 1; i <= n; i++) {
            printLine(n);
        }
    }

    private static void printLine(int n) {
        for (int j = 1; j <= n; j++) {
            System.out.print(n + " ");
        }
        System.out.println();
    }
}
