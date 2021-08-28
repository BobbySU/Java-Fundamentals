import java.util.Scanner;

public class TheatrePromotion07 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String day = scan.nextLine();
        int age = Integer.parseInt(scan.nextLine());
        int price = 0;

        switch (day) {
            case "Weekday":
                if ((0 <= age && age <= 18) || (64 < age && age <= 122)) {
                    price = 12;
                } else if (18 < age && age <= 64) {
                    price = 18;
                }
                break;
            case "Weekend":
                if ((0 <= age && age <= 18) || (64 < age && age <= 122)) {
                    price = 15;
                } else if (18 < age && age <= 64) {
                    price = 20;
                }
                break;
            case "Holiday":
                if (0 <= age && age <= 18) {
                    price = 5;
                } else if (18 < age && age <= 64) {
                    price = 12;
                } else if (64 < age && age <= 122) {
                    price = 10;
                }
                break;
        }
        if (price > 0) {
            System.out.println(price + "$");
        } else {
            System.out.println("Error!");
        }
    }
}
