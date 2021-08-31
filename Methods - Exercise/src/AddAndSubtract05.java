import java.util.Scanner;

public class AddAndSubtract05 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int a = Integer.parseInt(scan.nextLine());
        int b = Integer.parseInt(scan.nextLine());
        int c = Integer.parseInt(scan.nextLine());

        int sumAB = sum(a, b);
        System.out.print(subtract(sumAB, c));
    }

    private static int sum(int a, int b) {
        return a + b;
    }

    private static int subtract(int sumAB, int c) {
        return sumAB - c;
    }
}
