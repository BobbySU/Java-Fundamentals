import java.text.DecimalFormat;
import java.util.Scanner;

public class MathPower08 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        DecimalFormat decimalFormat = new DecimalFormat("0.####");

        double n = Double.parseDouble(scan.nextLine());
        int p = Integer.parseInt(scan.nextLine());
        System.out.println(decimalFormat.format(power(n, p)));
    }

    private static double power(double n, int p) {
        double sum = 1;
        for (int i = 1; i <= p; i++) {
            sum = sum * n;
        }
        return sum;
    }
}


