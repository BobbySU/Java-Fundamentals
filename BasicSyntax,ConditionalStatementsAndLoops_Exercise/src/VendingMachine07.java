import java.util.Scanner;

public class VendingMachine07 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String command = scan.nextLine();
        double money = 0;
        boolean invalid=true;

        while (!command.equals("Start")) {
            double moneyIn = Double.parseDouble(command);
            if (moneyIn == 2 || moneyIn == 1 || moneyIn == 0.5 || moneyIn == 0.2 || moneyIn == 0.1) {
                money += moneyIn;
            } else {
                System.out.printf("Cannot accept %.2f%n", moneyIn);
            }
            command = scan.nextLine();
        }
        command = scan.nextLine();
        while (!command.equals("End")) {
            double price=0;
            switch (command) {
                case "Nuts":
                    price=2;
                    break;
                case "Water":
                    price=0.7;
                    break;
                case "Crisps":
                    price=1.5;
                    break;
                case "Soda":
                    price=0.8;
                    break;
                case "Coke":
                    price=1;
                    break;
                default:
                    System.out.println("Invalid product");
                    invalid=false;
                    break;
            }
            if (!invalid){

            }else if (money >= price) {
                System.out.printf("Purchased %s%n", command);
                money-=price;
            }else {
                System.out.println("Sorry, not enough money");
            }
            command = scan.nextLine();
        }
        System.out.printf("Change: %.2f%n", money);
    }
}
