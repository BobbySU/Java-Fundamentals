import java.math.BigInteger;
import java.util.Scanner;

public class BigFactorial03 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int factural = Integer.parseInt(scan.nextLine());

        BigInteger big = new BigInteger("1");
        for (int i = 1; i <= factural; i++) {
            big = big.multiply(new BigInteger(String.valueOf(i)));
        }
        System.out.println(big);
    }
}
