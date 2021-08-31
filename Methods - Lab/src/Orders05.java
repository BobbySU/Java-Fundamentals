import java.util.Scanner;

public class Orders05 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String input = scan.nextLine();
        int n = Integer.parseInt(scan.nextLine());
        chek(input, n);
    }

    private static void chek(String input, int n) {
        double price = 0;
        switch (input) {
            case "coffee":
                price = 1.50;
                print(n, price);
                break;
            case "water":
                price = 1.00;
                print(n, price);
                break;
            case "coke":
                price = 1.40;
                print(n, price);
                break;
            case "snacks":
                price = 2.00;
                print(n, price);
                break;
        }
    }

    private static void print(int n, double price) {
        System.out.printf("%.2f", n * price);
    }
}
