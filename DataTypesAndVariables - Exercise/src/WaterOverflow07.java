import java.util.Scanner;

public class WaterOverflow07 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = Integer.parseInt(scan.nextLine());
        int capacity = 255;
        int all = 0;

        for (int i = 1; i <= n; i++) {
            int in = Integer.parseInt(scan.nextLine());
            all += in;
            if (capacity < all) {
                System.out.println("Insufficient capacity!");
                all -= in;
            }
        }
        System.out.println(all);
    }
}

