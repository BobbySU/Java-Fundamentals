import java.util.Scanner;

public class ConvertMetersToKilometers01 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int m = Integer.parseInt(scan.nextLine());
        double km =m/1000.0;
        System.out.printf("%.2f",km);
    }
}
