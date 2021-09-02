import java.util.Scanner;

public class DigitsLettersAndOther05 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String text = scan.nextLine();

        StringBuilder digits = new StringBuilder();
        StringBuilder letter = new StringBuilder();
        StringBuilder symbol = new StringBuilder();

        for (int i = 0; i < text.length(); i++) {
            char charInText = text.charAt(i);
            if (Character.isDigit(charInText)) {
                digits.append(charInText);
            } else if (Character.isLetter(charInText)) {
                letter.append(charInText);
            } else {
                symbol.append(charInText);
            }
        }
        System.out.println(digits);
        System.out.println(letter);
        System.out.println(symbol);
    }
}
