import java.util.Scanner;

public class CharacterMultiplier02 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String[] words = scan.nextLine().split(" ");

        if (words[0].length() >= words[1].length()) {
            printSum(words[0], words[1]);
        } else {
            printSum(words[1], words[0]);
        }
    }

    private static void printSum(String wordBig, String wordSmol) {
        Double sum = 0.0;
        for (int i = 0; i < wordSmol.length(); i++) {
            int big = wordBig.charAt(i);
            int smol = wordSmol.charAt(i);
            sum += big * smol;
        }
        for (int i = wordSmol.length(); i < wordBig.length(); i++) {
            sum += wordBig.charAt(i);
        }
        System.out.printf("%.0f", sum);
    }
}
