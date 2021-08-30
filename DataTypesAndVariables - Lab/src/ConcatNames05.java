import java.util.Scanner;

public class ConcatNames05 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String a = scan.nextLine();
        String b = scan.nextLine();
        String c = scan.nextLine();
        String sum = a + c + b;
        System.out.println(sum);
    }
}
