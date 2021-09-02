import java.util.Scanner;

public class StringExplosion07 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        StringBuilder text = new StringBuilder(scan.nextLine());

        int range = 0;
        for (int i = 0; i < text.length(); i++) {
            if (Character.isDigit(text.charAt(i))) {
                range += Integer.parseInt(String.valueOf(text.charAt(i)));
                range = Math.min(range, text.length() - i);
                while (range != 0) {
                    if (text.charAt(i) != '>') {
                        text.deleteCharAt(i);
                    } else {
                        break;
                    }
                    range--;
                }
            }
        }
        System.out.println(text);
    }
}
