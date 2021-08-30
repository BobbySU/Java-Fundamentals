import java.util.Scanner;

public class PrintPartOfASCIITable05 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = Integer.parseInt(scan.nextLine());
        int m = Integer.parseInt(scan.nextLine());

        for (int i = n; i <= m; i++) {
            char a = (char) i;
            System.out.print(a+" ");
        }
    }
}
