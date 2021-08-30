import java.util.Scanner;

public class PokeMon10 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double n = Double.parseDouble(scan.nextLine());
        double m = Double.parseDouble(scan.nextLine());
        int y = Integer.parseInt(scan.nextLine());

        int count = 0;
        double pokePowerN = n;

        while (n >= m) {
            n -= m;
            count++;
            if (n == (pokePowerN / 2)) {
                n = (int) n;
                if ((n / y) != 0) {
                    n /= y;
                }
            }
        }
        System.out.println((int) n);
        System.out.println(count);
    }
}
