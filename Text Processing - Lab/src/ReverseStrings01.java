import java.util.Scanner;

public class ReverseStrings01 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String input = scan.nextLine();
        while (!input.equals("end")) {
            StringBuilder revers = new StringBuilder();
            for (int i = input.length() - 1; i >= 0; i--) {
                revers = revers.append(input.charAt(i));
            }
            System.out.printf("%s = %s%n", input, revers);
            input = scan.nextLine();
        }
    }
}
