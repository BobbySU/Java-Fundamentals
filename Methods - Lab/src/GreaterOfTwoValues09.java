import java.util.Scanner;

public class GreaterOfTwoValues09 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String input = scan.nextLine();
        switch (input) {
            case "string":
                String a = scan.nextLine();
                String b = scan.nextLine();
                System.out.println(getMax(a, b));
                break;
            case "char":
                char c = scan.nextLine().charAt(0);
                char d = scan.nextLine().charAt(0);
                System.out.println(getMax(c, d));
                break;
            case "int":
                int e = Integer.parseInt(scan.nextLine());
                int f = Integer.parseInt(scan.nextLine());
                System.out.println(getMax(e, f));
                break;
        }
    }

    private static char getMax(char a, char b) {
        if (a > b) {
            return a;
        }
        return b;
    }

    private static String getMax(String a, String b) {
        if (a.compareTo(b) >= 0) {
            return a;
        }
        return b;
    }

    private static int getMax(int a, int b) {
        if (a > b) {
            return a;
        }
        return b;
    }
}
