import java.util.Scanner;

public class Snowballs11 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = Integer.parseInt(scan.nextLine());

        int maxSnow = Integer.MIN_VALUE;
        int maxTime = Integer.MIN_VALUE;
        int maxQuality = Integer.MIN_VALUE;
        double maxValue = Double.MIN_VALUE;

        for (int i = 0; i < n; i++) {
            int snowSnow = Integer.parseInt(scan.nextLine());
            int snowTime = Integer.parseInt(scan.nextLine());
            int snowQuality = Integer.parseInt(scan.nextLine());
            double snowballValue = Math.pow((snowSnow / snowTime), snowQuality);

            if (maxValue < snowballValue) {
                maxValue = snowballValue;
                maxSnow = snowSnow;
                maxTime = snowTime;
                maxQuality = snowQuality;
            }
        }
        System.out.printf("%d : %d = %.0f (%d)", maxSnow, maxTime, maxValue, maxQuality);
    }
}
