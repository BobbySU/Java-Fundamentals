import java.util.Scanner;

public class RepeatString07 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String input = scan.nextLine();
        int n = Integer.parseInt(scan.nextLine());
        System.out.println(printString(input, n));
    }

    private static String printString(String input, int n) {
        String result = "";
        for (int i = 0; i < n; i++) {
            result = result + input;
        }
        return result;
    }
}
