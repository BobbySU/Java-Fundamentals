import java.util.Scanner;

public class ExtractFile03 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String input = scan.nextLine();

        System.out.println("File name: " + input.substring(input.lastIndexOf('\\') + 1, input.lastIndexOf('.')));
        System.out.println("File extension: " + input.substring(input.lastIndexOf('.') + 1));
    }
}
