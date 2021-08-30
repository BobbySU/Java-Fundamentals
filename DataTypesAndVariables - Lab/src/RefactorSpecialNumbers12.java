import java.util.Scanner;

public class RefactorSpecialNumbers12 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int num = Integer.parseInt(scan.nextLine());
        for (int ch = 1; ch <= num; ch++) {
            int sum = 0;
            int n = ch;
            while (ch > 0) {
                sum += ch % 10;
                ch = ch / 10;
            }
            ch = n;
            if((sum == 5) || (sum == 7) || (sum == 11)){
                System.out.printf("%d -> True%n", n);
            }else {
                System.out.printf("%d -> False%n", n);
            }
        }
    }
}
