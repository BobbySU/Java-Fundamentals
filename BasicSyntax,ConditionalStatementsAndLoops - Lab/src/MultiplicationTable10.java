import java.util.Scanner;

public class MultiplicationTable10 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = Integer.parseInt(scan.nextLine());

        for (int i = 1; i <=10 ; i++) {
            int sum=n*i;
            System.out.printf("%d X %d = %d%n",n,i,sum);
        }
    }
}
