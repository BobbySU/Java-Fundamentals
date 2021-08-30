import java.util.Arrays;
import java.util.Scanner;

public class CommonElements02 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String[] one = scan.nextLine().split(" ");
        String[] two = scan.nextLine().split(" ");
        for (int i = 0; i <two.length ; i++) {
            for (int j = 0; j <one.length ; j++) {
                if (two[i].equals(one[j])){
                    System.out.print(two[i] + " ");
                }
            }
        }
    }
}
