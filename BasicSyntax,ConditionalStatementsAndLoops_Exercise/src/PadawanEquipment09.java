import java.util.Scanner;

public class PadawanEquipment09 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double budget = Double.parseDouble(scan.nextLine());
        int count = Integer.parseInt(scan.nextLine());
        double priceLight = Double.parseDouble(scan.nextLine());
        double priceRobe = Double.parseDouble(scan.nextLine());
        double priceBelt = Double.parseDouble(scan.nextLine());

        double sumLight = Math.ceil(count + 0.10 * count) * priceLight;
        double sumRobes = count * priceRobe;
        double sumBelts = (count - count / 6) * priceBelt;

        double total = sumLight + sumRobes + sumBelts;

        if(total <= budget) {
            System.out.printf("The money is enough - it would cost %.2flv.", total);
        } else {
            double money = total - budget;
            System.out.printf("George Lucas will need %.2flv more.", money);
        }

    }
}
