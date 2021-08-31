import java.util.Scanner;

public class CalculateRectangleArea06 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double a = Double.parseDouble(scan.nextLine());
        double h = Double.parseDouble(scan.nextLine());
        double area = sum(a, h);
        System.out.printf("%.0f", area);
    }

    private static double sum(double a, double h) {
        return a * h;
    }
}
