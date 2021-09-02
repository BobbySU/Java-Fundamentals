import java.util.Scanner;

public class LettersChangeNumbers08 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String[] input = scan.nextLine().split("\\s+");

        double totalSum = 0;
        for (String e : input) {
            totalSum += sumElement(e);
        }
        System.out.printf("%.2f", totalSum);
    }

    private static double sumElement(String e) {
        char a = e.charAt(0);
        char b = e.charAt(e.length() - 1);
        double num = Double.parseDouble(e.substring(1, e.lastIndexOf(b))); // защото а==b -> (1,0)-Грешка
//        първи начин:
//        double num = Double.parseDouble(e.replace(a, ' ').replace(b, ' ').trim());
//        втори начин:
//        StringBuilder builder = new StringBuilder(e);
//        double num = Double.parseDouble(builder.deleteCharAt(0).deleteCharAt(builder.length() - 1).toString());
        if (Character.isUpperCase(a)) {
            int plase = (int) a - 64;
            num = num / plase;
        } else {
            int plase = (int) a - 96;
            num = num * plase;
        }
        if (Character.isUpperCase(b)) {
            int plase = (int) b - 64;
            num = num - plase;
        } else {
            int plase = (int) b - 96;
            num = num + plase;
        }
        return num;
    }
}
