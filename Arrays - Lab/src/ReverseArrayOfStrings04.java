import java.util.Scanner;

public class ReverseArrayOfStrings04 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String n[] = scan.nextLine().split(" ");
        String name[] = new String[n.length];
        for (int i = n.length - 1; i >= 0; i--) {
            name[n.length - i - 1] = n[i];
        }
        for (int i = 0; i < name.length; i++) {
            System.out.print(name[i] + " ");
        }
    }
}
