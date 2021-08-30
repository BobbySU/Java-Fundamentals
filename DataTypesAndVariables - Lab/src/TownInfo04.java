import java.util.Scanner;

public class TownInfo04 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String city =scan.nextLine();
        int people = Integer.parseInt(scan.nextLine());
        double m= Double.parseDouble(scan.nextLine());

        System.out.printf("Town %s has population of %d and area %.0f square km.",city,people,m);

    }
}
