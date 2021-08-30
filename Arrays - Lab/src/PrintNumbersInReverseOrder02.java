import java.util.Scanner;

public class PrintNumbersInReverseOrder02 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = Integer.parseInt(scan.nextLine());
        int num[] = new int[n];
        for (int i = 0; i <num.length ; i++) {
            int number =Integer.parseInt(scan.nextLine());
            num[i]=number;
        }
        for (int i = num.length-1; i >=0 ; i--) {
            System.out.print(num[i]+" ");
        }
    }
}
