import java.util.Scanner;

public class RageExpenses10 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int count = Integer.parseInt(scan.nextLine());
        double headset = Double.parseDouble(scan.nextLine());
        double mouse = Double.parseDouble(scan.nextLine());
        double keyboard = Double.parseDouble(scan.nextLine());
        double display = Double.parseDouble(scan.nextLine());

        double total = 0;

        int countH = count / 2;
        int countM = count / 3;
        int countK = count / 6;
        int countD = count / 12;

        total = countH * headset + countM * mouse + countK * keyboard + countD * display;
        System.out.printf("Rage expenses: %.2f lv.", total);
    }
}
