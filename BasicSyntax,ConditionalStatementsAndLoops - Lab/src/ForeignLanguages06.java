import java.util.Scanner;

public class ForeignLanguages06 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String cutnry = scan.nextLine();
        switch (cutnry) {
            case "England":
            case "USA":
                System.out.println("English");
                break;
            case "Spain":
            case "Argentina":
            case "Mexico":
                System.out.println("Spanish");
                break;
            default:
                System.out.println("unknown");
        }
    }
}
