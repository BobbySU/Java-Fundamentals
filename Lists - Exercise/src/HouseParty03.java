import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class HouseParty03 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        List<String> name = new ArrayList<>();
        int n = Integer.parseInt(scan.nextLine());

        for (int i = 0; i < n; i++) {
            String input = scan.nextLine();
            String[] comand = input.split(" ");
            String comandIndex = comand[2];
            switch (comandIndex) {
                case "going!":
                    if (name.contains(comand[0])) {
                        System.out.printf("%s is already in the list!%n", comand[0]);
                    } else {
                        String a = comand[0];
                        name.add(a);
                    }
                    break;
                case "not":
                    if (!name.contains(comand[0])) {
                        System.out.printf("%s is not in the list!%n", comand[0]);
                    } else {
                        String r = comand[0];
                        name.remove(r);
                    }
                    break;
            }
        }
        for (String num : name) {
            System.out.println(num);
        }
    }
}
