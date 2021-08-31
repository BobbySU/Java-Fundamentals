package Articles02;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String[] input = scan.nextLine().split(", ");
        int n = Integer.parseInt(scan.nextLine());

        Articles article = new Articles(input[0], input[1], input[2]);

        for (int i = 0; i < n; i++) {
            String[] comand = scan.nextLine().split(": ");
            switch (comand[0]) {
                case "Edit":
                    article.setContent(comand[1]);
                    break;
                case "ChangeAuthor":
                    article.setAuthor(comand[1]);
                    break;
                case "Rename":
                    article.setTitle(comand[1]);
                    break;
            }
        }
        System.out.println(article.toString());
    }
}
