import java.util.Scanner;

public class SmallestOfThreeNumbers01 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int a = Integer.parseInt(scan.nextLine());
        int b = Integer.parseInt(scan.nextLine());
        int c = Integer.parseInt(scan.nextLine());
        System.out.println(small(a, b, c));
    }

    private static int small(int a, int b, int c) {
        int small = Math.min(a, b);
        small = Math.min(small, c);
        return small;
    }
}
