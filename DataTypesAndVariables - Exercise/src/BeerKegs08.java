import java.util.Scanner;

public class BeerKegs08 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = Integer.parseInt(scan.nextLine());

        String big = "";
        double v = Double.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            String keg = scan.nextLine();
            double r = Double.parseDouble(scan.nextLine());
            int h = Integer.parseInt(scan.nextLine());
            if (v < (Math.PI * (r * r) * h)) {
                big = keg;
                v = Math.PI * (r * r) * h;
            }
        }
        System.out.println(big);
    }
}
