import java.util.Scanner;

public class DayOfWeek01 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String[] n = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday",
                "Saturday", "Sunday"};

        int day = Integer.parseInt(scan.nextLine());
        if (day >= 1 && day <= 7) {
            System.out.println(n[day - 1]);
        } else {
            System.out.println("Invalid day!");
        }
    }
}
