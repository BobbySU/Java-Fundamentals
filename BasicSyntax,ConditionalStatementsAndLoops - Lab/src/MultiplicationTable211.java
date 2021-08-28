import java.util.Scanner;

public class MultiplicationTable211 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = Integer.parseInt(scan.nextLine());
        int x = Integer.parseInt(scan.nextLine());
        if (x>10){
            int sum = n * x;
            System.out.printf("%d X %d = %d%n", n, x, sum);
        }else {
        for (int i = x; i <=10 ; i++) {
            int sum = n * i;
            System.out.printf("%d X %d = %d%n", n, i, sum);
            }
        }
    }
}
