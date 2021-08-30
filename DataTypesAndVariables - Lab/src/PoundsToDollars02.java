import java.util.Scanner;

public class PoundsToDollars02 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double pund = Double.parseDouble(scan.nextLine());
        double usd = pund*1.31;
        System.out.printf("%.3f",usd);
    }
}
