import java.util.Scanner;

public class PrintAndSum04 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int a = Integer.parseInt(scan.nextLine());
        int b = Integer.parseInt(scan.nextLine());

        int total = 0;
        for (int i = a; i <=b ; i++) {
            System.out.print(i+" ");
            total+=i;
        }
        System.out.println();
        System.out.printf("Sum: %d",total);
    }
}
