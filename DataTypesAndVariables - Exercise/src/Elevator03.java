import java.util.Scanner;

public class Elevator03 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int people = Integer.parseInt(scan.nextLine());
        int n = Integer.parseInt(scan.nextLine());

        double sum = Math.ceil(people * 1.0 / n);
        System.out.printf("%.0f", sum);
    }
}
